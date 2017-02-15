# CSGOLoungeGrabber
Java libary to retrieve matchinformation about listed matches on https://csgolounge.com/

### Code Coverage: 75%

## Changelog:

      - 22.09.16 Updated for Gambling update
      - 25.09.16 Added TeamLogos
      - 11.10.16 Reupdated new "Gambling" update
      - 15.02.17 Updated for infrastructure changes of the website
      


>Information example with match.toString() :

| Information   | getter        |
| ------------- |:-------------:|
| TIME          | getTime()     |
| STATUS        | getStatus()   |
| ...           | ...           |

>[ TIME STATUS TEAM1 vs TEAM2 FORMAT EVENT COMMENT WIN1 WIN2 MATCHURL TEAM1LOGO TEAM2LOGO TEAM1PERCENT TEAM2PERCENT]

>[32 minutes from now ONCOMING ArchAngel vs temp.no BO3 iGame false false https://csgolounge.com/match?m=11735 http://csgolounge.com/img/teams/ArchAngel.jpg?1465819889 http://csgolounge.com/img/teams/temp.no.jpg?1465819889 78% 22%]




## How to use 




	MatchPackage pack = new MatchPackage();

		for (Match match : pack.getMatchList()) {
			System.out.println(match.getTeam1Name());
		}
		
		pack.update();
		

		
## Example

	Download and implement the jar in your build.


	MatchPackage pack = new MatchPackage();

		for (Match match : pack.getMatchList()) {
			System.out.println(match);
		}
		
		pack.update();
