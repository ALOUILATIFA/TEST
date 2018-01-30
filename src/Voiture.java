
public class Voiture {

	private String marque;
	private String modele;
	private String numero;
	private double prix_initial, prix_reel;
	
	public Voiture (String m, String mo, String n, double p) {
		this.marque=m;
		this.modele=mo;
		this.numero=n;
		this.prix_initial=p;
		this.prix_reel=0;
	}
	 public void affiche() {
		System.out.println(marque+" "+modele+" "+numero+" "+prix_initial+" "+prix_reel); 
	 }
	public void calcul_prix_reel(double t) {
		prix_reel=prix_initial*(1-t);
	}
	system.out.println("Merci Latifa");
	
}
