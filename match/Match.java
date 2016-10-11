package match;

public class Match {

	public enum MatchStatus {
		LIVE, PLAYED, ONCOMING, ERROR
	};

	public enum MatchFormat {
		BO1, BO2, BO3, BO5, ERROR
	};

	private String team1Name;

	private String team2Name;

	private MatchStatus status;

	private MatchFormat format;

	private String event;

	private String time;

	private String comment;

	private boolean team1Won;

	private boolean team2Won;

	private String matchURL;

	private String team1LogoURL;

	private String team2LogoURL;

	private String team1Percent;

	public String getTeam1Percent() {
		return team1Percent;
	}

	public String getTeam2Percent() {
		return team2Percent;
	}

	private String team2Percent;

	public String toString() {

		if (comment.equals(""))
			return "[" + time + " " + status.toString() + " " + team1Name + " vs " + team2Name + " " + format.toString()
					+ " " + event + " " + team1Won + " " + team2Won + " " + matchURL + " " + team1LogoURL + " "
					+ team2LogoURL + " " + team1Percent + " " + team2Percent + "]";
		else
			return "[" + time + " " + status.toString() + " " + team1Name + " vs " + team2Name + " " + format.toString()
					+ " " + event + " " + comment + " " + team1Won + " " + team2Won + " " + matchURL + " "
					+ team1LogoURL + " " + team2LogoURL + " " + team1Percent + " " + team2Percent + "]";
	}

	public Match(String team1Name, String team2Name, MatchStatus status, MatchFormat format, String event, String time,
			String comment, boolean team1Won, boolean team2Won, String matchURL, String team1LogoURL,
			String team2LogoURL,String team1Percent,String team2Percent) {
		super();
		this.team1Name = team1Name;
		this.team2Name = team2Name;
		this.status = status;
		this.format = format;
		this.event = event;
		this.time = time;
		this.comment = comment;
		this.team1Won = team1Won;
		this.team2Won = team2Won;
		this.matchURL = "https://csgolounge.com/match?m=" + matchURL;
		this.team1LogoURL = team1LogoURL;
		this.team2LogoURL = team2LogoURL;
		this.team1Percent = team1Percent;
		this.team2Percent = team2Percent;
	}

	public String getTeam1Name() {
		return team1Name;
	}

	public String getTeam2Name() {
		return team2Name;
	}

	public MatchStatus getStatus() {
		return status;
	}

	public MatchFormat getFormat() {
		return format;
	}

	public String getEvent() {
		return event;
	}

	public String getTime() {
		return time;
	}

	public String getComment() {
		return comment;
	}

	public boolean isTeam1Won() {
		return team1Won;
	}

	public boolean isTeam2Won() {
		return team2Won;
	}

	public String getMatchURL() {
		return matchURL;
	}

	public void setMatchURL(String matchURL) {
		this.matchURL = matchURL;
	}

	public String getTeam1LogoURL() {
		return team1LogoURL;
	}

	public String getTeam2LogoURL() {
		return team2LogoURL;
	}

}
