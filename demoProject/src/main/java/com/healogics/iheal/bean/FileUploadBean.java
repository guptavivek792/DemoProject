package com.healogics.iheal.bean;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.healogics.iheal.utility.IHealRequest;

public class FileUploadBean extends IHealRequest implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long userId;
	
	private String	file;

	private Long	facilityId;

	private Long	patientId;
	
	private Long	groupId;

	private String	title;

	private String	scanId;

	private String  scanStream;
	
	private String  privateKey;
	
	private String  ScanExtension;
	
	private LocalDateTime eventDateTime;
	
	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Long getFacilityId() {
		return facilityId;
	}
	
	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
	}
	
	public Long getPatientId() {
		return patientId;
	}
	
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getScanId() {
		return scanId;
	}
	
	public void setScanId(String uuid) {
		this.scanId = uuid;
	}
	
	public String getScanStream() {
		return scanStream;
	}
	
	public void setScanStream(String scanStream) {
		this.scanStream = scanStream;
	}

	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
		
	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	public LocalDateTime getEventDateTime() {
		return eventDateTime;
	}
	
	public void setEventDateTime(LocalDateTime eventDateTime) {
		this.eventDateTime = eventDateTime;
	}
	
	public String getScanExtension() {
		return ScanExtension;
	}
	
	public void setScanExtension(String scanExtension) {
		ScanExtension = scanExtension;
	}

	
	public Long getGroupId() {
		return groupId;
	}
	
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FileUploadInputBean [userId=");
		builder.append(userId);
		builder.append(", file=");
		builder.append(file);
		builder.append(", facilityId=");
		builder.append(facilityId);
		builder.append(", patientId=");
		builder.append(patientId);
		builder.append(", groupId=");
		builder.append(groupId);
		builder.append(", title=");
		builder.append(title);
		builder.append(", scanId=");
		builder.append(scanId);
		builder.append(", scanStream=");
		builder.append(scanStream);
		builder.append(", privateKey=");
		builder.append(privateKey);
		builder.append(", ScanExtension=");
		builder.append(ScanExtension);
		builder.append(", eventDateTime=");
		builder.append(eventDateTime);
		builder.append("]");
		return builder.toString();
	}
	
}
