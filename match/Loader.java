package match;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

import data.StringPattern;
import match.Match.MatchFormat;
import match.Match.MatchStatus;

public class Loader {

	public List<Match> getMatches(String source) {

		List<Match> matchList = new ArrayList<>();

		String[] matches = source.split("<div class=\"matchmain\">");
		matches[0] = "";
		matches[matches.length - 1] = "";

		for (int i = 0; i < matches.length; i++) {
			try {

				if (i != 0 && i != matches.length - 1) {

					// Comment

					Matcher matcher = StringPattern.commentPattern.matcher(matches[i]);

					matcher.find();

					String comment = matcher.group(1).replaceAll("Â ", "");

					// Timeleft
					matcher = StringPattern.timePattern.matcher(matches[i]);

					matcher.find();

					String time = matcher.group(1);

					// Eventname
					matcher = StringPattern.eventNamePattern.matcher(matches[i]);

					matcher.find();

					String event = matcher.group(1);

					// Eventformat

					matcher = StringPattern.formatPattern.matcher(matches[i]);

					matcher.find();

					String formatString = matcher.group(1);

					MatchFormat format = null;

					if (formatString.contains("1"))
						format = MatchFormat.BO1;
					if (formatString.contains("2"))
						format = MatchFormat.BO2;
					if (formatString.contains("3"))
						format = MatchFormat.BO3;
					if (formatString.contains("5"))
						format = MatchFormat.BO5;

					// TEAM1
					matcher = StringPattern.teamNamePattern.matcher(matches[i]);

					matcher.find();

					String team1Name = matcher.group(1);

					matcher = StringPattern.teamPercentPattern.matcher(matches[i]);

					matcher.find();

					String team1Percent = matcher.group(1);
					
					// MATCH WON

					matcher = StringPattern.teamWonPattern.matcher(matches[i].split("teamtext")[0]);

					boolean team1Won = matcher.find();

					matcher = StringPattern.teamWonPattern.matcher(matches[i].split("teamtext")[1]);

					boolean team2Won = matcher.find();

					MatchStatus status = null;

					if (team1Won || team2Won && time.contains("ago"))
						status = MatchStatus.PLAYED;
					else if (!team1Won && !team2Won && time.contains("ago"))
						status = MatchStatus.LIVE;
					else
						status = MatchStatus.ONCOMING;

					// TEAM2

					String[] team2info = matches[i].split("teamtext");

					matcher = StringPattern.teamNamePattern.matcher(team2info[team2info.length - 1]);

					matcher.find();

					String team2Name = matcher.group(1);

					matchList.add(new Match(team1Name, team2Name, status, format, event, time, comment, team1Percent,
							String.valueOf(100 - Integer.parseInt(team1Percent.split("%")[0]) + "%"), team1Won, team2Won));
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		return matchList;

	}

	public String getStrFromUrl(String surl) {

		final String userAgent = "Mozilla/5.0 (Windows; U; Windows NT 5.1; de; rv:1.8.1.12) Gecko/20080201 Firefox/2.0.0.12";

		try {
			URL url = new URL(surl);
			URLConnection conn = url.openConnection();
			conn.addRequestProperty("User-Agent", userAgent);
			StringBuilder builder = new StringBuilder(1024);
			try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
				String str;

				while ((str = in.readLine()) != null) {
					builder.append(str);
					builder.append("\n");
				}
				in.close();
			}

			return builder.toString();

		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return "Error";
	}

}
