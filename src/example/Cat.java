package example;

public class Cat extends Animal {
	public Cat(String name, int age) {
		setName(name);
		setAge(age);
		System.out.println("コンストラクター:Cat(String name, int age)が呼び出された");
		System.out.println("  引数:name = " + name + ", age = " + age);
	}
}
