package com.bookstore.order.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table(name ="Customer_Table")
public class CustomerDetails
{
@Id
@Column(name = "Cust_Id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer custId;

@NotEmpty(message = "Name is mandatory")
@Column(name = "CustFullName")
private String CustFullName;

@NotEmpty(message = "emailid is mandatory")
@Email(message = "Email is mandatory")
@Column(name = "emailId")
private String emailId;

@NotEmpty(message = "user password is mandatory")
@Column(name = "userPaswword")
private String userPassword;

@NotNull(message = "phoneNo must be mandatory")
@Column(name = "phoneNo")
private String phoneNo;

@NotEmpty(message = "Address is mandatory")
@Column(name="Address")
private String Address;

@NotEmpty(message = "City is mandatory")
@Column(name="CityName")
private String CityName;

@NotEmpty(message = "ZipCode is mandatory")
@Column(name="ZipCode")
private String ZipCode;

@NotEmpty(message = "Country is mandatory")
@Column(name="CountryName")
private String CountryName;

public Integer getCustId() {
	return custId;
}

public void setCustId(Integer custId) {
	this.custId = custId;
}

public String getCustFullName() {
	return CustFullName;
}

public void setCustFullName(String custFullName) {
	CustFullName = custFullName;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getUserPassword() {
	return userPassword;
}

public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}

public String getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}

public String getCityName() {
	return CityName;
}

public void setCityName(String cityName) {
	CityName = cityName;
}

public String getZipCode() {
	return ZipCode;
}

public void setZipCode(String zipCode) {
	ZipCode = zipCode;
}

public String getCountryName() {
	return CountryName;
}

public void setCountryName(String countryName) {
	CountryName = countryName;
}

public CustomerDetails() {
	
}
public CustomerDetails(Integer custId, @NotEmpty(message = "Name is mandatory") String custFullName,
		@NotEmpty(message = "emailid is mandatory") @Email(message = "Email is mandatory") String emailId,
		@NotEmpty(message = "user password is mandatory") String userPassword,
		@NotNull(message = "phoneNo must be mandatory") String phoneNo,
		@NotEmpty(message = "Address is mandatory") String address,
		@NotEmpty(message = "City is mandatory") String cityName,
		@NotEmpty(message = "ZipCode is mandatory") String zipCode,
		@NotEmpty(message = "Country is mandatory") String countryName) {
	super();
	this.custId = custId;
	CustFullName = custFullName;
	this.emailId = emailId;
	this.userPassword = userPassword;
	this.phoneNo = phoneNo;
	Address = address;
	CityName = cityName;
	ZipCode = zipCode;
	CountryName = countryName;
}


}