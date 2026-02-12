package tp3exosYaip4;
public class Person{
	private String name ;
	private String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String newAddress) {
		this.address = newAddress;
	}
	public String toString() {
		return "Person [name=" + this.name + ", address=" + this.address + "]"; 
	}
}