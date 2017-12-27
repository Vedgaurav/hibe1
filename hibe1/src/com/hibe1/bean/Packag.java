package com.hibe1.bean;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="pack")
public class Packag implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pack_id")
	private int id;
	
	private String des;
	private float rate;
	
	public Packag() {
		super();// TODO Auto-generated constructor stub
	}

	public Packag(int id, String des, float rate) {
		super();
		this.id = id;
		this.des = des;
		this.rate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}
	

}
