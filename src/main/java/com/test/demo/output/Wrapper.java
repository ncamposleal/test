package com.test.demo.output;

import java.io.Serializable;
    
public class Wrapper implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1764598016620660340L;
	private boolean OK;
	private Object data;
	private Error error;
	private String information;
	private String reserveType;
	public Wrapper() {
		super();
	}

	public Wrapper(boolean oK, Object data, Error error, String information) {
		super();
		this.OK = oK;
		this.data = data;
		this.error = error;
		this.information = information;
	}

	public boolean isOK() {
		return OK;
	}

	public void setOK(boolean oK) {
		this.OK = oK;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getReserveType() {
		return reserveType;
	}

	public void setReserveType(String reserveType) {
		this.reserveType = reserveType;
	}
}