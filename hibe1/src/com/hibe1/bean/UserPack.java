package com.hibe1.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="userpack")
public class UserPack implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="slno")
	private int slno;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date datetime;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user_id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pack_id")
	private Packag pack;
	
	public UserPack() {
		super();// TODO Auto-generated constructor stub
	}

	public UserPack(int slno, Date datetime, User user_id, Packag pack) {
		super();
		this.slno = slno;
		this.datetime = datetime;
		this.user_id = user_id;
		this.pack = pack;
	}

	public int getSlno() {
		return slno;
	}

	public void setSlno(int slno) {
		this.slno = slno;
	}

	public Date getDatetime() {
		return datetime;
	}

	@PrePersist
    protected void onCreate() {
        datetime = new Date();
    }


	public User getUser_id() {
		return user_id;
	}

	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}

	public Packag getPack() {
		return pack;
	}

	public void setPack(Packag pack) {
		this.pack = pack;
	}

	
	
	
	
}
