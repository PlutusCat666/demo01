package com.itheima.po;

public class Car {
	private String cname;
	private int num;
	
	public Car() {
		show();
		int count = 0;
		count++;
		System.out.println("执行了.." + count);
	}
	private Car(String cname,int num) {
		System.out.println("小汽车创建了...");
		this.cname = cname;
		this.num = num;
		return;
	}
	
	public static Car getCar() {
		return new Car();
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getCname() {
		return cname;
	}
	
	public void setNum(int num) {
		if(num > 3) {
			System.out.println("不行");
			return;
		}
		this.num = num;
	}
	public Integer getNum() {
		return num;
	}
	
	public void show() {
		System.out.println(cname + ":" + num);
	}
}
