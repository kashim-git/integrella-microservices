package com.integrella.refdata.repository.custom;

/**
 * 
 * @author Kashim
 * 
 * Interface that defines custom queries 
 *
 */
public interface ReferenceDataRepositoryCustom {
	
	public String retrieveReferenceData(String sourceSystem, String targetSystem, String value);

}
