package com.healogics.iheal.bean;

import java.io.Serializable;
import java.util.List;

public class DocumentGroupResponseBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<DocumentGroupBean> groups;
	
	public List<DocumentGroupBean> getGroups() {
		return groups;
	}
	
	public void setGroups(List<DocumentGroupBean> groups) {
		this.groups = groups;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DocumentCategoryResponseBean [groups=");
		builder.append(groups);
		builder.append("]");
		return builder.toString();
	}
	
}
