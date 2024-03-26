package personnages;

public class Musee {
	private Trophee[] trophees;
	private int nbTrophee;
	
	public Musee(int nbTrophee) {
		trophees = new Trophee[200];
		this.nbTrophee = 0;
	}
	
	public void donnerTrophee(Gaulois gaulois, Equipement equipement) {
		if (nbTrophee < trophees.length) {
			Trophee nouveauTrophee = new Trophee(gaulois, equipement);
			trophees[nbTrophee] = nouveauTrophee;
			nbTrophee++;
			System.out.println("Trophee ajouté au musée !");
		} else {
			System.out.println("Le musée est plein, le trophée ne peut pas être ajouté !");
		}
		
	}
}
