package com.vca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;



@Entity
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Company name is required")
    @Size(min = 3, max = 100, message = "Company name length must be between 3 and 100 characters")
    private String name;

    @NotBlank(message = "Address line 1 is required")
    @Size(max = 100, message = "Address line 1 length must not exceed 100 characters")
    private String addressLine1;

    @Size(max = 100, message = "Address line 2 length must not exceed 100 characters")
    private String addressLine2;

    @NotBlank(message = "City is required")
    @Size(max = 50, message = "City name length must not exceed 50 characters")
    private String city;

    @NotBlank(message = "State is required")
    @Size(max = 50, message = "State name length must not exceed 50 characters")
    private String state;

    @NotBlank(message = "PIN code is required")
    @Pattern(regexp = "^[0-9]{6}$", message = "PIN code must be a 6-digit number")
    private String pinCode;

    @Pattern(regexp = "^[0-9]{10}$", message = "Invalid phone number format")
    private String telephone;

    @Pattern(regexp = "^[0-9]{10}$", message = "Invalid fax number format")
    private String fax;


    @NotBlank(message = "Authorized person name is required")
    @Size(max = 100, message = "Authorized person name length must not exceed 100 characters")
    private String authorizedPersonName;

    @NotBlank(message = "Company street number is required")
    @Size(max = 20, message = "Company street number length must not exceed 20 characters")
    private String companyStreetNumber;

    @Pattern(regexp = "^[0-9A-Z]{15}$", message = "Invalid GST number format")
    private String gstNumber;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getAuthorizedPersonName() {
		return authorizedPersonName;
	}

	public void setAuthorizedPersonName(String authorizedPersonName) {
		this.authorizedPersonName = authorizedPersonName;
	}

	public String getCompanyStreetNumber() {
		return companyStreetNumber;
	}

	public void setCompanyStreetNumber(String companyStreetNumber) {
		this.companyStreetNumber = companyStreetNumber;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

} 

