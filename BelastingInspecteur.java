package WeekopdrachtKermis;

class BelastingInspecteur {
	
	void inspecteren(Kermis kermis) {
		for (Attractie attractie : kermis.attracties) {
			if (attractie instanceof GokAttractie) {				
				double belasting = ((GokAttractie) attractie).kansSpelBelastingBetalen();
				kermis.Kassa.totaalOmzet -= belasting;
				kermis.Kassa.totaleBelasting += belasting;								
				}
			}
				kermis.Kassa.aantalInspecties++;
	}

}
