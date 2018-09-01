package com.payment.beans;

public class AccountResponseBean {

	private Boolean responseStatus;

	private Long virtualAccountNumber;

	//trader id in agrogo or company id in secure cargo
	private Long accountEntityId;
	
	private String accountEntityName;

	private String serviceType;
	
	private String subServiceType;
	
	private String userName;
	
	private String userEmail;
	
	
	public Boolean getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(Boolean responseStatus) {
		this.responseStatus = responseStatus;
	}

	public Long getVirtualAccountNumber() {
		return virtualAccountNumber;
	}

	public void setVirtualAccountNumber(Long virtualAccountNumber) {
		this.virtualAccountNumber = virtualAccountNumber;
	}

	public Long getAccountEntityId() {
		return accountEntityId;
	}

	public void setAccountEntityId(Long accountEntityId) {
		this.accountEntityId = accountEntityId;
	}

	public String getAccountEntityName() {
		return accountEntityName;
	}

	public void setAccountEntityName(String accountEntityName) {
		this.accountEntityName = accountEntityName;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getSubServiceType() {
		return subServiceType;
	}

	public void setSubServiceType(String subServiceType) {
		this.subServiceType = subServiceType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
}
