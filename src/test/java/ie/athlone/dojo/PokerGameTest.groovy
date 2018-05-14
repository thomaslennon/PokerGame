package ie.athlone.dojo

class PokerGameTest extends spock.lang.Specification {
    def "Test highest card"() {
        expect:
        PokerGame.play(first, second) == result

        where:
        first | second || result
        new Hand(Card.oneClubs, Card.twoDiamonds, Card.threeHearts, Card.fourSpades, Card.fiveClubs) | new Hand(Card.twoClubs, Card.twoDiamonds, Card.eightClubs, Card.fiveClubs, Card.aceClubs) || "Second Hand Wins. High Card: AC"
        new Hand(Card.twoClubs, Card.twoDiamonds, Card.eightClubs, Card.fiveClubs, Card.aceClubs)| new Hand(Card.oneClubs, Card.twoDiamonds, Card.threeHearts, Card.fourSpades, Card.fiveClubs)  || "First Hand Wins. High Card: AC"
    }
}
