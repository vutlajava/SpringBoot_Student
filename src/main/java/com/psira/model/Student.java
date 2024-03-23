package com.psira.model;

public class Student {
	
	private Long studentID;
	private String studentName;
	private String studentAddress;
	private Long collegeId;
	
	public Student() {
		
	}
	
	
	
	/**
	 * @param studentID
	 * @param studentName
	 * @param studentAddress
	 * @param collegeId
	 */
	public Student(Long studentID, String studentName, String studentAddress, Long collegeId) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeId = collegeId;
	}
	/**
	 * @return the studentID
	 */
	public Long getStudentID() {
		return studentID;
	}
	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(Long studentID) {
		this.studentID = studentID;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the studentAddress
	 */
	public String getStudentAddress() {
		return studentAddress;
	}
	/**
	 * @param studentAddress the studentAddress to set
	 */
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	/**
	 * @return the collegeId
	 */
	public Long getCollegeId() {
		return collegeId;
	}
	/**
	 * @param collegeId the collegeId to set
	 */
	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}
	
	

}
