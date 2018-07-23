package WeekopdrachtKermis;

class Botsautos extends Attractie {
	
	Botsautos(){
		naam = "Fast&Furious";
		ritprijs = 2.50;
		omzet = 0;
		kaartverkoop = 0;
		oppervlakte = 0;
	
	}
	
	void draaien() {
		System.out.println("================================================ "
				+ "\n Gezellig tegen elkaar botsen in "+ naam + "!"
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
