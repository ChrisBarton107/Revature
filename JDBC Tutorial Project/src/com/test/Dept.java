package com.test;

public class Dept {
	
	private int deptNum;
	private String deptName;
	private String loc;
	
	public Dept(int deptNum, String deptName, String loc) {
		super();
		this.deptNum = deptNum;
		this.deptName = deptName;
		this.loc = loc;
	}

	
	public int getDeptNum() {
		return deptNum;
	}

	public void setDeptNum(int deptNum) {
		this.deptNum = deptNum;
	}

	
	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	
	
	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	
	public String toString() {
		return "DeptNum: " + deptNum + ", " + "DeptName: " + deptName + ", " + "Loc: " + loc;
	}
	

}
