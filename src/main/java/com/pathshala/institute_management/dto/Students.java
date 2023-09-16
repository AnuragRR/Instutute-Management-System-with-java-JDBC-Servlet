package com.pathshala.institute_management.dto;
/**
 * 
 * @author anurag
 *
 */
public class Students {
	private int sid;
	private String sname;
	private String semail;
	private String spass;
	
	public Students() {
		super();
	}

	public Students(int sid, String sname, String semail, String spass) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.spass = spass;
	}

	public Students(String sname, String semail, String spass) {
		super();
		this.sname = sname;
		this.semail = semail;
		this.spass = spass;
	}

	public Students(int sid, String semail, String spass) {
		super();
		this.sid = sid;
		this.semail = semail;
		this.spass = spass;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSpass() {
		return spass;
	}

	public void setSpass(String spass) {
		this.spass = spass;
	}
	
}
