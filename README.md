# CSGOLoungeGrabber
Java libary to retrieve matchinformation about listed matches on csgolounge

>Information example with match.toString() :

>[ TIME STATUS PERCENT1 TEAM1 vs TEAM2 PERCENT2 FORMAT EVENT COMMENT WIN1 WIN2 MATCHURL]

>[2 days ago LIVE 63% BD vs DNA 37% BO3 GameShow Open Wrong information given about start time. false false https://csgolounge.com/match?m=10291]




How to use 


	MatchPackage pack = new MatchPackage();

		for (Match match : pack.getMatchList()) {
			System.out.println(match);
		}
		
		pack.update();
