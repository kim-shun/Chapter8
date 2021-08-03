package example;

public class Cat extends Animal {
	public Cat(String name, int age) {
		setName(name);
		setAge(age);
		System.out.println("コンストラクター:Cat(String name, int age)が呼び出された");
		System.out.println("  引数:name = " + name + ", age = " + age);
	}
	
	public void eat() {
		eat("ご飯");
	}
	
	public void eat(String food) {
		printMessage(food + "を食べるよ！おいしいにゃー");
		printMessage("お腹が一杯になったにゃー");
		setHungry(false);
	}
	
	public void playToy(String toy) {
		printMessage(toy + "で遊ぶよ。楽しいにゃー");
		printMessage("遊んでお腹が減ったにゃー");
		setHungry(true);
	}
	
	public void playToy() {
		playToy("おもちゃ");
	}
}
