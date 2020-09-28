
public class Character {
	private String name;
	private int money = 1000;
	private int currentIncome = 0;
	
	public Character() {
		
	}
	
	public Character(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	public int getCurrentIncome() {
		return currentIncome;
	}

	public void setCurrentIncome(int currentIncome) {
		this.currentIncome = currentIncome;
	}
	
	
	
}
