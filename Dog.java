package rensyu2;

public class Dog {
	private String name;
	private int age;
	private String type;

	public Dog(String t) {
		this.type = t;
	}

	public void setName(String nm) {
		name = nm;
	}

	public void setAge(int a) {
		age = a;
	}

	public void showProfile() {
		System.out.println(type + "の名前は" + name + "、" + age +"歳です。");
	}

}
