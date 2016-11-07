package card_game;

import java.util.*;

public class Game extends Deck{

  private ArrayList<Player> players = new ArrayList<Player>();

  public Game(){
    buildDeck();
    shuffleDeck();
  }

  public void shuffleDeck(){
    Collections.shuffle(fullDeck);
  }

  public ArrayList<Card> getDeck(){
    return this.fullDeck;
  }

}