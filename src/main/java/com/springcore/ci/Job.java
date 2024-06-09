package com.springcore.ci;

public class Job {
	private String jobName;
	private int salary;
	private String companyName;
	public Job() {
		super();
		
	}
	public Job(String jobName, int salary, String companyName) {
		super();
		this.jobName = jobName;
		this.salary = salary;
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Job [jobName=" + jobName + ", salary=" + salary + ", companyName=" + companyName + "]";
	}
	
	
}
