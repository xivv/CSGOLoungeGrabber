package terminal;

import data.MatchPackage;
import match.Match;

public class Terminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MatchPackage pack = new MatchPackage();

		for (Match match : pack.getMatchList()) {
			System.out.println(match);
		}

	}

}
