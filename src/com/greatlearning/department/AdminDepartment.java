package com.greatlearning.department;

public class AdminDepartment extends SuperDepartment
{
	
	
	public String departmentName()
	{
	    String deptname="Welcome to Admin Department ";
	    return deptname;
	}
	
	
	public String getTodaysWork()
	{
		String todayswork="Complete your documents Submission";
		return todayswork;
	}
	
	
	public String getWorkDeadline()
	{
		String workdeadline="Complete by EOD ";
		return workdeadline;
	}


}
