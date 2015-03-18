package com.aptitudeguru.dashboard;

public class SitTable {

	
	int _sitid;
	String _sitques;
	String _sitcat;
	
	String _sol;

	
	public SitTable() {

	}

	
	public SitTable(int sitid, String sitques, String sitcat,
			String sol) {
		this._sitid = sitid;
		this._sitques = sitques;
		this._sitcat = sitcat;
		this._sol = sol;
	}

	public SitTable(String sitques, String sitcat, String sol) {

		this._sitques = sitques;
		this._sitcat = sitcat;

		this._sol = sol;
	}

	
	public int getID() {
		return this._sitid;
	}


	public void setID(int quantsid) {
		this._sitid = quantsid;
	}


	public String getQues() {
		return this._sitques;
	}

	
	public void setQues(String sitques) {
		this._sitques = sitques;
	}

	
	public String getCat() {
		return this._sitcat;
	}

	
	public void setCat(String sitcat) {
		this._sitcat = sitcat;
	}

	public String getSol() {
		return this._sol;
	}

	public void setSol(String sol) {
		this._sol = sol;
	}

	
	
}
