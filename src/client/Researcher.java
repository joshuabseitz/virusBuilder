package client;

import builders.*;

public class Researcher {
	
	private VirusBuilder virusBuilder;
	
	public void setVirusBuilder(VirusBuilder researcher) {
		virusBuilder = researcher;
	}
	
	public void constructVirus() {
		System.out.println("The virus is being researched...");
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