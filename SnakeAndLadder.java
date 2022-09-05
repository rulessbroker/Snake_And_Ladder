package Snake_and_Ladder;

public class SnakeAndLadder {
	
	static final int startPosition = 0;
	static final int snakeOption = 1;
	static final int ladderOption = 2;
	
	public static void main(String[] args) {
		
		int dieNumber, option;
		int position = startPosition;
		
		 dieNumber = rollDie();
	        System.out.println("Die Number = "+dieNumber);
	        
	        option=checkOption();

	        switch (option){
	            case ladderOption:
	                System.out.println("ladder option");
	                position += dieNumber;
	                break;
	            case snakeOption:
	                System.out.println("snake option");
	                position -= dieNumber;
	                break;
	            default:
	                System.out.println("No Play option");
	                break;
	        }
	        
	        System.out.println("current position : "+position);
	        
	    }
	    static int rollDie(){
	        int random = (int) (Math.random()*6) + 1;
	        return random;
	}
	    static int checkOption(){
	        int random = (int) (Math.random()*3);
	        return random;
	    }
}
