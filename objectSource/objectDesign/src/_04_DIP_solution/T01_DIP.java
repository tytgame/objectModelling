package _04_DIP_solution;
/*
 * 의존 역전 원칙 (DIP, Dependency Inversion Principle)
   - 고수준 모듈은 저수준 모듈의 구현에 의존해서는 안된다
   	 : 즉, interface(or 추상클래스)에 의존 해야지, 구현 클래스에 의존해서는 안된다
 */
public class T01_DIP {
	public static void main(String[] agrs) {
		Pet pet = new Pet();
		
		pet.setPetInter(new Cat());
		System.out.println(pet.getPetInter());
		
		pet.setPetInter(new Dog());
		System.out.println(pet.getPetInter());
		
		pet.setPetInter(new Hamster());
		System.out.println(pet.getPetInter());
	}
}
