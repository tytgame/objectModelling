package _03_ISP;
/* 
 * 인터페이스 분리 원칙 (ISP, Interface Segregation Principle)
  - 자신이 사용하지 않는 인터페이스와 의존 관계를 맺거나 영향을 받지 않아야 한다
 */
public class T01_ISP {

	public static void main(String[] args) {
		Car car = new Sedan();
		car.drive();
		car.turnLeft();
		car.water();
		car.patientTransport();
		car.stop();
		
		
		

	}

}
