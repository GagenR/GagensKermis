package WeekopdrachtKermis;

class Spin extends Attractie {
	
	Spin(){
		naam = "Octupus";
		ritprijs = 2.25;
		omzet = 0;
		kaartverkoop = 0;
		oppervlakte = 0;
	
	}
	
	
	void draaien() {
		System.out.println("================================================ "
				+ "\n     We gaan lekker draaien in de "+ naam + "!"
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
	
	public double kansSpelBelastingBetalen() {
		double belasting = 0.3 * omzet;
		omzet -= belasting;
		return belasting;
	}
	
	void setKaartverkoop() {
		kaartverkoop++;
	}
	
	int getKaartverkoop() {
		return kaartverkoop;
	}
	

}