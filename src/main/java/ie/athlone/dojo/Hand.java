package ie.athlone.dojo;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * This is a special collection of cards
 */
public final class Hand{

    private Collection<Card> cards = new HashSet<>(5);

    //Cards must be unique
    public Hand(Card card1, Card card2, Card card3, Card card4, Card card5){
        this.cards.add(card1);
        this.cards.add(card2);
        this.cards.add(card3);
        this.cards.add(card4);
        this.cards.add(card5);
    }


    public Card highestCard(){
        Card currentHighest =  (Card)(cards.toArray())[0];
        for(Card card : cards){
            int result = card.compare(card, currentHighest);
            if(result>0){
                currentHighest = card;
            }
        }
        return currentHighest;
    }



}
