package com.healogics.pretx.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.fasterxml.jackson.databind.JsonNode;
import com.healogics.pretx.domain.datatype.JsonDataType;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(schema = "public", name = "requestdetail")
@TypeDef(name = "jsontype", typeClass = JsonDataType.class)
public class RequestDetail {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long		id;

	@ManyToOne
	@JoinColumn(name = "requestid")
	private Request		request;

	@Type(type = "jsontype")
	private JsonNode	category;

	private Boolean		isDeleted	= false;

	@Type(type = "jsontype")
	private JsonNode	woundInformation;

	@Type(type = "jsontype")
	private JsonNode	diabetesStatus;

	@Type(type = "jsontype")
	private JsonNode	woundHealingPercentage;

	@Type(type = "jsontype")
	private JsonNode	boneScanResult;

	@Type(type = "jsontype")
	private JsonNode	xrayResult;

	@Type(type = "jsontype")
	private JsonNode	ctScanResult;

	@Type(type = "jsontype")
	private JsonNode	mriScanResult;

	@Type(type = "jsontype")
	private JsonNode	otherResult;

	@Type(type = "jsontype")
	private JsonNode	labReviewed;

	/**
	 * fields change according to therapy type
	 */

	@Type(type = "jsontype")
	private JsonNode	vascularStatus;

	@Type(type = "jsontype")
	private JsonNode	nutritionalManagement;

	@Type(type = "jsontype")
	private JsonNode	glucoseControl;

	@Type(type = "jsontype")
	private JsonNode	debridementWoundBedManagement;

	@Type(type = "jsontype")
	private JsonNode	offloading;

	@Type(type = "jsontype")
	private JsonNode	controlOfInfection;

	@Type(type = "jsontype")
	private JsonNode	cultureResult;

	/**
	 * for type 2 specific & 4
	 */
	@Type(type = "jsontype")
	private JsonNode	hxOfPriorRadiation;

	@Type(type = "jsontype")
	private JsonNode	locationOfORN;

	@Type(type = "jsontype")
	private JsonNode	descriptionOfSymptoms;

	@Type(type = "jsontype")
	private JsonNode	petScan;

	/**
	 * for type 3 specific
	 */
	@Type(type = "jsontype")
	private JsonNode	reasonForHBO;

	@Type(type = "jsontype")
	private JsonNode	siteOfCRO;

	@Type(type = "jsontype")
	private JsonNode	imagingStudiesToSupportCRO;

	@Type(type = "jsontype")
	private JsonNode	antibioticOutcome;

	@Type(type = "jsontype")
	private JsonNode	surgicalResectionOutcome;

	/**
	 * for type 5 specific
	 */
	@Type(type = "jsontype")
	private JsonNode	prePostOPManagement;

	@Type(type = "jsontype")
	private JsonNode	descriptionOfViability;

	@Type(type = "jsontype")
	private JsonNode	descriptionOfTreatment;

	@Type(type = "jsontype")
	private JsonNode	initialGraftOPNote;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public JsonNode getCategory() {
		return category;
	}

	public void setCategory(JsonNode category) {
		this.category = category;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public JsonNode getWoundInformation() {
		return woundInformation;
	}

	public void setWoundInformation(JsonNode woundInformation) {
		this.woundInformation = woundInformation;
	}

	public JsonNode getDiabetesStatus() {
		return diabetesStatus;
	}

	public void setDiabetesStatus(JsonNode diabetesStatus) {
		this.diabetesStatus = diabetesStatus;
	}

	public JsonNode getWoundHealingPercentage() {
		return woundHealingPercentage;
	}

	public void setWoundHealingPercentage(JsonNode woundHealingPercentage) {
		this.woundHealingPercentage = woundHealingPercentage;
	}

	public JsonNode getBoneScanResult() {
		return boneScanResult;
	}

	public void setBoneScanResult(JsonNode boneScanResult) {
		this.boneScanResult = boneScanResult;
	}

	public JsonNode getXrayResult() {
		return xrayResult;
	}

	public void setXrayResult(JsonNode xrayResult) {
		this.xrayResult = xrayResult;
	}

	public JsonNode getCtScanResult() {
		return ctScanResult;
	}

	public void setCtScanResult(JsonNode ctScanResult) {
		this.ctScanResult = ctScanResult;
	}

	public JsonNode getMriScanResult() {
		return mriScanResult;
	}

	public void setMriScanResult(JsonNode mriScanResult) {
		this.mriScanResult = mriScanResult;
	}

	public JsonNode getOtherResult() {
		return otherResult;
	}

	public void setOtherResult(JsonNode otherResult) {
		this.otherResult = otherResult;
	}

	public JsonNode getLabReviewed() {
		return labReviewed;
	}

	public void setLabReviewed(JsonNode labReviewed) {
		this.labReviewed = labReviewed;
	}

	public JsonNode getVascularStatus() {
		return vascularStatus;
	}

	public void setVascularStatus(JsonNode vascularStatus) {
		this.vascularStatus = vascularStatus;
	}

	public JsonNode getNutritionalManagement() {
		return nutritionalManagement;
	}

	public void setNutritionalManagement(JsonNode nutritionalManagement) {
		this.nutritionalManagement = nutritionalManagement;
	}

	public JsonNode getGlucoseControl() {
		return glucoseControl;
	}

	public void setGlucoseControl(JsonNode glucoseControl) {
		this.glucoseControl = glucoseControl;
	}

	public JsonNode getDebridementWoundBedManagement() {
		return debridementWoundBedManagement;
	}

	public void setDebridementWoundBedManagement(JsonNode debridementWoundBedManagement) {
		this.debridementWoundBedManagement = debridementWoundBedManagement;
	}

	public JsonNode getOffloading() {
		return offloading;
	}

	public void setOffloading(JsonNode offloading) {
		this.offloading = offloading;
	}

	public JsonNode getControlOfInfection() {
		return controlOfInfection;
	}

	public void setControlOfInfection(JsonNode controlOfInfection) {
		this.controlOfInfection = controlOfInfection;
	}

	public JsonNode getHxOfPriorRadiation() {
		return hxOfPriorRadiation;
	}

	public void setHxOfPriorRadiation(JsonNode hxOfPriorRadiation) {
		this.hxOfPriorRadiation = hxOfPriorRadiation;
	}

	public JsonNode getLocationOfORN() {
		return locationOfORN;
	}

	public void setLocationOfORN(JsonNode locationOfORN) {
		this.locationOfORN = locationOfORN;
	}

	public JsonNode getDescriptionOfSymptoms() {
		return descriptionOfSymptoms;
	}

	public void setDescriptionOfSymptoms(JsonNode descriptionOfSymptoms) {
		this.descriptionOfSymptoms = descriptionOfSymptoms;
	}

	public JsonNode getPetScan() {
		return petScan;
	}

	public void setPetScan(JsonNode petScan) {
		this.petScan = petScan;
	}

	public JsonNode getReasonForHBO() {
		return reasonForHBO;
	}

	public void setReasonForHBO(JsonNode reasonForHBO) {
		this.reasonForHBO = reasonForHBO;
	}

	public JsonNode getSiteOfCRO() {
		return siteOfCRO;
	}

	public void setSiteOfCRO(JsonNode siteOfCRO) {
		this.siteOfCRO = siteOfCRO;
	}

	public JsonNode getImagingStudiesToSupportCRO() {
		return imagingStudiesToSupportCRO;
	}

	public void setImagingStudiesToSupportCRO(JsonNode imagingStudiesToSupportCRO) {
		this.imagingStudiesToSupportCRO = imagingStudiesToSupportCRO;
	}

	public JsonNode getAntibioticOutcome() {
		return antibioticOutcome;
	}

	public void setAntibioticOutcome(JsonNode antibioticOutcome) {
		this.antibioticOutcome = antibioticOutcome;
	}

	public JsonNode getSurgicalResectionOutcome() {
		return surgicalResectionOutcome;
	}

	public void setSurgicalResectionOutcome(JsonNode surgicalResectionOutcome) {
		this.surgicalResectionOutcome = surgicalResectionOutcome;
	}

	public JsonNode getPrePostOPManagement() {
		return prePostOPManagement;
	}

	public void setPrePostOPManagement(JsonNode prePostOPManagement) {
		this.prePostOPManagement = prePostOPManagement;
	}

	public JsonNode getDescriptionOfViability() {
		return descriptionOfViability;
	}

	public void setDescriptionOfViability(JsonNode descriptionOfViability) {
		this.descriptionOfViability = descriptionOfViability;
	}

	public JsonNode getDescriptionOfTreatment() {
		return descriptionOfTreatment;
	}

	public void setDescriptionOfTreatment(JsonNode descriptionOfTreatment) {
		this.descriptionOfTreatment = descriptionOfTreatment;
	}

	public JsonNode getInitialGraftOPNote() {
		return initialGraftOPNote;
	}

	public void setInitialGraftOPNote(JsonNode initialGraftOPNote) {
		this.initialGraftOPNote = initialGraftOPNote;
	}

	public JsonNode getCultureResult() {
		return cultureResult;
	}

	public void setCultureResult(JsonNode cultureResult) {
		this.cultureResult = cultureResult;
	}

}
