package WeekopdrachtKermis;

import java.util.Scanner;
import java.util.ArrayList;

public class Kermis {
	public static void main(String[] args) {
		Kermis kermis = new Kermis();
		kermis.kermisBezoeken(kermis);
		
	}
		Scanner scanner = new Scanner(System.in); 
		Kassa Kassa;	
		BelastingInspecteur BelastingInspecteur;
		ArrayList <Attractie> attracties = new ArrayList<Attractie>();
		
		
		Kermis(){
			attracties.add(new Botsautos());
			attracties.add(new Spin());
			attracties.add(new Spiegelpaleis());
			attracties.add(new Spookhuis());
			attracties.add(new Hawaii());
			attracties.add(new Ladderklimmen());
			BelastingInspecteur = new BelastingInspecteur();
			Kassa = new Kassa();
			System.out.print("Welkom op kermis Park Hilaria, de gezelligste kermis van Nederland! \n");
		}

		void kermisBezoeken(Kermis kermis) { //deze methode wordt direct aangeroepen bij het runnen van dit programma
			System.out.println("\nMaak een keuze!");
			System.out.println("Wilt u in een attractie gaan? \t\tToets 1 \nWilt u informatie over verkoop/omzet? \tToets "
					+ "2\n================================================");
			int userInput = kermis.toetsen();
			while (userInput !=1 && userInput != 2) {
				System.out.println("U kunt alleen cijfer 1 en 2 intoetsen, maak aub opnieuw uw keuze. ");
				userInput = kermis.toetsen();
			} if (userInput == 1) {
				kermis.attractieBetreden(kermis);
			} else if (userInput == 2) {
				kermis.informatieVerschaffen(kermis);
			}		
		}
		
		int toetsen() {
			return scanner.nextInt();
		}
			
		
	Attractie attractieKiezen(Kermis kermis) {
		System.out.println("==========================================================");
		System.out.println("Park Hilaria heeft de volgende zes gave attracties: \n");	
		System.out.println("Attractie" +" \t        " + "Ritprijs\n");
		for(int i = 0 ; i < attracties.size() ; i++) {	
			System.out.println(i+1 + " " + attracties.get(i).getNaam() + 
				"\t\t€"+attracties.get(i).getRitprijs());				
		}		 
		int userInput;		
		do {
			System.out.println("\nToets het nummer in van de attractie waar u in wilt gaan:"
					+ "\n==========================================================");
			userInput = kermis.toetsen();
		if (userInput < 1 | userInput >= 7 )
			System.out.println("U kunt alleen getal 1 t/m 6 intoetsen, maak aub opnieuw uw keuze. ");
		}
		while (userInput != 1 && userInput != 2 && userInput != 3 && userInput != 4 && userInput != 5 && userInput != 6); 
		return attracties.get(userInput - 1);
		
	}
	
	void attractieBetreden(Kermis kermis) {	
		Attractie attractie = attractieKiezen(kermis);	
		if (attractie instanceof RisicoRijkAttractie) {					
			RisicoRijkAttractieBetreden(attractie);		
		}else attractie.draaien();
		Kassa.kassaTellen(attractie);	
		if (Kassa.totaleKaartverkoop == 15) { 
			BelastingInspecteur.inspecteren(kermis);
			Kassa.totaleKaartverkoop = 0;
		}				
		kermis.kermisBezoeken(kermis);		
		}
	
	
	void informatieVerschaffen(Kermis kermis) {
		String userInput;
		do {
			System.out.println("\nWilt u weten hoeveel kaarten (per attractie) zijn verkocht?\tToets 'k'");
			System.out.println("Wilt u weten hoeveel omzet elke attractie heeft gemaakt?\tToets 'o'"
					+ "\n=========================================================================");
			userInput = kermis.letterToetsen();
		}
		while (!(userInput.equals("k")) && !(userInput.equals("o")));   
		if (userInput.equals("k")){
			kermis.Kassa.kaartverkoopInformatie(kermis);
		}
		else if (userInput.equals("o")){
			kermis.Kassa.omzetInformatie(kermis);
		}
		kermis.kermisBezoeken(kermis);
		
	}
	
		String letterToetsen() {
			return scanner.next();
		}
	
	void RisicoRijkAttractieBetreden(Attractie attractie) {
		try {			
			draailimietControleren(attractie);
		} catch (DraailimietBereiktException a) {
			String m;
			do {
				System.out.println("===================================================================================");
				System.out.println("\t\t\tUNDER CONSTRUCTION"
						+ "\nHelaas, is deze attractie gesloten wegens een kapot onderdeel. "
						+ "\nToets 'm' om een monteur in te schakelen die de attractie weer kan laten draaien.");
				System.out.println("===================================================================================");
				m = letterToetsen();
			} while(!m.equals("m"));
			System.out.println("Hawaii Trip is weer klaar voor gebruik. Veel plezier!\n"
					+"======================================================" );
		}
	}
	void draailimietControleren(Attractie attractie) throws DraailimietBereiktException {
		attractie.getKaartverkoop();
		if (attractie.kaartverkoop == 6) {
			attractie.kaartverkoop = 0;
			throw new DraailimietBereiktException();
		} else attractie.draaien();
	}
		
}
	