package card_game;
public class Card {

  private int cardRank;
  private SuitType suit;

  public Card(int cardRank, SuitType suit) {
    this.cardRank = cardRank;
    this.suit = suit;
  }

  public SuitType getSuit(){
    return this.suit;
  }

  public int getCardRank(){
    return this.cardRank;
  }

}