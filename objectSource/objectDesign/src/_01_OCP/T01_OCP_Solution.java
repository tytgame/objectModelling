package _01_OCP;

public class T01_OCP_Solution {

	public static void main(String[] args) {
		SoundPlayer sp = new SoundPlayer();
		
		sp.setPlayInter(new Wav());
		System.out.println("wav 파일 재생 : ");
		sp.play();
		
		sp.setPlayInter(new Mp3());
		System.out.println("mp3 파일 재생 : ");
		sp.play();
		
		sp.setPlayInter(new Ogg());
		System.out.println("ogg 파일 재생 : ");
		sp.play();
		
	}

}
