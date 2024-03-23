package com.psira.model;

public class College {
	
	private Long collegeId;
	private String collegeName;
	private String collegeAddress;
	
	public College() {
		
	}
	/**
	 * @param collegeId
	 * @param collegeName
	 * @param collegeAddress
	 */
	public College(Long collegeId, String collegeName, String collegeAddress) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
	}
	public Long getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	
	
	

}
