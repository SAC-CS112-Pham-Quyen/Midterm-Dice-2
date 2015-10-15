import java.util.Scanner;

	
public class Midterm_Dice_2 {
	
		
		public static void main(String[] args ){
			Scanner inp = new Scanner( System.in );
			
			int userNum;
			int computerNum;
			for (int round = 1; round < 30; round++) {
				
				computerNum = 1 + (int) (Math.random() * 6 );
				System.out.println("Pick Dice number between 1 and 6");
				userNum = inp.nextInt();
				System.out.printf("Random number is %d\n", computerNum);
				
				if (userNum == computerNum) {
					 System.out.println("You hit the jackpot!!");
				 }
				
				if (userNum > computerNum)    {
					System.out.println ("Too Big, you lost");
				}
				else 	{
					System.out.println("Do you still want to play? Then");
				}
					
				 if (userNum < computerNum)   		{
					System.out.println ("Too Small, you lost"); 
				}
				else 			{
					System.out.println ("Do you still want play? Then");
				}	
				 
					 
			}					
			
			System.out.println("Sorry, Your time is up, Bye!");
			inp.close();
		}
		
	}

