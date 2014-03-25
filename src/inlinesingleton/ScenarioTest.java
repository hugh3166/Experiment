package inlinesingleton;

import junit.framework.TestCase;

public class ScenarioTest extends TestCase {
	public void testDealerStandsWhenPlayerBusts() {
		Console.setPlayerResponse(new TestAlwaysHitResponse());
		int[] deck = { 10, 9, 7, 2, 6 };
		Blackjack blackjack = new Blackjack(deck);
		blackjack.play();
		
		assertTrue("dealer wins", blackjack.didDealerWin());
		assertTrue("player loses", !blackjack.didPlayerWin());
		assertEquals("dealer total", 11, blackjack.getDealerTotal());
		assertEquals("player total", 23, blackjack.getPlayerTotal());
	}
}
