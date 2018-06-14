package ie.athlone.dojo;

public class PokerGame {

    private static final String FIRST = "First";
    private static final String SECOND = "Second";
    private static final String HAND_WINS = " Hand Wins. ";
    private static final String HIGH_CARD = "High Card: ";


    public static String play(Hand first, Hand second){
        StringBuilder result = new StringBuilder();
        Card firstHandHighCard = first.highestCard();
        Card secondHandHighCard = second.highestCard();

        int comparison = firstHandHighCard.compare(firstHandHighCard, secondHandHighCard);

        if(comparison>0){
            result.append(FIRST);
            result.append(HAND_WINS);
            result.append(HIGH_CARD);
            result.append(firstHandHighCard);
        }else if(comparison<0){
            result.append(SECOND);
            result.append(HAND_WINS);
            result.append(HIGH_CARD);
            result.append(secondHandHighCard);
        }else{
            //Next rule
        }
        return result.toString();
    }

}
