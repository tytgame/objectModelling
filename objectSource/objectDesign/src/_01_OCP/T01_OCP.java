package _01_OCP;
class Player {
	void play() {
		System.out.println("play wav");
	}
	// 나중에 기능 추가
	void mp3Play() {
		System.out.println("play mp3");
	}	
}
public class T01_OCP {
	public static void main(String[] args) {
		Player player = new Player();
		player.play();
		player.mp3Play();
		
		
		
	}

}
