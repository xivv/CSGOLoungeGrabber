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

	private String team1Percent;

	private String team2Percent;

	private boolean team1Won;

	private boolean team2Won;

	public String toString() {
		return "[" + time + " " + status.toString() + " " + team1Percent + " " + team1Name + " vs " + team2Name + " "
				+ team2Percent + " " + format.toString() + " " + event + " " + comment + " " + team1Won + " " + team2Won
				+ "]";
	}

	public Match(String team1Name, String team2Name, MatchStatus status, MatchFormat format, String event, String time,
			String comment, String team1Percent, String team2Percent, boolean team1Won, boolean team2Won) {
		super();
		this.team1Name = team1Name;
		this.team2Name = team2Name;
		this.status = status;
		this.format = format;
		this.event = event;
		this.time = time;
		this.comment = comment;
		this.team1Percent = team1Percent;
		this.team2Percent = team2Percent;
		this.team1Won = team1Won;
		this.team2Won = team2Won;
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

	public String getTeam1Percent() {
		return team1Percent;
	}

	public String getTeam2Percent() {
		return team2Percent;
	}

	public boolean isTeam1Won() {
		return team1Won;
	}

	public boolean isTeam2Won() {
		return team2Won;
	}

}