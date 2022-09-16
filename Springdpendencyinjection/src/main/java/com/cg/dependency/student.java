package com.cg.dependency;

public class student 
{
	private int id;
    private String StudentName;
    
    public student(int id, String studentName) 
	{
		super();
		this.id = id;
		StudentName = studentName;
	}

	/*public void setStudentName(String studentName) 
	{
		StudentName = studentName;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}*/

	public void display()
	{
		System.out.println("Name of the student is : "+StudentName+ " and ID is : "+id);
	}

}