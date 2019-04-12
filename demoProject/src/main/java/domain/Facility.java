package com.healogics.pretx.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(schema = "public", name = "facility")
public class Facility implements Serializable {

	private static final long	serialVersionUID	= 1L;

	@Id
	@Column(name = "facilityid")
	private Long				facilityId;

	private String				blueBookCode;

	private String				name;

	private String				clinicalNurseMgr;

	private String				clinicalMobileNumber;

	private String				clinicalEmailId;

	private String				programDirector;

	private String				programMobileNumber;

	private String				programEmailId;

	private String				rdco;

	private String				rdcoMobileNumber;

	private String				rdcoEmailId;

	private String				mac;

	public Facility() {
		super();
	}

	public Facility(Long facilityId) {
		super();
		this.facilityId = facilityId;
	}

	public Long getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
	}

	public String getBlueBookCode() {
		return blueBookCode;
	}

	public void setBlueBookCode(String blueBookCode) {
		this.blueBookCode = blueBookCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClinicalNurseMgr() {
		return clinicalNurseMgr;
	}

	public void setClinicalNurseMgr(String clinicalNurseMgr) {
		this.clinicalNurseMgr = clinicalNurseMgr;
	}

	public String getClinicalMobileNumber() {
		return clinicalMobileNumber;
	}

	public void setClinicalMobileNumber(String clinicalMobileNumber) {
		this.clinicalMobileNumber = clinicalMobileNumber;
	}

	public String getClinicalEmailId() {
		return clinicalEmailId;
	}

	public void setClinicalEmailId(String clinicalEmailId) {
		this.clinicalEmailId = clinicalEmailId;
	}

	public String getProgramDirector() {
		return programDirector;
	}

	public void setProgramDirector(String programDirector) {
		this.programDirector = programDirector;
	}

	public String getProgramMobileNumber() {
		return programMobileNumber;
	}

	public void setProgramMobileNumber(String programMobileNumber) {
		this.programMobileNumber = programMobileNumber;
	}

	public String getProgramEmailId() {
		return programEmailId;
	}

	public void setProgramEmailId(String programEmailId) {
		this.programEmailId = programEmailId;
	}

	public String getRdco() {
		return rdco;
	}

	public void setRdco(String rdco) {
		this.rdco = rdco;
	}

	public String getRdcoMobileNumber() {
		return rdcoMobileNumber;
	}

	public void setRdcoMobileNumber(String rdcoMobileNumber) {
		this.rdcoMobileNumber = rdcoMobileNumber;
	}

	public String getRdcoEmailId() {
		return rdcoEmailId;
	}

	public void setRdcoEmailId(String rdcoEmailId) {
		this.rdcoEmailId = rdcoEmailId;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

}
