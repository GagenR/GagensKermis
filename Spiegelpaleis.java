package WeekopdrachtKermis;

class Spiegelpaleis extends Attractie{

	Spiegelpaleis(){
		naam = "Rue de Paris";
		ritprijs = 2.75;
		omzet = 0;
		kaartverkoop = 0;
		oppervlakte = 0;
	
	}
	
	void draaien() {
		System.out.println("================================================ "
				+ "\n    We gaan verdwalen in de "+ naam + "!"
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