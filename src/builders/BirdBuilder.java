package builders;

public class BirdBuilder extends VirusBuilder{
	
	public void buildYearDiscovered() {
		virus.setYearDiscovered(2013);
		System.out.println("\n Retrieving year discovered: " + virus.getYearDiscovered());
	}
	
	public void buildCountryCount() {
		virus.setCountryCount(3);
		System.out.println("\n Retreiving count of countries infected: " + virus.getCountryCount());
	}
	
	public void buildCases() {
		virus.setCases(1568);
		System.out.println("\n Retrieving number of cases: " + virus.getCases());
	}
	
	public void buildFatalityRate(){
		virus.setFatalityRate(39.30);
		System.out.println("\n Retrieving fatality rate: " + virus.getFatalityRate() + "%");
	}
	
	public void buildOriginCountry() {
		virus.setOriginCountry("People's Republic of China");
		System.out.println("\n Retrieving origin country: " + virus.getOriginCountry());
	}

}
