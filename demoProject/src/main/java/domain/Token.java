package com.healogics.pretx.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@NamedQueries({
		@NamedQuery(name = "find_token_by_user_and_auth", query = "FROM Token t WHERE t.userId = :userId AND t.token = :authKey ORDER BY t.generatedon DESC") })
public class Token implements Serializable {

	private static final long	serialVersionUID	= 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long				id;

	private String				token;

	/**
	 * Token for device push notification
	 */
	private String				deviceToken;

	private Integer				deviceType;

	/**
	 * Unique for each device
	 */
	private String				deviceId;

	private LocalDateTime		generatedon;

	private Long				userId;

	private String				masterToken;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	public LocalDateTime getGeneratedon() {
		return generatedon;
	}

	public void setGeneratedon(LocalDateTime generatedon) {
		this.generatedon = generatedon;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getMasterToken() {
		return masterToken;
	}

	public void setMasterToken(String masterToken) {
		this.masterToken = masterToken;
	}

}
