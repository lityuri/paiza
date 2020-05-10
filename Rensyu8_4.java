package rensyu2;

public class Rensyu8_4 {
	public static void main(String[] args) {
		Animal[] animal = new Animal[4];
		animal[0] = new Cat();
		animal[2] = new Cat();
		animal[1] = new Inu();
		animal[3] = new Inu();

		for (int i = 0; i < animal.length; i ++) {
			animal[i].speak();
		}
	}
}
