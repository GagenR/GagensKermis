package WeekopdrachtKermis;

//Alle methodes van deze Superclass Attractie bevinden zich ook in alle subclasses (de 6 verschillende attracties) ervan. 
//Er is dus sprake van overriding bij de methodes van de subclasses van Attractie.

class Attractie {
	String naam;
	int oppervlakte;
	double ritprijs;
	double omzet;
	int kaartverkoop;
	
	String getNaam() {  
		return naam;
	}
	
	double getRitprijs() {
		return ritprijs;
	}
	
	void setOmzet() {
	}
	
	double getOmzet() {
		return omzet;
	}
	
	void setKaartverkoop() {
	}
	
	int getKaartverkoop() {
		return kaartverkoop;
	}
	
	void draaien() {
	}
}