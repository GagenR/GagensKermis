package WeekopdrachtKermis;

class Ladderklimmen extends Attractie implements GokAttractie {
	
	Ladderklimmen(){
		naam = "Draailadder";
		ritprijs = 5;
		omzet = 0;
		kaartverkoop = 0;
		oppervlakte = 0;
	
	}
	
	void draaien() {
		System.out.println("================================================ "
				+ "\n     Grijpt u de €50 boven aan de ladder?"
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
	
	public double kansSpelBelastingBetalen() {  //deze methode wordt aangeroepen bij class BelastingInspecteur
		double belasting = 0.3 * omzet;
		omzet -= belasting;
		return belasting;
	}
	
}
