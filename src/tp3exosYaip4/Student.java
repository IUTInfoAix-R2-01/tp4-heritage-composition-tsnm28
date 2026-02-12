package tp3exosYaip4;
public class Student extends Person{
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		 super(name, address);
		 this.program = program;
		 this.year = year;
		 this.fee = fee;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String newProgram) {
		this.program = newProgram;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int newYear) {
		this.year = newYear;
	}
	public double getFee() {
		return fee;
	}
	public void setFree(double newFee) {
		this.fee = newFee;
	}
	public String toString() {
		return "Student [Person[name=" + supper(name) + ", address=" + this.address + "], program)=" + this.program + ", year=" + ", fee=" + this.fee + "]";
	}	
}