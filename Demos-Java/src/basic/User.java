package basic;

import java.util.Date;

public class User {
	
	public static int v = 0;

	private int id;
	private String name;
	private int age;
	private String gender;
	private Date hireDate;

	public User() {

	}

	public User(String name, int age, String gender, Date hireDate) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hireDate = hireDate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

}
