package javabook2.ch11.sec03.clone;

public class Member implements Cloneable {
	public String id;
	public String name;
	public String pwd;
	public int age;
	public boolean adult; // 성인 여부

	public Member(String id, String name, String pwd, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.adult = adult;
	}

	public Member getMember() {
		Member cloned = null;

		try {
			cloned = (Member) clone();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return cloned;
	}

}
