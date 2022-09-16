package javabook2.ch11.sec03.deepclone;

import java.util.Arrays;

public class Member implements Cloneable{
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	// 객체 깊은 복제(얕은복제 포함)
	@Override 
	protected Object clone() throws CloneNotSupportedException{
		Object obj = null;
		
		// 얕은복제 : name, age
		Member cloned =(Member)super.clone();
		
		// 깊은복제  1: scores
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);		// 깊은복제  2: car
		
		// 깊은 복제 2 : car
		cloned.car = new Car(this.car.model);
		
		obj = cloned;
				
		return cloned;
	}
	
	
	// 객체 얕은 복제
	public Member getMember() {
		Member cloned = null;
		try
		{
			cloned =(Member)clone();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
		
		
		return cloned;
	}
	
	
	
}
