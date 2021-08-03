package example;

public class ExtendSampleApp {

	public static void main(String[] args) {
		Cat tama = new Cat("タマ", 3);
		
		tama.eat();
		tama.introduceMyself();
		tama.setAge(4);
		tama.introduceMyself();

		Dog pochi = new Dog("ポチ", 5);
		
		pochi.eat();
		pochi.introduceMyself();
		
	}

}
