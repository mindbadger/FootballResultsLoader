package mindbadger.footballresults.loader.apps;

import mindbadger.footballresults.loader.FootballResultsLoader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class LoadAllSeasonFromXMLApplication {

//	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-xml-reader.xml");
//
//		
//		FootballResultsLoader loader = (FootballResultsLoader) context.getBean("loader");
//		
//		Integer season = 1949;
//		while (season > 1943) {
//			System.out.println("+++++++++++++++++++++LOADING SEASON: " + season);
//			loader.loadResultsForSeason(season);
//			season--;
//		}
//		
//		((ConfigurableApplicationContext)context).close();
//	}
}
