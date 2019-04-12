package com.healogics.pretx.dao;

import java.util.List;

import com.healogics.pretx.domain.Token;

public interface TokenDAO {

	void save(Token arg0);

	List<Token> getByUserIdAndAuthKey(Long userId, String authKey);

	long deleteMasterToken(String authKey);

	List<Token> getTokenByUser(Long userId);

	Token getLastTokenByUserId(Long userId);

	int deleteTokenByDeviceId(String deviceId);
}
