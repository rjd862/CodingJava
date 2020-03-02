import java.util.Scanner;

public class GetCardsDeck {

	String plr1,plr2;
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		//int j;
		System.out.println("START THE GAME");
		System.out.println("*******************************************************");
		System.out.println("Enter number of players");
		int a=in.nextInt();
		while(true){
		
			System.out.println("ENTER THE PLAYER NUMBER: EX:ENTER 1 FOR PLAYER1, 2 FOR PLAYER 2...");
			if(a==1){
			player_chose1();
			}
			else if(a==2){
				player_chose2();
			}
			if(pl1r>pl2r){
				System.out.println("PLAYER 1 WON");
				break;
			}
				else{
					System.out.println("PLAYER 2 WON");
					break;
				}
			
		}
		
		CardsDeck player = new CardsDeck();
	    player.shuffle();
	    System.out.println("*********SHUFFLE AND PRINT ALL THE CARDS*********");
	    player.deal();// TODO Auto-generated method stub
	    in.close();
	}

}
