package com.bitmonlab.osiris.commons.map.model.imports;

import org.springframework.data.annotation.Id;

public class LockImport {
	
	@Id	
	private String appIdentifier;
	
	private String timeStamp;
	
	
	public String getAppIdentifier() {
		return appIdentifier;
	}

	public void setAppIdentifier(String appIdentifier) {
		this.appIdentifier = appIdentifier;
	}
	
	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	
}
