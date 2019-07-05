package com.kyro.provider.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sequence;

	@Column(name = "username", nullable = false, length = 128, unique = true)
	private String username;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "full_name", nullable = false, length = 32)
	private String full_name;

	@Column(name = "store_name", nullable = false, length = 32)
	private String store_name;

	@Column(name = "country_code", nullable = false, length = 5)
	private String country_code;

	@Column(name = "city", length = 128)
	private String city;

	@Column(name = "address")
	private String address;

	@Column(name = "email", length = 64)
	private String email;

	@Column(name = "tel_no", length = 20)
	private String tel_no;

	@Column(name = "hp_no", length = 20)
	private String hp_no;

	@Column(name = "permission", nullable = false)
	private int permission;

	@Column(name = "manager_id", nullable = false, length = 32)
	private String manager_id;

	@Column(name = "access_token", length = 16)
	private String access_token;

	@Column(name = "del", nullable = false)
	private int del;

	// Join table
//	@OneToMany(mappedBy = "user_sequence")
//	private List<Device> devices;
//
//	public List<Device> getDevices() {
//		return devices;
//	}
//
//	public void setDevices(List<Device> devices) {
//		this.devices = devices;
//	}

	// Constructors
	public User() {
	}

	// Getter and setter
	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel_no() {
		return tel_no;
	}

	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}

	public String getHp_no() {
		return hp_no;
	}

	public void setHp_no(String hp_no) {
		this.hp_no = hp_no;
	}

	public int getPermission() {
		return permission;
	}

	public void setPermission(int permission) {
		this.permission = permission;
	}

	public String getManager_id() {
		return manager_id;
	}

	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

}