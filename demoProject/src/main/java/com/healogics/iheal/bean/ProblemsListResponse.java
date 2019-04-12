package com.healogics.iheal.bean;

import java.io.Serializable;
import java.util.List;

import com.healogics.iheal.utility.IHealResponse;

public class ProblemsListResponse extends IHealResponse implements Serializable{

		private static final long serialVersionUID = 1L;
		
		private List<Document> problems;
		
		public List<Document> getProblems() {
			return problems;
		}
		
		public void setProblems(List<Document> problems) {
			this.problems = problems;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("ProblemsListBean [document=");
			builder.append(problems);
			builder.append("]");
			return builder.toString();
		}
	
}
