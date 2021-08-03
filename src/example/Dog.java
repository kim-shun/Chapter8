package example;

public class Dog extends Animal {
	public Dog(String name, int age) {
		setName(name);
		setAge(age);
		System.out.println("コンストラクター:Dog(String name, int age)が呼び出された");
		System.out.println("  引数:name" + name + ", age = " + age);
	}
	
	public void eat() {
		eat("ご飯");
	}
	
	public void eat(String food) {
		printMessage(food + "を食べるよ！おいしいワン");
		printMessage("お腹が一杯になったワン");
		setHungry(false);
	}

	public void playToy(String toy) {
		printMessage(toy + "で遊ぶよ。おいしいワン");
		printMessage("お腹が一杯になったワン");
		setHungry(true);
	}
	
	public void playToy() {
		playToy("おもちゃ");
	}
}
