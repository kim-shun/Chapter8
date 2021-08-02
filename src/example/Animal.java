package example;

public class Animal {
	private String name;
	private int age;
	private boolean hungry;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
	
	public boolean isHungry() {
		return hungry;
	}
	
	public void printMessage(String message) {
		System.out.println(name + "> " + message);
	}

	public void introduceMyself() {
		printMessage("名前は" + getName() + "です、" + getAge() + "歳です。");
	}
}
