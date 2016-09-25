# CSGOLoungeGrabber
Java libary to retrieve matchinformation about listed matches on csgolounge

Changelog:

      - 22.09.16 Updated for Gambling update
      - 25.09.16 Added TeamLogos
      


>Information example with match.toString() :

>[ TIME STATUS TEAM1 vs TEAM2 FORMAT EVENT COMMENT WIN1 WIN2 MATCHURL TEAM1LOGO TEAM2LOGO]

>[20 hours from now ONCOMING HR vs Na'Vi BO1 ESL false false https://csgolounge.com/match?m=11470 http://csgolounge.com/img/teams/HR.jpg?1465819889 http://csgolounge.com/img/teams/Na\]




How to use 

	Download and implement the jar in your build.


	MatchPackage pack = new MatchPackage();

		for (Match match : pack.getMatchList()) {
			System.out.println(match);
		}
		
		pack.update();
