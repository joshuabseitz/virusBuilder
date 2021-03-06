package director;

import builders.*;

/*
 * The researcher is the director class which can select the concrete builder needed, have a virus researched, and print virus facts.
 */

public class Researcher {
	
	private VirusBuilder virusBuilder;
	
	public void setVirusBuilder(VirusBuilder researcher) {
		virusBuilder = researcher;
	}
	
	public void constructVirus() {
		System.out.println("\n The information is being researched...");
		virusBuilder.createNewVirus();
		virusBuilder.buildCases();
		virusBuilder.buildCountryCount();
		virusBuilder.buildFatalityRate();
		virusBuilder.buildOriginCountry();
		virusBuilder.buildYearDiscovered();
	}
	
	public Virus getVirus() {
		return virusBuilder.getVirus();
	}
	
}
