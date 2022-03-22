package com.greatlearning.department;

public class HrDepartment extends SuperDepartment
{
	
	
	public String departmentName()
	{
		String deptname="Wecome to Hr Department";
		return deptname;
	}
	
	public String getTodaysWork()
	{
		String todayswork="Fill today’s worksheet and mark your attendance";
		return todayswork;
	}
	
	public String getWorkDeadline()
	{
		String workdeadline="Complete by EOD ";
		return workdeadline;
	}
	
	public String doActivity()
	{
		String activity="team Lunch";
		return activity;
	}


}
