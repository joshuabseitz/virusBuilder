package builders;

/*
 * This is the abstract builder – it contains abstract builders.
 */

public abstract class VirusBuilder {

	protected Virus virus;
	
	public Virus getVirus() {
		System.out.println("\nResearcher has retrieved virus facts.");
		return virus;
	}
	
	public void createNewVirus() {
		virus = new Virus();
	}
	
	public abstract void buildYearDiscovered();
	public abstract void buildCountryCount();
	public abstract void buildCases();
	public abstract void buildFatalityRate();
	public abstract void buildOriginCountry();
}
