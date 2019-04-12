package com.healogics.iheal.bean;

import java.io.Serializable;

import com.healogics.iheal.utility.IHealResponse;

public class ProblemsLoadResponse extends IHealResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private ProblemsLoadOutBean problems;

	public ProblemsLoadOutBean getProblems() {
		return problems;
	}
	
	public void setProblems(ProblemsLoadOutBean problems) {
		this.problems = problems;
	}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("ProblemsLoadBean [document=");
			builder.append(problems);
			builder.append("]");
			return builder.toString();
		}
	
}
