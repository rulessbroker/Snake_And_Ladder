package Snake_and_Ladder;

public class SnakeAndLadder {
	
		static final int startPosition = 0;
		static final int snakeOption = 1;
		static final int ladderOption = 2;
		static final int vikram = 1;
	    static final int vedha = 2;
		
	public static void main(String[] args) {
		
			int dieNumber, option;
			int dieCount = 0;
			int vikramPosition = startPosition;
	        int vedhaPosition = startPosition;
	        int currentPlayer = vikram;


        while (vikramPosition < 100 && vedhaPosition < 100){
            dieNumber = rollDie();
            dieCount++;
            System.out.println("#"+dieCount);
            System.out.println("Die Number = "+dieNumber);

            option = checkOption();

            switch (option){
                case ladderOption:
                    System.out.println("ladder option");
                    if (currentPlayer == vikram) {
                        vikramPosition += dieNumber;
                    }else {
                        vedhaPosition += dieNumber;
                    }
                    break;
                    
                case snakeOption:
                    System.out.println("snake option");
                    if (currentPlayer == vikram) {
                        vikramPosition -= dieNumber;
                    }else {
                        vedhaPosition -= dieNumber;
                    }
                    currentPlayer = switchPlayer(currentPlayer);
                    break;
                    
                default:
                    System.out.println("No Play option");
                    currentPlayer = switchPlayer(currentPlayer);
                    break;
            }

            //ensure start position and exact winning position
            
            if (vikramPosition < 0){
                vikramPosition = 0;
            } else if (vedhaPosition < 0){
                vedhaPosition = 0;
            }else if (vikramPosition > 100) {
                vikramPosition -= dieNumber;
            } else if (vedhaPosition > 100) {
                vedhaPosition -= dieNumber;
            }

            System.out.println("current Vikram's position : "+vikramPosition);
            System.out.println("current Vedha's position : "+vedhaPosition);

        }
        
        System.out.println("*******************************");
        showWinner(vikramPosition,vedhaPosition);
        System.out.println("Number of times die played = "+dieCount);
    }

    static int rollDie(){
        return (int) (Math.random()*6) +1;
    }
    static int checkOption(){
        return (int) (Math.random()*3);
    }
    static int switchPlayer(int currentPlayer){
        if (currentPlayer == vikram) {
            return vedha;
        }else {
            return vikram;
        }
    }

    static void showWinner(int vikram, int vedha){
        if (vikram == 100){
            System.out.println("Vikram is Winner");
        } else if (vedha == 100) {
            System.out.println("Vedha is Winner");
        }
    }
}