package builders;

/*
Virus is the product class – it contains variables, setter, and getter methods for virus facts.
 */

public class Virus {
	
	private int yearDiscovered = 0;
	private int countryCount = 0;
	private int cases = 0;
	private double fatalityRate = 0.0;
	private String originCountry = "";
	
	public void setYearDiscovered(int yearDiscovered) {
		this.yearDiscovered = yearDiscovered;
	}
	
	public void setCountryCount(int countryCount) {
		this.countryCount = countryCount;
	}
	
	public void setCases(int cases) {
		this.cases = cases;
	}
	
	public void setFatalityRate(double fatalityRate) {
		this.fatalityRate = fatalityRate;
	}
	
	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}
	
	public int getYearDiscovered() {
		return yearDiscovered;
	}
	
	public int getCountryCount() {
		return countryCount;
	}
	
	public int getCases() {
		return cases;
	}
	
	public double getFatalityRate() {
		return fatalityRate;
	}
	
	public String getOriginCountry() {
		return originCountry;
	}
	

}
