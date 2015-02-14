package uk.co.mindbadger.footballresults.reader;

import java.util.Calendar;

public class ParsedFixture<K> {
	private K fixtureId;
	private Integer seasonId;
	private Calendar fixtureDate;
	private K divisionId;
	private String divisionName;
	private K homeTeamId;
	private String homeTeamName;
	private K awayTeamId;
	private String awayTeamName;
	private Integer homeGoals;
	private Integer awayGoals;
	public K getFixtureId() {
		return fixtureId;
	}
	public void setFixtureId(K fixtureId) {
		this.fixtureId = fixtureId;
	}
	public Integer getSeasonId() {
		return seasonId;
	}
	public void setSeasonId(Integer seasonId) {
		this.seasonId = seasonId;
	}
	public Calendar getFixtureDate() {
		return fixtureDate;
	}
	public void setFixtureDate(Calendar fixtureDate) {
		this.fixtureDate = fixtureDate;
	}
	public K getDivisionId() {
		return divisionId;
	}
	public void setDivisionId(K divisionId) {
		this.divisionId = divisionId;
	}
	public String getDivisionName() {
		return divisionName;
	}
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	public K getHomeTeamId() {
		return homeTeamId;
	}
	public void setHomeTeamId(K homeTeamId) {
		this.homeTeamId = homeTeamId;
	}
	public String getHomeTeamName() {
		return homeTeamName;
	}
	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}
	public K getAwayTeamId() {
		return awayTeamId;
	}
	public void setAwayTeamId(K awayTeamId) {
		this.awayTeamId = awayTeamId;
	}
	public String getAwayTeamName() {
		return awayTeamName;
	}
	public void setAwayTeamName(String awayTeamName) {
		this.awayTeamName = awayTeamName;
	}
	public Integer getHomeGoals() {
		return homeGoals;
	}
	public void setHomeGoals(Integer homeGoals) {
		this.homeGoals = homeGoals;
	}
	public Integer getAwayGoals() {
		return awayGoals;
	}
	public void setAwayGoals(Integer awayGoals) {
		this.awayGoals = awayGoals;
	}
	
	@Override
	public String toString () {
		StringBuffer buf = new StringBuffer();
		buf.append("[");
		buf.append(String.format("%1$te-%1$tm-%1$tY", fixtureDate));
		buf.append(" (");
		buf.append(seasonId);
		buf.append(")][Div=");
		buf.append(divisionName);
		buf.append("(");
		buf.append(divisionId);
		buf.append(")][");
		buf.append(homeTeamName);
		buf.append("(");
		buf.append(homeTeamId);
		buf.append(") ");
		buf.append(homeGoals);
		buf.append("-");
		buf.append(awayGoals);
		buf.append(" ");
		buf.append(awayTeamName);
		buf.append("(");
		buf.append(awayTeamId);
		buf.append(")]");
		return buf.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ParsedFixture) {
			ParsedFixture parsedFixture = (ParsedFixture) obj;
			
			boolean equals = parsedFixture.getSeasonId().equals(this.seasonId);
			equals = equals && ((parsedFixture.getFixtureDate() == null && this.fixtureDate == null) || (parsedFixture.getFixtureDate().equals(this.fixtureDate)));
			equals = equals && parsedFixture.getHomeTeamId().equals(this.homeTeamId);
			equals = equals && parsedFixture.getAwayTeamId().equals(this.awayTeamId);
			equals = equals && parsedFixture.getDivisionId().equals(this.divisionId);
			
			return equals;
		} else {
			return false;
		}
	}
}
