package ie.athlone.dojo

class PokerGameTest extends spock.lang.Specification {
    def "Test highest card"() {
        expect:
        PokerGame.play(first, second) == result

        where:
        first | second || result
        new Hand(Card.twoHearts, Card.threeDiamonds, Card.fiveSpades, Card.nineClubs, Card.fiveClubs) | new Hand(Card.twoClubs, Card.twoDiamonds, Card.eightClubs, Card.fiveClubs, Card.aceHearts) || "Second Hand Wins. High Card: AH"
        new Hand(Card.twoClubs, Card.twoDiamonds, Card.eightClubs, Card.fiveClubs, Card.aceHearts)| new Hand(Card.fiveSpades, Card.sevenDiamonds, Card.threeHearts, Card.fourSpades, Card.fiveClubs)  || "First Hand Wins. High Card: AH"
    }
}
