package builders;

public class EbolaBuilder extends VirusBuilder{
	
	public void buildYearDiscovered() {
		virus.setYearDiscovered(1976);
		System.out.println("\n Retrieving year discovered: " + virus.getYearDiscovered());
	}
	
	public void buildCountryCount() {
		virus.setCountryCount(9);
		System.out.println("\n Retreiving count of countries infected: " + virus.getCountryCount());
	}
	
	public void buildCases() {
		virus.setCases(33577);
		System.out.println("\n Retrieving number of cases: " + virus.getCases());
	}
	
	public void buildFatalityRate(){
		virus.setFatalityRate(13562);
		System.out.println("\n Retrieving fatality rate: " + virus.getFatalityRate() + "%");
	}
	
	public void buildOriginCountry() {
		virus.setOriginCountry("Democratic Republic of Congo");
		System.out.println("\n Retrieving origin country: " + virus.getOriginCountry());
	}

}
