package com.healogics.pretx.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healogics.pretx.dao.UserDAO;
import com.healogics.pretx.domain.User;

@Transactional
@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public Long save(User user) {
		return (Long) this.sessionFactory.getCurrentSession().save(user);

	}

	@Override
	public User getUserById(Long id) {
		return (User) this.sessionFactory.getCurrentSession().createQuery("From User where id=:id and status=1")
				.setParameter("id", id).uniqueResult();
	}

	@Override
	public User getUserByHealLogicId(Long healLogicId) {
		return (User) this.sessionFactory.getCurrentSession()
				.createQuery(" From User user where user.status=1 AND user.healogicId=:healLogicId")
				.setParameter("healLogicId", healLogicId).uniqueResult();
	}

	@Override
	public Long getIhealUserIdById(Long id) {
		return (Long) this.sessionFactory.getCurrentSession()
				.createQuery("SELECT healogicId From User where id=:id and status=1").setParameter("id", id)
				.uniqueResult();
	}

	@Override
	public void updateUserRole(User user) {
		this.sessionFactory.getCurrentSession().update(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsersByType(Short userType) {
		Query<User> query = this.sessionFactory.getCurrentSession()
				.createQuery("From User where userType=:userType and status=1");
		query.setParameter("userType", userType);
		return query.list();
	}

	@Override
	public Long getUserIdByHealLogicId(Long healLogicId) {
		return (Long) this.sessionFactory.getCurrentSession()
				.createQuery(" select user.id From User user where user.healogicId=:healLogicId")
				.setParameter("healLogicId", healLogicId).uniqueResult();
	}

}
