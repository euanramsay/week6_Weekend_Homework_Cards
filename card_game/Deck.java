package card_game;
import java.util.*;

public abstract class Deck{

  public static ArrayList<Card> fullDeck;

  public Deck() {
    this.fullDeck = new ArrayList<Card>();
  }

  public void buildDeck(){
    for (int i = 1; i < 14; i++) {
      for(SuitType suit : SuitType.values()){
        fullDeck.add(new Card(i, suit));
      }
    }
  }
}
