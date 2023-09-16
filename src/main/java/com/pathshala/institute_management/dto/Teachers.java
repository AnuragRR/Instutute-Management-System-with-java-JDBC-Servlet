package com.pathshala.institute_management.dto;
/**
 * 
 * @author anurag
 *
 */
public class Teachers {
	private int tid;
	private String tname;
	private String temail;
	private String tpass;
	
	public Teachers() {
		super();
	}

	public Teachers(int tid, String tname, String temail, String tpass) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.temail = temail;
		this.tpass = tpass;
	}

	public Teachers(String tname, String temail, String tpass) {
		super();
		this.tname = tname;
		this.temail = temail;
		this.tpass = tpass;
	}

	public Teachers(int tid, String temail, String tpass) {
		super();
		this.tid = tid;
		this.temail = temail;
		this.tpass = tpass;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTemail() {
		return temail;
	}

	public void setTemail(String temail) {
		this.temail = temail;
	}

	public String getTpass() {
		return tpass;
	}

	public void setTpass(String tpass) {
		this.tpass = tpass;
	}
	
}
