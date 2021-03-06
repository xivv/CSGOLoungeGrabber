package data;

import java.util.regex.Pattern;

public class StringPattern {

	public static Pattern timePattern = Pattern.compile("<div class=\"col s4\">(.*?)</div>");
	public static Pattern formatPattern = Pattern.compile("\"format\">(.*?)</span");
	public static Pattern eventNamePattern = Pattern.compile("\"eventm\">(.*?)</div");
	public static Pattern teamNamePattern = Pattern.compile("<b>(.*?)</b>");
	public static Pattern teamWonPattern = Pattern.compile("csgolounge.com/img/won.png");
	public static Pattern commentPattern = Pattern.compile("#D12121\">(.*?)</span>");
	public static Pattern matchURLPattern = Pattern.compile("m=(.*?)\"");
	public static Pattern logoURLPattern = Pattern.compile("<img src=\"(.*?)\"");
	public static Pattern teamPercentPattern = Pattern.compile("<i class=\"percent-coins\">(.*?)</i>");
}
