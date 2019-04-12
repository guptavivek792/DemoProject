package com.healogics.pretx.bean;

import com.fasterxml.jackson.databind.JsonNode;

public class RequestDetailBean {

	private JsonNode	category;

	private JsonNode	woundInformation;

	private JsonNode	diabetesStatus;

	private JsonNode	woundHealingPercentage;

	private ReportBean	boneScanResult;

	private ReportBean	xrayResult;

	private ReportBean	ctScanResult;

	private ReportBean	mriScanResult;

	private ReportBean	otherResult;

	private JsonNode	labReviewed;

	/**
	 * fields change according to therapy type
	 */

	private ReportBean	vascularStatus;

	private ReportBean	nutritionalManagement;

	private ReportBean	glucoseControl;

	private ReportBean	debridementWoundBedManagement;

	private ReportBean	offloading;

	private ReportBean	controlOfInfection;

	private ReportBean	cultureResult;

	/**
	 * for type 2 & 4 specific
	 */

	private ReportBean	hxOfPriorRadiation;

	private ReportBean	locationOfORN;

	private ReportBean	descriptionOfSymptoms;

	private ReportBean	petScan;

	/**
	 * for type 3 specific
	 */

	private ReportBean	reasonForHBO;

	private ReportBean	siteOfCRO;

	private ReportBean	imagingStudiesToSupportCRO;

	private ReportBean	antibioticOutcome;

	private ReportBean	surgicalResectionOutcome;

	/**
	 * for type 5 specific
	 */
	private ReportBean	prePostOPManagement;

	private ReportBean	descriptionOfViability;

	private ReportBean	descriptionOfTreatment;

	private ReportBean	initialGraftOPNote;

	public JsonNode getCategory() {
		return category;
	}

	public void setCategory(JsonNode category) {
		this.category = category;
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

	public ReportBean getBoneScanResult() {
		return boneScanResult;
	}

	public void setBoneScanResult(ReportBean boneScanResult) {
		this.boneScanResult = boneScanResult;
	}

	public ReportBean getXrayResult() {
		return xrayResult;
	}

	public void setXrayResult(ReportBean xrayResult) {
		this.xrayResult = xrayResult;
	}

	public ReportBean getCtScanResult() {
		return ctScanResult;
	}

	public void setCtScanResult(ReportBean ctScanResult) {
		this.ctScanResult = ctScanResult;
	}

	public ReportBean getMriScanResult() {
		return mriScanResult;
	}

	public void setMriScanResult(ReportBean mriScanResult) {
		this.mriScanResult = mriScanResult;
	}

	public ReportBean getOtherResult() {
		return otherResult;
	}

	public void setOtherResult(ReportBean otherResult) {
		this.otherResult = otherResult;
	}

	public JsonNode getLabReviewed() {
		return labReviewed;
	}

	public void setLabReviewed(JsonNode labReviewed) {
		this.labReviewed = labReviewed;
	}

	public ReportBean getVascularStatus() {
		return vascularStatus;
	}

	public void setVascularStatus(ReportBean vascularStatus) {
		this.vascularStatus = vascularStatus;
	}

	public ReportBean getNutritionalManagement() {
		return nutritionalManagement;
	}

	public void setNutritionalManagement(ReportBean nutritionalManagement) {
		this.nutritionalManagement = nutritionalManagement;
	}

	public ReportBean getGlucoseControl() {
		return glucoseControl;
	}

	public void setGlucoseControl(ReportBean glucoseControl) {
		this.glucoseControl = glucoseControl;
	}

	public ReportBean getDebridementWoundBedManagement() {
		return debridementWoundBedManagement;
	}

	public void setDebridementWoundBedManagement(ReportBean debridementWoundBedManagement) {
		this.debridementWoundBedManagement = debridementWoundBedManagement;
	}

	public ReportBean getOffloading() {
		return offloading;
	}

	public void setOffloading(ReportBean offloading) {
		this.offloading = offloading;
	}

	public ReportBean getControlOfInfection() {
		return controlOfInfection;
	}

	public void setControlOfInfection(ReportBean controlOfInfection) {
		this.controlOfInfection = controlOfInfection;
	}

	public ReportBean getCultureResult() {
		return cultureResult;
	}

	public void setCultureResult(ReportBean cultureResult) {
		this.cultureResult = cultureResult;
	}

	public ReportBean getHxOfPriorRadiation() {
		return hxOfPriorRadiation;
	}

	public void setHxOfPriorRadiation(ReportBean hxOfPriorRadiation) {
		this.hxOfPriorRadiation = hxOfPriorRadiation;
	}

	public ReportBean getLocationOfORN() {
		return locationOfORN;
	}

	public void setLocationOfORN(ReportBean locationOfORN) {
		this.locationOfORN = locationOfORN;
	}

	public ReportBean getDescriptionOfSymptoms() {
		return descriptionOfSymptoms;
	}

	public void setDescriptionOfSymptoms(ReportBean descriptionOfSymptoms) {
		this.descriptionOfSymptoms = descriptionOfSymptoms;
	}

	public ReportBean getPetScan() {
		return petScan;
	}

	public void setPetScan(ReportBean petScan) {
		this.petScan = petScan;
	}

	public ReportBean getReasonForHBO() {
		return reasonForHBO;
	}

	public void setReasonForHBO(ReportBean reasonForHBO) {
		this.reasonForHBO = reasonForHBO;
	}

	public ReportBean getSiteOfCRO() {
		return siteOfCRO;
	}

	public void setSiteOfCRO(ReportBean siteOfCRO) {
		this.siteOfCRO = siteOfCRO;
	}

	public ReportBean getImagingStudiesToSupportCRO() {
		return imagingStudiesToSupportCRO;
	}

	public void setImagingStudiesToSupportCRO(ReportBean imagingStudiesToSupportCRO) {
		this.imagingStudiesToSupportCRO = imagingStudiesToSupportCRO;
	}

	public ReportBean getAntibioticOutcome() {
		return antibioticOutcome;
	}

	public void setAntibioticOutcome(ReportBean antibioticOutcome) {
		this.antibioticOutcome = antibioticOutcome;
	}

	public ReportBean getSurgicalResectionOutcome() {
		return surgicalResectionOutcome;
	}

	public void setSurgicalResectionOutcome(ReportBean surgicalResectionOutcome) {
		this.surgicalResectionOutcome = surgicalResectionOutcome;
	}

	public ReportBean getPrePostOPManagement() {
		return prePostOPManagement;
	}

	public void setPrePostOPManagement(ReportBean prePostOPManagement) {
		this.prePostOPManagement = prePostOPManagement;
	}

	public ReportBean getDescriptionOfViability() {
		return descriptionOfViability;
	}

	public void setDescriptionOfViability(ReportBean descriptionOfViability) {
		this.descriptionOfViability = descriptionOfViability;
	}

	public ReportBean getDescriptionOfTreatment() {
		return descriptionOfTreatment;
	}

	public void setDescriptionOfTreatment(ReportBean descriptionOfTreatment) {
		this.descriptionOfTreatment = descriptionOfTreatment;
	}

	public ReportBean getInitialGraftOPNote() {
		return initialGraftOPNote;
	}

	public void setInitialGraftOPNote(ReportBean initialGraftOPNote) {
		this.initialGraftOPNote = initialGraftOPNote;
	}

}
