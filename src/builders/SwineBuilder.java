package builders;

public class SwineBuilder extends VirusBuilder{
	
	public void buildYearDiscovered() {
		virus.setYearDiscovered(2009);
		System.out.println("\n Retrieving year discovered: " + virus.getYearDiscovered());
	}
	
	public void buildCountryCount() {
		virus.setCountryCount(214);
		System.out.println("\n Retreiving count of countries infected: " + virus.getCountryCount());
	}
	
	public void buildCases() {
		virus.setCases(762630000);
		System.out.println("\n Retrieving number of cases: " + virus.getCases());
	}
	
	public void buildFatalityRate(){
		virus.setFatalityRate(0.02);
		System.out.println("\n Retrieving fatality rate: " + virus.getFatalityRate() + "%");
	}
	
	public void buildOriginCountry() {
		virus.setOriginCountry("United States of America");
		System.out.println("\n Retrieving origin country: " + virus.getOriginCountry());
	}

}
