package WeekopdrachtKermis;

class Hawaii extends RisicoRijkAttractie{
	
	Hawaii(){
		naam = "Hawaii Trip";
		ritprijs = 3.90;
		omzet = 0;
		kaartverkoop = 0;
		oppervlakte = 0;
	
	}
	
	void draaien() {
		System.out.println("================================================ "
				+ "\n      Lekker wiebelen in de "+ naam + "!"
						+ "\n================================================");
	}
	
	String getNaam() {
		return naam;
	}
	
	double getRitprijs() {
		return ritprijs;
	}
	
	void setOmzet() {
		omzet += ritprijs;
	}
	
	double getOmzet() {
		return omzet;
	}
	
	void setKaartverkoop() {
		kaartverkoop++;
	}
	
	int getKaartverkoop() {
		return kaartverkoop;
	}
	
}


