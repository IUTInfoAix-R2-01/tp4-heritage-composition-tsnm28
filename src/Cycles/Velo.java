package Cycles;
import java.util.Random ;
public class Velo{
	private double braquet;
	private static double DefautBraquet = 13.0;
	private double diamRoue;
	private Random  genAlea = new Random();
	
	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
		this.genAlea = genAlea;
	}
	public Velo(double braquet) {
		this.braquet = braquet;
		this.genAlea = genAlea;
	}
	public Velo() {
		this.braquet = DefautBraquet;
		this.genAlea = genAlea;
	}
	public static double getDefautBraquet() {
		return DefautBraquet;
	}
	public static void setDefautBraquet(double newDefautBraquet) {
		Velo.DefautBraquet = newDefautBraquet;
	}
	public Random getGenAlea() {
		return genAlea;
	}
	public void setGenAlea(Random newGenAlea) {
		genAlea = newGenAlea;
	}
	public double getBraquet() {
		return braquet ;
	}
	public void setBraquet(double newBraquet) {
		braquet = newBraquet ;
	}
	public double getDiamRoue() {
		return diamRoue ;
	}
	public void setDiamRoue(double newDiamRoue) {
		diamRoue = newDiamRoue ;
	}
	public String toString() {
		return "Velo [braquet=" + this.braquet + ", diamRoue=" + diamRoue +"]";
	}
	public double getPuissance(double FrequenceCoupDePedale) {
		return FrequenceCoupDePedale * this.braquet * this.diamRoue * this.genAlea.nextDouble();
	}
	
	public static void main(String[] args) {
		Velo v1 = new Velo();
		System.out.println(v1);
		v1.setDiamRoue(10);
		System.out.println(v1);
		v1.setBraquet(12.0);
		System.out.println(v1);
		Velo v2 = new Velo();
		System.out.println("the puisssance " + v1.getPuissance(14.0));
		
	}
	
}








