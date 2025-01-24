package _03_ISP_solution;

public class FireEngine implements Car {

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
	

	public void water() {
		System.out.println("물뿌리기");
	}

	@Override
	public void patientTransport() {
	

	}

}
