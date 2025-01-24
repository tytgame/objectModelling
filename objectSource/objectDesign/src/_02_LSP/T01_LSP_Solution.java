package _02_LSP;

class Dog {
	void speak() {
		System.out.println("멍멍");
	}
}
class WhiteDog extends Dog {
	String color = "white";

	
}
class BlackDog extends Dog {
	String color = "black";

	
}
public class T01_LSP_Solution {
	public static void main(String[] args) {
		Dog dog = new WhiteDog();
		System.out.println( ((WhiteDog)dog).color + "강아지의 소리 : " );
		dog.speak();

		dog = new BlackDog();
		System.out.println( ((BlackDog)dog).color + "강아지의 소리 : " );
		dog.speak();
	}

}
