package utils;

import java.util.Date;

public class Population {

	private int mPoputationId;
	private Date mDate;
	private double mPopulation;
	private int mPrecinctId;
	private int mDistrictId;
	
	
	public Population(int mPoputationId, Date mDate, double mPopulation, int mPrecinctId, int mDistrictId) {
		this.mPoputationId = mPoputationId;
		this.mDate = mDate;
		this.mPopulation = mPopulation;
		this.mPrecinctId = mPrecinctId;
		this.mDistrictId = mDistrictId;
	}


	public int getmPoputationId() {
		return mPoputationId;
	}


	public void setmPoputationId(int mPoputationId) {
		this.mPoputationId = mPoputationId;
	}


	public Date getmDate() {
		return mDate;
	}


	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}


	public double getmPopulation() {
		return mPopulation;
	}


	public void setmPopulation(double mPopulation) {
		this.mPopulation = mPopulation;
	}


	public int getmPrecinctId() {
		return mPrecinctId;
	}


	public void setmPrecinctId(int mPrecinctId) {
		this.mPrecinctId = mPrecinctId;
	}


	public int getmDistrictId() {
		return mDistrictId;
	}


	public void setmDistrictId(int mDistrictId) {
		this.mDistrictId = mDistrictId;
	}


	public Population() {
		// TODO Auto-generated constructor stub
	}

}
