package com.healogics.iheal.bean;

import java.io.Serializable;
import java.util.List;

public class ProblemsLoadOutBean  implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<ProblemsLoadBean> problems;

	public List<ProblemsLoadBean> getProblems() {
		return problems;
	}

	public void setProblems(List<ProblemsLoadBean> problems) {
		this.problems = problems;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProblemsOutLoadBean [problems=");
		builder.append(problems);
		builder.append("]");
		return builder.toString();
	}
}
