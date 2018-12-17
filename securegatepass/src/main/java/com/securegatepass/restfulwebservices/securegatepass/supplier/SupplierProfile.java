package com.securegatepass.restfulwebservices.securegatepass.supplier;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.deps.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Suppler profile class")


@Document
@JsonIgnoreProperties
public class SupplierProfile {

	@Id
	@NotNull
	private String SID;

	@Field
	@Size(min=1, message = "First Name should have at least 1 character" )
	@ApiModelProperty(notes="First Name should have minimum 1 character")
	@NotNull
	private String name;

	@Field
	@Size(min=10,max=10, message = "Mobile Number should have at least 10 characters")
	@ApiModelProperty(notes="Mobile Number should have minimum 10 characters")
	@NotNull
	private String mobileNumber;

	@Field
	@Size(min=1,message = "Address first line should have at least 1 character")
	@ApiModelProperty(notes="Address first line should have minimum 1 character")
	@NotNull
	private String addressFirstLine;

	@Field
	@Size(min=1, message = "Address city should have at least 1 character")
	@ApiModelProperty(notes="Address city should have minimum 1 character")
	@NotNull
	private String addressCity;

	@Field
	@Size(min=1, message = "Address state should have at least 1 character")
	@ApiModelProperty(notes="Address state should have minimum 1 character")
	@NotNull
	private String addressState;

	@Field
	@Size(min=6, message = "Address pincode should have at least 6 characters")
	@ApiModelProperty(notes="Address pincode should have minimum 6 characters")
	@NotNull
	private String addressPincode;
	private String gstNo;

	@Field
	@Email
	@NotNull
	private String emailAddress;

	@Field
	@NotNull
	@Size(min=6, message="Password should have at least 6 characters")
	private String password;


	public SupplierProfile() {

	}


	public SupplierProfile(String sID, String name, String mobileNumber, String addressFirstLine, String addressCity,
			String addressState, String addressPincode, String gstNo, String emailAddress, String password) {
		super();
		SID = sID;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.addressFirstLine = addressFirstLine;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressPincode = addressPincode;
		this.gstNo = gstNo;
		this.emailAddress = emailAddress;
		this.password = password;
	}


	public String getSID() {
		return SID;
	}


	public void setSID(String sID) {
		SID = sID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getAddressFirstLine() {
		return addressFirstLine;
	}


	public void setAddressFirstLine(String addressFirstLine) {
		this.addressFirstLine = addressFirstLine;
	}


	public String getAddressCity() {
		return addressCity;
	}


	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}


	public String getAddressState() {
		return addressState;
	}


	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}


	public String getAddressPincode() {
		return addressPincode;
	}


	public void setAddressPincode(String addressPincode) {
		this.addressPincode = addressPincode;
	}


	public String getGstNo() {
		return gstNo;
	}


	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String generateSupplierID() {

		return "null";
	}

	@Override
	public String toString() {
		return "SupplierProfile [SID=" + SID + ", name=" + name + ", mobileNumber=" + mobileNumber
				+ ", addressFirstLine=" + addressFirstLine + ", addressCity=" + addressCity + ", addressState="
				+ addressState + ", addressPincode=" + addressPincode + ", gstNo=" + gstNo + ", emailAddress="
				+ emailAddress + ", password=" + password + "]";
	}


}
