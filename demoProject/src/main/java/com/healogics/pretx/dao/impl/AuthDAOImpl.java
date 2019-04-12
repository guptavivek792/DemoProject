package com.healogics.pretx.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healogics.pretx.dao.AuthDAO;
import com.healogics.pretx.domain.Auth;

@Transactional
@Repository
public class AuthDAOImpl implements AuthDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Auth getAuthByUsernamePassword(String username, String password) {
		String hql = "select distinct a from Auth a  where a.userName=:userName and a.password=:password ";
		return (Auth) this.sessionFactory.getCurrentSession().createQuery(hql).setParameter("userName", username)
				.setParameter("password", password).uniqueResult();
	}

	@Override
	public Auth getAuthByUsernamePinCode(String username, String pinCode) {
		String hql = "select distinct a from Auth a  where a.userName=:userName and a.pinCode=:pinCode ";
		return (Auth) this.sessionFactory.getCurrentSession().createQuery(hql).setParameter("userName", username)
				.setParameter("pinCode", pinCode).uniqueResult();
	}

	@Override
	public void save(Auth auth) {
		this.sessionFactory.getCurrentSession().save(auth);
	}

	@Override
	public Auth getAuthByUserName(String userName) {
		return (Auth) this.sessionFactory.getCurrentSession().createQuery("From Auth where userName=:userName")
				.setParameter("userName", userName).uniqueResult();
	}

	@Override
	public void updatePassword(String userName, String password) {
		this.sessionFactory.getCurrentSession()
				.createQuery("Update Auth set password=:password where userName=:userName")
				.setParameter("userName", userName).setParameter("password", password).executeUpdate();
	}

	@Override
	public void updatePinCode(String userName, String pinCode) {
		this.sessionFactory.getCurrentSession().createQuery("Update Auth set pinCode=:pinCode where userName=:userName")
				.setParameter("userName", userName).setParameter("pinCode", pinCode).executeUpdate();
	}

	@Override
	@Deprecated
	public Auth getAuthByHealLogicId(Long healLogicId) {
		return (Auth) this.sessionFactory.getCurrentSession().createQuery(
				"SELECT auth From Auth auth inner join fetch auth.user user where user.status=1 AND user.healogicId=:healLogicId")
				.setParameter("healLogicId", healLogicId).uniqueResult();
	}

	@Override
	public Auth validateUserName(String userName) {
		return (Auth) this.sessionFactory.getCurrentSession().createQuery("From Auth where LOWER(userName)=:userName")
				.setParameter("userName", userName.toLowerCase()).uniqueResult();
	}

}
