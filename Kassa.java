package WeekopdrachtKermis;

import java.text.DecimalFormat; //rond getallen af op 2 decimalen

class Kassa {
	double totaalOmzet;
	int totaleKaartverkoop;
	int aantalInspecties;
	double totaleBelasting;
	
	DecimalFormat df = new DecimalFormat("###.##");
	
	void kaartverkoopInformatie(Kermis kermis) {
		System.out.println("================================================ \nInformatie kaartverkoop attracties \n");
		System.out.println("Attractie" +" \t    " + "Aantal kaarten verkocht\n");
		for (int i = 0 ; i < kermis.attracties.size() ; i++)
		{
			System.out.print(kermis.attracties.get(i).getNaam());
			System.out.println(" \t\t " + kermis.attracties.get(i).getKaartverkoop());
		}
		
		System.out.print("\nTOTALE KAARTVERKOOP:   \t " + kermis.Kassa.totaleKaartverkoop);
		if (kermis.Kassa.totaleKaartverkoop == 1) { 
			System.out.println(" kaart");
		} else {
			System.out.println(" kaarten");
		}
		
		System.out.println("================================================");
	}	
	
	void kassaTellen(Attractie attractie) {	
		attractie.setKaartverkoop();		
		totaleKaartverkoop ++;
		attractie.setOmzet();			
		totaalOmzet += attractie.getRitprijs();
	}
	
	
	void omzetInformatie(Kermis kermis) {
		System.out.println("================================================\nOmzet per attractie: \n");
		System.out.println("Attractie" +"\t " + "Omzet\n");
		for (int i = 0 ; i < kermis.attracties.size() ; i++) {
			System.out.print(kermis.attracties.get(i).getNaam());			
			double omzet = kermis.attracties.get(i).getOmzet();		
			System.out.println(" \t €" + df.format(omzet));
			
		}
		
		System.out.print("\nTOTALE OMZET:\t €" + (kermis.Kassa.df.format(totaalOmzet)) + "\n");
		
		System.out.println("\n\nInformatie belasting \n");
		System.out.println("Aantal bezoeken belastinginspecteur: " + kermis.Kassa.aantalInspecties);
		System.out.println("Totale kansspelbelasting: €" + (kermis.Kassa.df.format(totaleBelasting)));
		System.out.println("================================================");
	}	
}