package _03_ISP;

public class Ambulance implements Car {

	@Override
	public void drive() {
		System.out.println("운전중");
		// TODO Auto-generated method stub

	}

	@Override
	public void turnLeft() {
		System.out.println("좌회전");
		// TODO Auto-generated method stub

	}

	@Override
	public void turnRight() {
		System.out.println("우회전");
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		System.out.println("멈춤");
		// TODO Auto-generated method stub

	}

	@Override
	public void water() {

	}

	@Override
	public void patientTransport() {
		System.out.println("환자이송");

	}

}
