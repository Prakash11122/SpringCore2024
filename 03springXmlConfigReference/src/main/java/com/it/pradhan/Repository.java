package com.it.pradhan;

public class Repository {
	
	private String entity;

	public Repository(String entity) {
		super();
		this.entity = entity;
	}

	public Repository() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	@Override
	public String toString() {
		return "Repository [entity=" + entity + "]";
	}
	
	

}
