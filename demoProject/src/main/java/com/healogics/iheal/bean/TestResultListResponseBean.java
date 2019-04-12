package com.healogics.iheal.bean;

import java.io.Serializable;
import java.util.List;

public class TestResultListResponseBean implements Serializable {

	private static final long				serialVersionUID	= 1L;

	private List<TestResultListBean>	results;

	public List<TestResultListBean> getResults() {
		return results;
	}

	public void setResults(List<TestResultListBean> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestResultLoadResponseBean [results=");
		builder.append(results);
		builder.append("]");
		return builder.toString();
	}

}
