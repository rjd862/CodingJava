public class CardsDeck extends Card{
  //private Card theCard;
	String[] rankA=new String[52];
	  String[] suitA=new String[52];
	  String pl1r,pl2r,pl1s,pl2s;
  private int remainingCards = 52;

  CardsDeck() {
    new Card();   
  }

  public void shuffle(){
	  
		    for (int i = 0; i < deck.length; i++) {
		       int index = (int)(Math.random()*deck.length);
		       int temp = deck[i];
		       deck[i] = deck[index];
		       deck[index] = temp;
		     
		  }
  }

  public void deal(){
	  
	  
    for (int i = 0; i < 52; i++) {
       String suit = suits[deck[i] / 13];
       String rank = ranks[deck[i] % 13];
       System.out.println( rank + " of " + suit);
       System.out.println("Remaining cards: " + --remainingCards);
       rankA[i]=rank;
       suitA[i]=suit;
     }
    System.out.println("*******************************************************");
   }
  
  public int CardsDeck.player_chose1(){
	  int index = (int)(Math.random());
		  System.out.println( rankA[index] + " of " + suitA[index]);
		pl1r=rankA[index];
		pl1s=suitA[index];
	  return 1;
  }
  public void CardsDeck.player_chose2(){
	  int index = (int)(Math.random());
		  System.out.println( rankA[index] + " of " + suitA[index]);
		  pl2r=rankA[index];
			pl2s=suitA[index];
	  
  }
}