package com.medslama.persistence.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "app_group")
public class Group {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(unique = true, nullable = false)
	private String name;

	private String description;

	private Integer usersNumber;

	@OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
	private List<User> users;

	public Group() {
		super();
	}

	public Group(Integer id, String name, String description, Integer usersNumber, List<User> users) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.usersNumber = usersNumber;
		this.users = users;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getUsersNumber() {
		return usersNumber;
	}

	public void setUsersNumber(Integer usersNumber) {
		this.usersNumber = usersNumber;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}