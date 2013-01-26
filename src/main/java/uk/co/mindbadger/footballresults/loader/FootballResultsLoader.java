package uk.co.mindbadger.footballresults.loader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uk.co.mindbadger.footballresults.reader.FootballResultsReader;
import uk.co.mindbadger.footballresults.reader.ParsedFixture;
import uk.co.mindbadger.footballresultsanalyser.dao.FootballResultsAnalyserDAO;
import uk.co.mindbadger.footballresultsanalyser.domain.Division;
import uk.co.mindbadger.footballresultsanalyser.domain.DomainObjectFactory;
import uk.co.mindbadger.footballresultsanalyser.domain.Team;

public class FootballResultsLoader {
	private String dialect;
	private DomainObjectFactory domainObjectFactory;
	private FootballResultsAnalyserDAO dao;
	private FootballResultsReader reader;

	private Map<Integer, Division> divisions = new HashMap<Integer, Division>();
	private Map<Integer, Team> teams = new HashMap<Integer, Team>();

	
	public void loadResultsForSeason(int season) {
		List<Division> divisionsInDatabase = dao.getAllDivisions();
		List<Team> teamsInDatabase = dao.getAllTeams();
		
		List<ParsedFixture> fixturesRead = reader.readFixturesForSeason(season);
	}
	
	
	public DomainObjectFactory getDomainObjectFactory() {
		return domainObjectFactory;
	}
	public void setDomainObjectFactory(DomainObjectFactory domainObjectFactory) {
		this.domainObjectFactory = domainObjectFactory;
	}
	public String getDialect() {
		return dialect;
	}
	public void setDialect(String dialect) {
		this.dialect = dialect;
	}
	public FootballResultsAnalyserDAO getDao() {
		return dao;
	}
	public void setDao(FootballResultsAnalyserDAO dao) {
		this.dao = dao;
	}
	public FootballResultsReader getReader() {
		return reader;
	}
	public void setReader(FootballResultsReader reader) {
		this.reader = reader;
	}
}
