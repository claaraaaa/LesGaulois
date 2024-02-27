package personnages;

import java.util.Iterator;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, Chef chef, int nbVillageoisMax) {
		this.nom = nom;
		this.chef = chef;
		villageois = new Gaulois[nbVillageoisMax];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		if (villageois.length > nbVillageois) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
		}
	}
	
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", null, 30);
		
		//Gaulois gaulois = village.trouverHabitant(30);
		
		/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
					at personnages.Village.trouverHabitant(Village.java:31)
					at personnages.Village.main(Village.java:37)*/
		
		//Erreur car il y a juste 30 habitants et les tableaux commencent par l'indice 0, donc 30 > indice max.
		
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix);
		
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//null
		//null car un seul villageois dans le village, Astérix, qui se trouve dans l'indice 0 et non 1
		
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		
		village.afficherVillageois();

	}
}
