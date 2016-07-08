package data;

import java.util.ArrayList;
import java.util.List;

import match.Loader;
import match.Match;

public class MatchPackage {

	private List<Match> matchList = new ArrayList<>();

	public MatchPackage() {
		update();
	}

	public void update() {
		String data = new Loader().getStrFromUrl("https://csgolounge.com/");
		matchList = new Loader().getMatches(data);
	}

	public List<Match> getMatchList() {
		return matchList;
	}
}
