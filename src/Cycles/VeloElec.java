package Cycles;
public class VeloElec extends Velo { 
	private double facteurPuissanceMoteur;
	private static double DefautFacteurPuissanceMoteur = 15.0; //lz methode static appartient a la clsse, c-à-d que on definit la methode une fis pour tt dans la classe velo 
	
	public VeloElec(double braquet, double diamRoue, double facteurPuissanceMoteur) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	public VeloElec(double diamRoue, double facteurPuissance) {
		super(diamRoue);
		this.facteurPuissanceMoteur = facteurPuissance;
	}
	public VeloElec() {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	public double getDefautFacteurPuissanceMoteur() {
		return DefautFacteurPuissanceMoteur ;
	}
	public void double setDefautFacteurPuissanceMoteur(double newDefaut) {
		DefautFacteurPuissanceMoteur = newDefaut;
	}
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	public void setFacteurPuissanceMoteur(double newfacteurPuissance) {
		this.facteurPuissanceMoteur = newfacteurPuissance ;
	}
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	public double getPuissance(double FrequenceCoupDePedale) {
		return super.getPuissance(FrequenceCoupDePedale);
	}
}