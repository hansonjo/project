
public class Animal {
	protected String name;
	protected int income;
	protected String species;
	protected int price;
	
	public Animal(String name, int income, String species,int price) {
		this.name = name;
		this.income = income;
		this.species = species;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
