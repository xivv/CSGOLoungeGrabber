# CSGOLoungeGrabber
Java libary to retrieve matchinformation about listed matches on csgolounge

Changelog:

      - 22.09.16 Updated for Gambling update


>Information example with match.toString() :

>[ TIME STATUS TEAM1 vs TEAM2 FORMAT EVENT COMMENT WIN1 WIN2 MATCHURL]

>[2 days ago LIVE BD vs DNA BO3 GameShow Open Wrong information given about start time. false false https://csgolounge.com/match?m=10291]




How to use 

	Download and implement the jar in your build.


	MatchPackage pack = new MatchPackage();

		for (Match match : pack.getMatchList()) {
			System.out.println(match);
		}
		
		pack.update();
