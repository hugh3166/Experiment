package inlinesingleton;

import java.io.BufferedReader;

public class Blackjack {
	private BufferedReader input;
	private Player player;
	private Dealer dealer;
	
	public Blackjack(int[] deck) {
		super();
	}
	
	public void play() {
		deal();
		writeln(player.getHandAsString());
		writeln(dealer.getHandAsStringWithFirstCardDown());
		
		HitStayResponse hitStayResponse;
		do {
			write("H)it or S)tay: ");
			hitStayResponse = Console.obtainHitStayResponse(input);
			write(hitStayResponse.toString());
			if (hitStayResponse.shouldHit()) {
				dealCardTo(player);
				writeln(player.getHandAsString());
			}
		} while(canPlayerHit(hitStayResponse));
	}
	
	private void write(String str) {
		// simplify
		System.out.print(str);
	}
	
	private void writeln(String str) {
		// simplify
		System.out.println(str);
	}
	
	private void deal() {
		// simplify
	}
	
	private void dealCardTo(Player plyer) {
		// simplify
	}
	
	private boolean canPlayerHit(HitStayResponse hitStayResponse) {
		// simplify
		return true;
	}

	public boolean didDealerWin() {
		// simplify
		return true;
	}

	public boolean didPlayerWin() {
		// simplify
		return false;
	}

	public int getDealerTotal() {
		// simplify
		return 11;
	}

	public int getPlayerTotal() {
		// simplify
		return 23;
	}
}
