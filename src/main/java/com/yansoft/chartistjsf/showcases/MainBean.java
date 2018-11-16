/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yansoft.chartistjsf.showcases;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.util.Base64;

@ManagedBean
@ViewScoped
public class MainBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3865860455560848985L;



	private String currentSection;

	/**
	 * Main navigation - xhtml path passed from here
	 * */
	public void updateSection() {
		try {
			currentSection = new String(Base64.decodeFast("currentSection"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			///log.error("Application is broken, porka Vacca");
		}
	}

	/**
	 * @return the currentSection
	 */
	public String getCurrentSection() {
		return currentSection;
	}

	/**
	 * @param currentSection
	 *            the currentSection to set
	 */
	public void setCurrentSection(String currentSection) {
		this.currentSection = currentSection;
	}

}
