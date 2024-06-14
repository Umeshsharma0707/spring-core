package com.springcore.practice;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Developer {
	private List<String> skills;
	private float salary;
	
	private Set<String> addresses;
	private Map<String, String> games;
	
	private Properties props;
	
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getGames() {
		return games;
	}
	public void setGames(Map<String, String> games) {
		this.games = games;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public String toString() {
		return "Developer [skills=" + skills + ", salary=" + salary + ", addresses=" + addresses + ", games=" + games
				+ ", props=" + props + "]";
	}
	public Developer(List<String> skills, float salary, Set<String> addresses, Map<String, String> games,
			Properties props) {
		super();
		
		System.out.println("developer constructor");
		this.skills = skills;
		this.salary = salary;
		this.addresses = addresses;
		this.games = games;
		this.props = props;
	}
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
