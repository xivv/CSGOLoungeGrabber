# CSGOLoungeGrabber
Java libary to retrieve matchinformation about listed matches on csgolounge

How to use 


	MatchPackage pack = new MatchPackage();

		for (Match match : pack.getMatchList()) {
			System.out.println(match);
		}
		
		pack.update();
