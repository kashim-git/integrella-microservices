package com.integrella.refdata.repository.rest;

import org.springframework.data.annotation.Id;

public class ReferenceData {
	
    @Id
    public String id;
	
	private String sourceSystem;
	private String targetSystem;
	private String sourceValue;
	private String targetValue;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSourceSystem() {
		return sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public String getTargetSystem() {
		return targetSystem;
	}
	public void setTargetSystem(String targetSystem) {
		this.targetSystem = targetSystem;
	}
	public String getSourceValue() {
		return sourceValue;
	}
	public void setSourceValue(String sourceValue) {
		this.sourceValue = sourceValue;
	}
	public String getTargetValue() {
		return targetValue;
	}
	public void setTargetValue(String targetValue) {
		this.targetValue = targetValue;
	}
	@Override
	public String toString() {
		return "ReferenceData [id=" + id + ", sourceSystem=" + sourceSystem + ", targetSystem=" + targetSystem
				+ ", sourceValue=" + sourceValue + ", targetValue=" + targetValue + "]";
	}
	

	

}
