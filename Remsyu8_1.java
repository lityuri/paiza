package rensyu2;

public class Remsyu8_1 {
	public static void main(String[] args) {
		Cat c = new Cat();
		Inu d = new Inu();

		c.name = "miku";
		c.age = 15;
		d.name = "シナモン";
		d.age = 5;
		c.showProfile();
		d.showProfile();
		c.sleep();
		d.run();
		c.speak();
		d.speak();
	}

}
