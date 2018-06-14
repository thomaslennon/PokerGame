
package ie.athlone.dojo;


import java.util.Comparator;

public enum Card implements Comparator<Card> {

    //Hearts
    twoHearts ("2H", 2),
    threeHearts ("3H", 3),
    fourHearts ("4H", 4),
    fiveHearts ("5H", 5),
    sixHearts ("6H", 6),
    sevenHearts("7H", 7),
    eightHearts("8H", 8),
    nineHearts("9H", 9 ),
    tenHearts("10H", 10),
    jackHearts("JH", 11),
    queenHearts("QH", 12),
    kingHearts("KH", 13),
    aceHearts("AH", 14),
    //Diamonds
    twoDiamonds ("2D", 2),
    threeDiamonds ("3D", 3),
    fourDiamonds ("4D", 4),
    fiveDiamonds ("5D", 5),
    sixDiamonds ("6D", 6),
    sevenDiamonds("7D", 7),
    eightDiamonds("8D", 8),
    nineDiamonds("9D", 9 ),
    tenDiamonds("10D", 10),
    jackDiamonds("JD", 11),
    queenDiamonds("QD", 12),
    kingDiamonds("KD", 13),
    aceDiamonds("AD", 14),
    //Clubs
    twoClubs ("2C", 2),
    threeClubs ("3C", 3),
    fourClubs ("4C", 4),
    fiveClubs ("5C", 5),
    sixClubs ("6C", 6),
    sevenClubs("7C", 7),
    eightClubs("8C", 8),
    nineClubs("9C", 9 ),
    tenClubs("10C", 10),
    jackClubs("JC", 11),
    queenClubs("QC", 12),
    kingClubs("KC", 13),
    aceClubs("AC", 14),
    //Spades
    twoSpades ("2S", 2),
    threeSpades ("3S", 3),
    fourSpades ("4S", 4),
    fiveSpades ("5S", 5),
    sixSpades ("6S", 6),
    sevenSpades("7S", 7),
    eightSpades("8S", 8),
    nineSpades("9S", 9 ),
    tenSpades("10S", 10),
    jackSpades("JS", 11),
    queenSpades("QS", 12),
    kingSpades("KS", 13),
    aceSpades("AS", 14);

    private String cardCode;
    //Used to compare two cards together
    private int cardValue;

    Card(String code, int value){
        this.cardCode = code;
        this.cardValue = value;
    }

    @Override
    public String toString(){
        return this.cardCode;
    }

    @Override
    public int compare(Card firstCard, Card secondCard){
        int comparedValue;
        if(firstCard.cardValue == secondCard.cardValue){
            comparedValue = 0;
        }else if (firstCard.cardValue < secondCard.cardValue){
            comparedValue = -1;
        }else{
            comparedValue = 1;
        }
        return comparedValue;


    }

}
