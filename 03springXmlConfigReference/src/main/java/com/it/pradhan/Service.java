package com.it.pradhan;

public class Service {
	
	private Repository repo;

	public Service(Repository repo) {
		super();
		this.repo = repo;
	}

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Service [repo=" + repo + "]";
	}

	public Repository getRepo() {
		return repo;
	}

	public void setRepo(Repository repo) {
		this.repo = repo;
	}
	
	

}
