package builders;

public class CovidBuilder extends VirusBuilder{
	
	public void buildYearDiscovered() {
		virus.setYearDiscovered(2020);
		System.out.println("\n Retrieving year discovered: " + virus.getYearDiscovered());
	}
	
	public void buildCountryCount() {
		virus.setCountryCount(24);
		System.out.println("\n Retreiving count of countries infected: " + virus.getCountryCount());
	}
	
	public void buildCases() {
		virus.setCases(11871);
		System.out.println("\n Retrieving number of cases: " + virus.getCases());
	}
	
	public void buildFatalityRate(){
		virus.setFatalityRate(2.2);
		System.out.println("\n Retrieving fatality rate: " + virus.getFatalityRate() + "%");
	}
	
	public void buildOriginCountry() {
		virus.setOriginCountry("People's Republic of China");
		System.out.println("\n Retrieving origin country: " + virus.getOriginCountry());
	}

}
