package com.date.model;

public class ActionImage {

	private String actionid;
	
	private byte[] image;
	
	public String getId() {
		return actionid;
	}

	public void setId(String actionid) {
		this.actionid = actionid;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
}
