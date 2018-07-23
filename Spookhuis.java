package WeekopdrachtKermis;

class Spookhuis extends Attractie{
	
	Spookhuis(){
		naam = "The Darkness";
		ritprijs = 3.20;
		omzet = 0;
		kaartverkoop = 0;
		oppervlakte = 0;
	
	}
	
	void draaien() {
		System.out.println("================================================ "
				+ "\n     Are you afraid in the dark? Mowhaha!!"
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