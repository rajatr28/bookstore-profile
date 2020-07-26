package com.capgemini.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="Profile")
@DynamicUpdate(true)
@DynamicInsert(true)
//@SequenceGenerator(name="customerID_gen",initialValue = 1,allocationSize = 1)
public class Profile {
	
	//@GeneratedValue(generator="customerId_gen",strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name="profile_id")
	private Integer profileId;
	
	@NotEmpty(message = "Name is required")
	@Column(name="name")
	private String name;
	
	@NotEmpty(message = "Email is required")
	@Column(name="email")
	private String email;
	
	@Column(name="phonenumber")
	private String phonenumber;
	
	@NotEmpty(message = "address is required")
	@Column(name="address")
	private String address;
	
	@NotEmpty(message = "city is required")
	@Column(name="city")
	private String city;
	
	@Column(name="zipcode")
	@NotEmpty(message = "zipcode is required")
	private String zipcode;
	
	@NotEmpty(message = "Country is required")
	@Column(name="country")
	private String country;

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public Profile(int profileId,String name,String email,String phonenumber,String address,String city,String zipcode,String country) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
		this.country = country;
	}
	
	public Profile() {
		super();
	}
	
	@Override
	public String toString() {
		return "Profile[profileId=" + profileId +", name=" + name +", email=" + email +", phonenumber=" + phonenumber +", address=" + address +", city=" + city +", zipcode=" + zipcode +", country=" + country +"]";
	}
}
