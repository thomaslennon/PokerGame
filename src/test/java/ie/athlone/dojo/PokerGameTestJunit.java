package ie.athlone.dojo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PokerGameTestJunit {

    @Test
    public void pokerGamePlayHighcardWins(){
        Hand player1 = new Hand(Card.twoHearts, Card.twoDiamonds, Card.threeHearts, Card.fourSpades, Card.fiveClubs);
        Hand player2High = new Hand(Card.twoClubs, Card.twoDiamonds, Card.eightClubs, Card.fiveClubs, Card.aceClubs);

        String result = PokerGame.play(player1, player2High);
        assertEquals("Second Hand Wins. High Card: AC", result);
    }
}