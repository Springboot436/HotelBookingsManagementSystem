package com.cg.hbm.dto;
import javax.persistence.*;
@Entity
@Table(name="Hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int hotel_id;
	//@Column(name="city",nullable=false)
	private String city;
	//@Column(name="hotel_name")
	private String hotel_name;
	//@Column(name="address")
	private String address;
	//@Column(name="description")
	private String description;
	//@Column(name="avg_rate_per_day")
	private double avg_rate_per_day;
	//@Column(name="email",nullable=false,unique=true)
	private String email;
	//@Column(name="phone1")
	private String phone1;
	//@Column(name="phone2")
	private String phone2;
	//@Column(name="website")
	private String website;
	//@OneToMany(mappedBy="hotel",cascade=CascadeType.ALL)
	//private List<BookingDetails> bookingdetails;
	public Hotel() {
		
	}
	
	public Hotel(int hotel_id, String city, String hotel_name, String address, String description,
			double avg_rate_per_day, String email, String phone1, String phone2, String website) {
		super();
		this.hotel_id = hotel_id;
		this.city = city;
		this.hotel_name = hotel_name;
		this.address = address;
		this.description = description;
		this.avg_rate_per_day = avg_rate_per_day;
		this.email = email;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.website = website;
		
	}

	public int getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAvg_rate_per_day() {
		return avg_rate_per_day;
	}

	public void setAvg_rate_per_day(double avg_rate_per_day) {
		this.avg_rate_per_day = avg_rate_per_day;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	

	

	@Override
	public String toString() {
		return "Hotel [hotel_id=" + hotel_id + ", city=" + city + ", hotel_name=" + hotel_name + ", address=" + address
				+ ", description=" + description + ", avg_rate_per_day=" + avg_rate_per_day + ", email=" + email
				+ ", phone1=" + phone1 + ", phone2=" + phone2 + ", website=" + website + "]";
	}
	

}