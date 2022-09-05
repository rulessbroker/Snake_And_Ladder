package Snake_and_Ladder;

public class SnakeAndLadder {
	
	static int startPosition = 0;
	
	public static void main(String[] args) {
		
		int position = startPosition;
		
		System.out.println("Current Position = " +position);
		
		int dieNumber=rollDie();

	        System.out.println("Die Number = "+dieNumber);
	    }
	    static int rollDie(){
	        int random= (int) (Math.random()*6) + 1;
	        return random;
	}
}
