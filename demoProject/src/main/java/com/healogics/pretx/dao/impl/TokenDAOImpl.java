package com.healogics.pretx.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healogics.pretx.dao.TokenDAO;
import com.healogics.pretx.domain.Token;

@Transactional
@Repository
public class TokenDAOImpl implements TokenDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Token token) {
		this.sessionFactory.getCurrentSession().save(token);

	}

	@Override
	public List<Token> getByUserIdAndAuthKey(Long userId, String authKey) {

		return this.sessionFactory.getCurrentSession().createNamedQuery("find_token_by_user_and_auth", Token.class)
				.setParameter("userId", userId).setParameter("authKey", authKey).setMaxResults(1).getResultList();
	}

	@Override
	public long deleteMasterToken(String authKey) {

		return this.sessionFactory.getCurrentSession().createQuery("DELETE from Token t where t.token = (:authKey)")
				.setParameter("authKey", authKey).executeUpdate();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Token> getTokenByUser(Long userId) {
		
		Query<Token> query = this.sessionFactory.getCurrentSession().createQuery("select t from Token t where t.userId = :userId");

		query.setParameter("userId", userId);

		return query.getResultList();
	}

	@Override
	public Token getLastTokenByUserId(Long userId) {

		return (Token) this.sessionFactory.getCurrentSession()
				.createQuery("from Token t where t.userId = :userId order by id desc").setParameter("userId", userId)
				.setMaxResults(1).uniqueResult();
	}

	@Override
	public int deleteTokenByDeviceId(String deviceId) {

		return this.sessionFactory.getCurrentSession().createQuery("DELETE from Token t where t.deviceId = (:deviceId)")
				.setParameter("deviceId", deviceId).executeUpdate();
	}

}
