package com.healogics.pretx.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(schema = "public", name = "casecategory")
public class CaseCategory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "categoryid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long	categoryid;

	private String	name;

	public Long getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CaseCategory() {
		super();
	}

	public CaseCategory(Long categoryid) {
		super();
		this.categoryid = categoryid;
	}

}
