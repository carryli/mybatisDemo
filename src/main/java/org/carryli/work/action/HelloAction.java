package org.carryli.work.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String execute()
	{
	    if (getAge()==6 &&
		getName().equals("root"))
	    {
		return SUCCESS;
	    }
	    return ERROR;
	}

}
