package com.healogics.iheal.bean;

import java.util.Date;

public class WoundAssessment {

	private Wound	wound;

	private String	woundNumber;

	private String	woundLocation;

	private String	woundEvent;

	private Date	dateAcquired;

	private Long	primaryEtiologyCode;

	private String	primaryEtiologyDescription;

	private Long	secondaryEtiologyCode;

	private String	secondaryEtiologyDescriptions;

	private String	woundNotes;

	private Double	length;

	private Double	width;

	private Double	depth;

	private Double	area;

	private Double	volume;

	private Double	areaReductionPercent;

	private Double	volumeReductionPercent;

	public Wound getWound() {
		return wound;
	}

	public void setWound(Wound wound) {
		this.wound = wound;
	}

	public String getWoundNumber() {
		return woundNumber;
	}

	public void setWoundNumber(String woundNumber) {
		this.woundNumber = woundNumber;
	}

	public String getWoundLocation() {
		return woundLocation;
	}

	public void setWoundLocation(String woundLocation) {
		this.woundLocation = woundLocation;
	}

	public String getWoundEvent() {
		return woundEvent;
	}

	public void setWoundEvent(String woundEvent) {
		this.woundEvent = woundEvent;
	}

	public Date getDateAcquired() {
		return dateAcquired;
	}

	public void setDateAcquired(Date dateAcquired) {
		this.dateAcquired = dateAcquired;
	}

	public Long getPrimaryEtiologyCode() {
		return primaryEtiologyCode;
	}

	public void setPrimaryEtiologyCode(Long primaryEtiologyCode) {
		this.primaryEtiologyCode = primaryEtiologyCode;
	}

	public String getPrimaryEtiologyDescription() {
		return primaryEtiologyDescription;
	}

	public void setPrimaryEtiologyDescription(String primaryEtiologyDescription) {
		this.primaryEtiologyDescription = primaryEtiologyDescription;
	}

	public Long getSecondaryEtiologyCode() {
		return secondaryEtiologyCode;
	}

	public void setSecondaryEtiologyCode(Long secondaryEtiologyCode) {
		this.secondaryEtiologyCode = secondaryEtiologyCode;
	}

	public String getSecondaryEtiologyDescriptions() {
		return secondaryEtiologyDescriptions;
	}

	public void setSecondaryEtiologyDescriptions(String secondaryEtiologyDescriptions) {
		this.secondaryEtiologyDescriptions = secondaryEtiologyDescriptions;
	}

	public String getWoundNotes() {
		return woundNotes;
	}

	public void setWoundNotes(String woundNotes) {
		this.woundNotes = woundNotes;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getDepth() {
		return depth;
	}

	public void setDepth(Double depth) {
		this.depth = depth;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Double getAreaReductionPercent() {
		return areaReductionPercent;
	}

	public void setAreaReductionPercent(Double areaReductionPercent) {
		this.areaReductionPercent = areaReductionPercent;
	}

	public Double getVolumeReductionPercent() {
		return volumeReductionPercent;
	}

	public void setVolumeReductionPercent(Double volumeReductionPercent) {
		this.volumeReductionPercent = volumeReductionPercent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WoundAssessmentLoadResponse [wound=").append(wound).append(", woundNumber=").append(woundNumber)
				.append(", woundLocation=").append(woundLocation).append(", woundEvent=").append(woundEvent)
				.append(", dateAcquired=").append(dateAcquired).append(", primaryEtiologyCode=")
				.append(primaryEtiologyCode).append(", primaryEtiologyDescription=").append(primaryEtiologyDescription)
				.append(", secondaryEtiologyCode=").append(secondaryEtiologyCode)
				.append(", secondaryEtiologyDescriptions=").append(secondaryEtiologyDescriptions)
				.append(", woundNotes=").append(woundNotes).append(", length=").append(length).append(", width=")
				.append(width).append(", depth=").append(depth).append(", area=").append(area).append(", volume=")
				.append(volume).append(", areaReductionPercent=").append(areaReductionPercent)
				.append(", volumeReductionPercent=").append(volumeReductionPercent).append("]");
		return builder.toString();
	}

}
