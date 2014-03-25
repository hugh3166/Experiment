package inlinesingleton;

import java.io.BufferedReader;

public class Console {
	private static HitStayResponse hitStayResponse = new HitStayResponse();
	
	private Console() {
		super();
	}
	
	public static HitStayResponse obtainHitStayResponse(BufferedReader input) {
		hitStayResponse.readFrom(input);
		return hitStayResponse;
	}
	
	public static void setPlayerResponse(HitStayResponse newHitStayResponse) {
		hitStayResponse = newHitStayResponse;
	}

}
