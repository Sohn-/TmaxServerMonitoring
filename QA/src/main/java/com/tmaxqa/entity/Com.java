package com.tmaxqa.entity;

/**
 * 새 테이블 모델 클래스.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */

public class Com {
	
	private String ip;
	private String dept;
	private String owner;
	private String cpu;
	private String mem;
	private String dist;
	
	public Com() {
		super();
	}
	public Com(String ip, String dept, String owner, String cpu, String mem, String dist) {
		super();
		this.ip = ip;
		this.dept = dept;
		this.owner = owner;
		this.cpu = cpu;
		this.mem = mem;
		this.dist = dist;
	}
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getMem() {
		return mem;
	}
	public void setMem(String mem) {
		this.mem = mem;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	@Override
	public String toString() {
		return "Com [ip=" + ip + ", dept=" + dept + ", owner=" + owner + ", cpu=" + cpu + ", mem=" + mem + ", dist="
				+ dist + "]";
	}
	
	
	
	

}



