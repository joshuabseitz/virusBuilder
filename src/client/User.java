package client;
import director.Researcher;
import builders.*;

public class User {
	
	public static void main(String[] args) {
		
		//INIT WAITERS AND CONCRETE BUILDERS
		Researcher researcher = new Researcher();
		VirusBuilder birdFlu = new BirdBuilder();
		VirusBuilder coronavirus = new CovidBuilder();
		VirusBuilder swineFlu = new SwineBuilder();
		VirusBuilder ebola = new EbolaBuilder();
		
		// PROMPT
		System.out.println("Welcome to this virus research center.");
		System.out.println("\n Here's a list viruses we have information on:" +
							"\n Coronavirus \n Bird Flu \n Swine Flu \n Ebola");
		
		//BIRDFLU SEARCH
		System.out.println("> Okay, you'd like some information on the: BIRDFLU");
		researcher.setVirusBuilder(birdFlu);
		researcher.constructVirus();
		Virus virusSearch1 = researcher.getVirus();
		
		//CORONAVIRUS SEARCH
		System.out.println("> Okay, you'd like some information on the: CORONAVIRUS");
		researcher.setVirusBuilder(coronavirus);
		researcher.constructVirus();
		Virus virusSearch2 = researcher.getVirus();
		
		//SWINEFLU SEARCH
		System.out.println("> Okay, you'd like some information on the: SWINEFLU");
		researcher.setVirusBuilder(swineFlu);
		researcher.constructVirus();
		Virus virusSearch3 = researcher.getVirus();
		
		//EBOLA SEARCH
		System.out.println("> Okay, you'd like some information on the: EBOLA");
		researcher.setVirusBuilder(ebola);
		researcher.constructVirus();
		Virus virusSearch4 = researcher.getVirus();
}
}
