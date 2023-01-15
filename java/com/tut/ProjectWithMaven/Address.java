package com.tut.ProjectWithMaven;






import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name = "ADDRESS")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressId;
	@Column(length = 50,name = "STREET")
	private String street;
	@Column (length = 100,name="CITY")
	private String city;
	@Column (name = "IS_OPEN")
	private boolean is_open;
	@Transient
	private double x;
	public Date getAddedDate() {
		return addedDate;
	}



	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	@Column(name= "DATE" )
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	@Lob
	private byte[] image; 
	

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Address(int addressId, String street, String city, boolean is_open, double x, byte[] image) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.is_open = is_open;
		this.x = x;
		this.image = image;
	}

	

	public boolean isIs_open() {
		return is_open;
	}

	public void setIs_open(boolean is_open) {
		this.is_open = is_open;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
