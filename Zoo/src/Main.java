import java.util.*;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	String[] map = new String [20];
	Character myChar = new Character();
	Vector<Reptil> myReptil = new Vector<>();
	Vector<Mammal> myMammal = new Vector<>();
	Vector<Fish> myFish = new Vector<>();
	Vector<Amphibi> myAmphibi = new Vector<>();
	Vector<Bird> myBird = new Vector<>();
	
	int birdIncome=0;
	int mammalIncome=0;
	int reptilIncome=0;
	int amphibiIncome=0;
	int fishIncome=0;
	int totalIncome=0;
	
	public void cls() {
		for(int i=0;i<30;i++) {
			System.out.println("");
		}
	}
	
	public void SlowType(String word,int speed){
		for(int j = 0 ; j < word.length(); j++){
			try{
				System.out.print(word.charAt(j));
				Thread.sleep(speed);
			}catch (Exception e){
			
			}
		}
	}
	
	public void printMap(int x,int y) {
		for(int i=0;i<20;i++) {
			for(int j=0;j<25;j++) {
				if(i == y && j == x) {
					System.out.print("@");
				}else {
					System.out.printf("%c",map[i].charAt(j));
				}
			}
			if(i == 0) {
				System.out.println("	Legends : ");
			}else if(i == 1) {
				System.out.println("	1 = Bird Section");
			}else if(i == 2) {
				System.out.println("	2 = Mammal Section");
			}else if(i == 3) {
				System.out.println("	3 = Fish Section");
			}else if(i == 4) {
				System.out.println("	4 = Reptil Section");
			}else if(i == 5) {
				System.out.println("	5 = Amphibi Section");
			}else if(i == 6){
				System.out.println("	E = Exit");
			}else {
				System.out.println("");
			}
		}
	}
	
	public void nextDay() {
		
	}
	
	public int menu(int noKandang) {
		int choose;
		int pilih;
		String species;
		String name;
		int income;
		int price;
		String kasiNama;
		int idxRemove;
		String sellWish;
		
		System.out.println("1. Buy");
		System.out.println("2. Sell");
		System.out.println("3. Check Total Income");
		System.out.println("4. Exit");
		System.out.print("Choose : ");
		try {
			choose = scan.nextInt();
		}catch(Exception e) {
			choose = 0;
		}
		scan.nextLine();
		switch(choose) {
			case 1:
				cls();
				if(noKandang == 1) {
					do {
						System.out.println("=================================");
						System.out.println("| No | Species | Price | Income |");
						System.out.println("=================================");
						System.out.println("| 1  | Penguin | 500   | 100    |");
						System.out.println("| 2  | Pelican | 750   | 150    |");
						System.out.println("| 3  | Peacock | 1000  | 250    |");
						System.out.println("| 4  | Ostrich | 2000  | 600    |");
						System.out.println("=================================");
						System.out.print("Choose Bird You Want to Buy [1-4]: ");
						try {
							pilih = scan.nextInt();
						}catch(Exception e) {
							pilih = 0;
						}
						scan.nextLine();
					}while(pilih < 1 || pilih > 4);
					
					if(pilih == 1) {
						species = "Penguin";
						price = 500;
						income = 100;
					}else if(pilih == 2) {
						species = "Pelican";
						price = 750;
						income = 150;
					}else if(pilih == 3) {
						species = "Peacock";
						price = 1000;
						income = 250;
					}else {
						species = "Ostrich";
						price = 2000;
						income = 600;
					}
					
					if(price > myChar.getMoney()) {
						System.out.println("You don't Have Enough Money!");
						System.out.print("Press ENTER to Continue...");scan.nextLine();
					}else {
						do {
							System.out.print("Do you wish to give your new animal a name [Y/N]: ");
							kasiNama = scan.nextLine();
						}while(!kasiNama.equals("Y") && !kasiNama.equals("N"));
						
						if(kasiNama.equals("Y")) {
							do {
								System.out.print("Please input your animal name [5-15 Characters]: ");
								name = scan.nextLine();
							}while(name.length()<5 || name.length() > 15);
						}else {
							name = species;
						}
						birdIncome += income;
						totalIncome += income;
						int money = myChar.getMoney() - price;
						myChar.setMoney(money);
						myChar.setCurrentIncome(totalIncome);
						System.out.println("You have bought " + name + "(" + species + ") successfully!" );
						System.out.print("Press ENTER to Continue...");scan.nextLine();
						Bird brd = new Bird(name,income,species,price);
						myBird.add(brd);
					}
				}else if(noKandang == 2) {
					do {
						System.out.println("==================================");
						System.out.println("| No | Species  | Price | Income |");
						System.out.println("==================================");
						System.out.println("| 1  | Donkey   | 500   | 100    |");
						System.out.println("| 2  | Horse    | 750   | 150    |");
						System.out.println("| 3  | Lion     | 1000  | 250    |");
						System.out.println("| 4  | Elephant | 2000  | 600    |");
						System.out.println("==================================");
						System.out.print("Choose Mammal You Want to Buy [1-4]: ");
						try {
							pilih = scan.nextInt();
						}catch(Exception e) {
							pilih = 0;
						}
						scan.nextLine();
					}while(pilih < 1 || pilih > 4);
					
					if(pilih == 1) {
						species = "Donkey";
						price = 500;
						income = 100;
					}else if(pilih == 2) {
						species = "Horse";
						price = 750;
						income = 150;
					}else if(pilih == 3) {
						species = "Lion";
						price = 1000;
						income = 250;
					}else {
						species = "Elephant";
						price = 2000;
						income = 600;
					}
					
					if(price > myChar.getMoney()) {
						System.out.println("You don't Have Enough Money!");
						System.out.print("Press ENTER to Continue...");scan.nextLine();
					}else {
						do {
							System.out.print("Do you wish to give your new animal a name [Y/N]: ");
							kasiNama = scan.nextLine();
						}while(!kasiNama.equals("Y") && !kasiNama.equals("N"));
						
						if(kasiNama.equals("Y")) {
							do {
								System.out.print("Please input your animal name [5-15 Characters]: ");
								name = scan.nextLine();
							}while(name.length()<5 || name.length() > 15);
						}else {
							name = species;
						}
						mammalIncome += income;
						totalIncome += income;
						int money = myChar.getMoney() - price;
						myChar.setMoney(money);
						myChar.setCurrentIncome(totalIncome);
						System.out.println("You have bought " + name + "(" + species + ") successfully!" );
						System.out.print("Press ENTER to Continue...");scan.nextLine();
						Mammal mam = new Mammal(name,income,species,price);
						myMammal.add(mam);
					}
				}else if(noKandang == 3) {
					do {
						System.out.println("==================================");
						System.out.println("| No | Species  | Price | Income |");
						System.out.println("==================================");
						System.out.println("| 1  | Seabass  | 100   | 20     |");
						System.out.println("| 2  | Lionfish | 150   | 35     |");
						System.out.println("| 3  | Seastar  | 175   | 40     |");
						System.out.println("| 4  | Piranha  | 500   | 100    |");
						System.out.println("| 5  | Stingray | 800   | 175    |");
						System.out.println("| 6  | Shark    | 1000  | 250    |");
						System.out.println("==================================");
						System.out.print("Choose Fish You Want to Buy [1-6]: ");
						try {
							pilih = scan.nextInt();
						}catch(Exception e) {
							pilih = 0;
						}
						scan.nextLine();
					}while(pilih < 1 || pilih > 6);
					
					if(pilih == 1) {
						species = "Seabass";
						price = 100;
						income = 20;
					}else if(pilih == 2) {
						species = "Lionfish";
						price = 150;
						income = 35;
					}else if(pilih == 3) {
						species = "Seastar";
						price = 175;
						income = 40;
					}else if(pilih == 4){
						species = "Piranha";
						price = 500;
						income = 100;
					}else if(pilih == 5) {
						species = "Stingray";
						price = 800;
						income = 175;
					}else {
						species = "Shark";
						price = 1000;
						income = 250;
					}
					
					if(price > myChar.getMoney()) {
						System.out.println("You don't Have Enough Money!");
						System.out.print("Press ENTER to Continue...");scan.nextLine();
					}else {
						do {
							System.out.print("Do you wish to give your new animal a name [Y/N]: ");
							kasiNama = scan.nextLine();
						}while(!kasiNama.equals("Y") && !kasiNama.equals("N"));
						
						if(kasiNama.equals("Y")) {
							do {
								System.out.print("Please input your animal name [5-15 Characters]: ");
								name = scan.nextLine();
							}while(name.length()<5 || name.length() > 15);
						}else {
							name = species;
						}
						fishIncome += income;
						totalIncome += income;
						int money = myChar.getMoney() - price;
						myChar.setMoney(money);
						myChar.setCurrentIncome(totalIncome);
						System.out.println("You have bought " + name + "(" + species + ") successfully!" );
						System.out.print("Press ENTER to Continue...");scan.nextLine();
						Fish fsh = new Fish(name,income,species,price);
						myFish.add(fsh);
					}
				}else if(noKandang == 4) {
					do {
						System.out.println("==================================");
						System.out.println("| No | Species  | Price | Income |");
						System.out.println("==================================");
						System.out.println("| 1  | Snake    | 250   | 50     |");
						System.out.println("| 2  | Turtle   | 400   | 80     |");
						System.out.println("| 3  | Iguana   | 700   | 160    |");
						System.out.println("| 4  | Komodo   | 1500  | 350    |");
						System.out.println("==================================");
						System.out.print("Choose Reptil You Want to Buy [1-4]: ");
						try {
							pilih = scan.nextInt();
						}catch(Exception e) {
							pilih = 0;
						}
						scan.nextLine();
					}while(pilih < 1 || pilih > 4);
					
					if(pilih == 1) {
						species = "Snake";
						price = 250;
						income = 50;
					}else if(pilih == 2) {
						species = "Turtle";
						price = 400;
						income = 80;
					}else if(pilih == 3) {
						species = "Iguana";
						price = 700;
						income = 160;
					}else {
						species = "Komodo";
						price = 1500;
						income = 350;
					}
					
					if(price > myChar.getMoney()) {
						System.out.println("You don't Have Enough Money!");
						System.out.print("Press ENTER to Continue...");scan.nextLine();
					}else {
						do {
							System.out.print("Do you wish to give your new animal a name [Y/N]: ");
							kasiNama = scan.nextLine();
						}while(!kasiNama.equals("Y") && !kasiNama.equals("N"));
						
						if(kasiNama.equals("Y")) {
							do {
								System.out.print("Please input your animal name [5-15 Characters]: ");
								name = scan.nextLine();
							}while(name.length()<5 || name.length() > 15);
						}else {
							name = species;
						}
						reptilIncome += income;
						totalIncome += income;
						int money = myChar.getMoney() - price;
						myChar.setMoney(money);
						myChar.setCurrentIncome(totalIncome);
						System.out.println("You have bought " + name + "(" + species + ") successfully!" );
						System.out.print("Press ENTER to Continue...");scan.nextLine();
						Reptil rep = new Reptil(name,income,species,price);
						myReptil.add(rep);
					}
				}else {
					do {
						System.out.println("====================================");
						System.out.println("| No | Species    | Price | Income |");
						System.out.println("====================================");
						System.out.println("| 1  | Toad       | 250   | 50     |");
						System.out.println("| 2  | Axolotl    | 400   | 80     |");
						System.out.println("| 3  | Salamander | 700   | 160    |");
						System.out.println("====================================");
						System.out.print("Choose Reptil You Want to Buy [1-3]: ");
						try {
							pilih = scan.nextInt();
						}catch(Exception e) {
							pilih = 0;
						}
						scan.nextLine();
					}while(pilih < 1 || pilih > 3);
					
					if(pilih == 1) {
						species = "Toad";
						price = 250;
						income = 50;
					}else if(pilih == 2) {
						species = "Axolotl";
						price = 400;
						income = 80;
					}else {
						species = "Salamander";
						price = 700;
						income = 160;
					}
					
					if(price > myChar.getMoney()) {
						System.out.println("You don't Have Enough Money!");
						System.out.print("Press ENTER to Continue...");scan.nextLine();
					}else {
						do {
							System.out.print("Do you wish to give your new animal a name [Y/N]: ");
							kasiNama = scan.nextLine();
						}while(!kasiNama.equals("Y") && !kasiNama.equals("N"));
						
						if(kasiNama.equals("Y")) {
							do {
								System.out.print("Please input your animal name [5-15 Characters]: ");
								name = scan.nextLine();
							}while(name.length()<5 || name.length() > 15);
						}else {
							name = species;
						}
						amphibiIncome += income;
						totalIncome += income;
						int money = myChar.getMoney() - price;
						myChar.setMoney(money);
						myChar.setCurrentIncome(totalIncome);
						System.out.println("You have bought " + name + "(" + species + ") successfully!" );
						System.out.print("Press ENTER to Continue...");scan.nextLine();
						Amphibi amp = new Amphibi(name,income,species,price);
						myAmphibi.add(amp);
					}
				}
				break;
			case 2:
				cls();
				if(noKandang == 1) {
					if(myBird.size() == 0) {
						System.out.println("You don't Have any bird yet!");
						System.out.print("Press Enter to Continue..."); scan.nextLine();
					}else {
						do {
							System.out.print("Choose Which One You Wish to Sell [1-" + myBird.size() + "]: ");
							try {
								idxRemove = scan.nextInt();
							} catch (Exception e) {
								// TODO: handle exception
								idxRemove = 0;
							}
							scan.nextLine();
						}while(idxRemove < 1 || idxRemove > myBird.size());
						idxRemove -= 1;
						do {
							System.out.print("Are You Sure you Want to Sell " + myBird.get(idxRemove).getName() + "[Y/N]: ");
							sellWish = scan.nextLine();
						}while(!sellWish.equals("Y") && !sellWish.equals("N"));
						
						if(sellWish.equals("Y")) {
							System.out.println("You Have Successfully Sell " + myBird.get(idxRemove).getName());
							System.out.println("Goodbye " + myBird.get(idxRemove).getName());
							int penghasilan = myBird.get(idxRemove).getPrice()/2;
							System.out.println("You get " + penghasilan + " worth of money");
							int newMoney = myChar.getMoney() + penghasilan;
							myChar.setMoney(newMoney);
							int newIncome = myChar.getCurrentIncome() - myBird.get(idxRemove).getIncome();
							myChar.setCurrentIncome(newIncome);
							birdIncome -= myBird.get(idxRemove).getIncome();
							totalIncome -= myBird.get(idxRemove).getIncome();
							myBird.remove(idxRemove);
						}else {
							System.out.println("You Have Cancel Your Transaction");
						}
						System.out.print("Press ENTER to Continue..."); scan.nextLine();
					}
				}else if(noKandang == 2) {
					if(myMammal.size() == 0) {
						System.out.println("You don't have any mammal yet!");
						System.out.print("Press Enter to Continue..."); scan.nextLine();
					}else {
						do {
							System.out.print("Choose Which One You Wish to Sell [1-" + myMammal.size() + "]: ");
							try {
								idxRemove = scan.nextInt();
							} catch (Exception e) {
								// TODO: handle exception
								idxRemove = 0;
							}
							scan.nextLine();
						}while(idxRemove < 1 || idxRemove > myMammal.size());
						idxRemove-=1;
						do {
							System.out.print("Are You Sure you Want to Sell " + myMammal.get(idxRemove).getName() + "[Y/N]: ");
							sellWish = scan.nextLine();
						}while(!sellWish.equals("Y") && !sellWish.equals("N"));
						
						if(sellWish.equals("Y")) {
							System.out.println("You Have Successfully Sell " + myMammal.get(idxRemove).getName());
							System.out.println("Goodbye " + myMammal.get(idxRemove).getName());
							int penghasilan = myMammal.get(idxRemove).getPrice()/2;
							System.out.println("You get " + penghasilan + " worth of money");
							int newMoney = myChar.getMoney() + penghasilan;
							myChar.setMoney(newMoney);
							int newIncome = myChar.getCurrentIncome() - myMammal.get(idxRemove).getIncome();
							myChar.setCurrentIncome(newIncome);
							mammalIncome -= myMammal.get(idxRemove).getIncome();
							totalIncome -= myMammal.get(idxRemove).getIncome();
							myMammal.remove(idxRemove);
						}else {
							System.out.println("You Have Cancel Your Transaction");
						}
						System.out.print("Press ENTER to Continue..."); scan.nextLine();
					}
				}else if(noKandang == 3) {
					if(myFish.size() == 0) {
						System.out.println("You don't have any fish yet!");
						System.out.print("Press Enter to Continue..."); scan.nextLine();
					}else {
						do {
							System.out.print("Choose Which One You Wish to Sell [1-" + myFish.size() + "]: ");
							try {
								idxRemove = scan.nextInt();
							} catch (Exception e) {
								// TODO: handle exception
								idxRemove = 0;
							}
							scan.nextLine();
						}while(idxRemove < 1 || idxRemove > myFish.size());
						idxRemove-=1;
						do {
							System.out.print("Are You Sure you Want to Sell " + myFish.get(idxRemove).getName() + "[Y/N]: ");
							sellWish = scan.nextLine();
						}while(!sellWish.equals("Y") && !sellWish.equals("N"));
						
						if(sellWish.equals("Y")) {
							System.out.println("You Have Successfully Sell " + myFish.get(idxRemove).getName());
							System.out.println("Goodbye " + myFish.get(idxRemove).getName());
							int penghasilan = myFish.get(idxRemove).getPrice()/2;
							System.out.println("You get " + penghasilan + " worth of money");
							int newMoney = myChar.getMoney() + penghasilan;
							myChar.setMoney(newMoney);
							int newIncome = myChar.getCurrentIncome() - myFish.get(idxRemove).getIncome();
							myChar.setCurrentIncome(newIncome);
							fishIncome -= myFish.get(idxRemove).getIncome();
							totalIncome -= myFish.get(idxRemove).getIncome();
							myFish.remove(idxRemove);
						}else {
							System.out.println("You Have Cancel Your Transaction");
						}
						System.out.print("Press ENTER to Continue..."); scan.nextLine();
					}
				}else if(noKandang == 4) {
					if(myReptil.size() == 0) {
						System.out.println("You Don't Have any reptil yet!");
						System.out.print("Press Enter to Continue..."); scan.nextLine();
					}else {
						do {
							System.out.print("Choose Which One You Wish to Sell [1-" + myReptil.size() + "]: ");
							try {
								idxRemove = scan.nextInt();
							} catch (Exception e) {
								// TODO: handle exception
								idxRemove = 0;
							}
							scan.nextLine();
						}while(idxRemove < 1 || idxRemove > myReptil.size());
						idxRemove-=1;
						do {
							System.out.print("Are You Sure you Want to Sell " + myReptil.get(idxRemove).getName() + "[Y/N]: ");
							sellWish = scan.nextLine();
						}while(!sellWish.equals("Y") && !sellWish.equals("N"));
						
						if(sellWish.equals("Y")) {
							System.out.println("You Have Successfully Sell " + myReptil.get(idxRemove).getName());
							System.out.println("Goodbye " + myReptil.get(idxRemove).getName());
							int penghasilan = myReptil.get(idxRemove).getPrice()/2;
							System.out.println("You get " + penghasilan + " worth of money");
							int newMoney = myChar.getMoney() + penghasilan;
							myChar.setMoney(newMoney);
							int newIncome = myChar.getCurrentIncome() - myReptil.get(idxRemove).getIncome();
							myChar.setCurrentIncome(newIncome);
							reptilIncome -= myReptil.get(idxRemove).getIncome();
							totalIncome -= myReptil.get(idxRemove).getIncome();
							myReptil.remove(idxRemove);
						}else {
							System.out.println("You Have Cancel Your Transaction");
						}
						System.out.print("Press ENTER to Continue..."); scan.nextLine();
					}
				}else {
					if(myAmphibi.size() == 0) {
						System.out.println("You Don't Have any amphibi yet!");
						System.out.print("Press Enter to Continue..."); scan.nextLine();
					}else {
						do {
							System.out.print("Choose Which One You Wish to Sell [1-" + myAmphibi.size() + "]: ");
							try {
								idxRemove = scan.nextInt();
							} catch (Exception e) {
								// TODO: handle exception
								idxRemove = 0;
							}
							scan.nextLine();
						}while(idxRemove < 1 || idxRemove > myAmphibi.size());
						do {
							System.out.print("Are You Sure you Want to Sell " + myAmphibi.get(idxRemove).getName() + "[Y/N]: ");
							sellWish = scan.nextLine();
						}while(!sellWish.equals("Y") && !sellWish.equals("N"));
						
						if(sellWish.equals("Y")) {
							System.out.println("You Have Successfully Sell " + myAmphibi.get(idxRemove).getName());
							System.out.println("Goodbye " + myAmphibi.get(idxRemove).getName());
							int penghasilan = myAmphibi.get(idxRemove).getPrice()/2;
							System.out.println("You get " + penghasilan + " worth of money");
							int newMoney = myChar.getMoney() + penghasilan;
							myChar.setMoney(newMoney);
							int newIncome = myChar.getCurrentIncome() - myAmphibi.get(idxRemove).getIncome();
							myChar.setCurrentIncome(newIncome);
							amphibiIncome -= myAmphibi.get(idxRemove).getIncome();
							totalIncome -= myAmphibi.get(idxRemove).getIncome();
							myAmphibi.remove(idxRemove);
						}else {
							System.out.println("You Have Cancel Your Transaction");
						}
						System.out.print("Press ENTER to Continue..."); scan.nextLine();
					}
				}
				break;
			case 3:
				if(noKandang == 1) {
					System.out.println("Your Current Income for Bird = " + birdIncome);
				}else if(noKandang == 2) {
					System.out.println("Your Current Income for Mammal = " + mammalIncome);
				}else if(noKandang == 3) {
					System.out.println("Your Current Income for Fish = " + fishIncome);
				}else if(noKandang == 4) {
					System.out.println("Your Current Income for Reptil = " + reptilIncome);
				}else {
					System.out.println("Your Current Income for Amphibi = " + amphibiIncome);
				}
				System.out.print("Press ENTER to Continue..."); scan.nextLine();
				break;
		}
		return choose;
	}
	
	public void kandangBurung() {
		int choose = 0;
		do {
			cls();
			System.out.println(myChar.getName() + "'s Bird List");
			int length = myChar.getName().length();
			for(int i=0; i<length+12;i++) {
				System.out.print("=");
			}
			System.out.println("");
			System.out.println("=================================================");
			System.out.println("| Name            | Species    | Price | Income |");
			System.out.println("=================================================");
			for(int i=0;i<myBird.size();i++) {
				System.out.printf("| %-15s | %-10s | %-5d | %-6d |\n",myBird.get(i).getName(),myBird.get(i).getSpecies(),myBird.get(i).getPrice(),myBird.get(i).income);
			}
			System.out.println("=================================================");
			choose = menu(1);
		}while (choose != 4);
	}
	
	public void kandangMammal() {
		int choose = 0;
		do {
			cls();
			System.out.println(myChar.getName() + "'s Mammal List");
			int length = myChar.getName().length();
			for(int i=0; i<length+14;i++) {
				System.out.print("=");
			}
			System.out.println("");
			System.out.println("=================================================");
			System.out.println("| Name            | Species    | Price | Income |");
			System.out.println("=================================================");
			for(int i=0;i<myMammal.size();i++) {
				System.out.printf("| %-15s | %-10s | %-5d | %-6d |\n",myMammal.get(i).getName(),myMammal.get(i).getSpecies(),myMammal.get(i).getPrice(),myMammal.get(i).income);
			}
			System.out.println("=================================================");
			choose = menu(2);
		}while (choose != 4);
		
	}
	
	public void kandangIkan() {
		int choose = 0;
		do {
			cls();
			System.out.println(myChar.getName() + "'s Fish List");
			int length = myChar.getName().length();
			for(int i=0; i<length+12;i++) {
				System.out.print("=");
			}
			System.out.println("");
			System.out.println("=================================================");
			System.out.println("| Name            | Species    | Price | Income |");
			System.out.println("=================================================");
			for(int i=0;i<myFish.size();i++) {
				System.out.printf("| %-15s | %-10s | %-5d | %-6d |\n",myFish.get(i).getName(),myFish.get(i).getSpecies(),myFish.get(i).getPrice(),myFish.get(i).income);
			}
			System.out.println("=================================================");
			choose = menu(3);
		}while (choose != 4);
	}
	
	public void kandangReptil() {
		int choose = 0;
		do {
			cls();
			System.out.println(myChar.getName() + "'s Reptil List");
			int length = myChar.getName().length();
			for(int i=0; i<length+14;i++) {
				System.out.print("=");
			}
			System.out.println("");
			System.out.println("=================================================");
			System.out.println("| Name            | Species    | Price | Income |");
			System.out.println("=================================================");
			for(int i=0;i<myReptil.size();i++) {
				System.out.printf("| %-15s | %-10s | %-5d | %-6d |\n",myReptil.get(i).getName(),myReptil.get(i).getSpecies(),myReptil.get(i).getPrice(),myReptil.get(i).income);
			}
			System.out.println("=================================================");
			choose = menu(4);
		}while (choose != 4);
	}
	
	public void kandangAmfibi() {int choose = 0;
		do {
			cls();
			System.out.println(myChar.getName() + "'s Amphibi List");
			int length = myChar.getName().length();
			for(int i=0; i<length+15;i++) {
				System.out.print("=");
			}
			System.out.println("");
			System.out.println("=================================================");
			System.out.println("| Name            | Species    | Price | Income |");
			System.out.println("=================================================");
			for(int i=0;i<myAmphibi.size();i++) {
				System.out.printf("| %-15s | %-10s | %-5d | %-6d |\n",myAmphibi.get(i).getName(),myAmphibi.get(i).getSpecies(),myAmphibi.get(i).getPrice(),myAmphibi.get(i).income);
			}
			System.out.println("=================================================");
			choose = menu(5);
		}while (choose != 4);
	}
	
	public Main() {
		int y=18,x=12;
		int tempX,tempY;
		String name;
		int day = 1;
		
		int flag;
		int nameLength;
		cls();
		SlowType("WELCOME TO ZOO SIMULATOR\n", 100);
		SlowType("Made By:\n", 100);
		SlowType("Akmal Wiraprana - 2201836021\n", 100);
		SlowType("Darren - 2201759930\n", 100);
		SlowType("Hanson Jonathan - 2201733396\n", 100);
		SlowType("Joseph Rudolf Marudur - 2201840492\n", 100);
		SlowType("Press ENTER to Continue...", 100);scan.nextLine();
		declareMap();
		char move;
		
		cls();
		do {
			System.out.print("Please Tell Us Your Name[5-20 characters]: ");
			name = scan.nextLine();
		}while(name.length() < 5 || name.length() > 20);
		myChar.setName(name);
		nameLength = name.length();
		
		do {
			cls();
			tempX = x;
			tempY = y;
			flag = 0;
			System.out.println(myChar.getName() + "'s Zoo");
			for(int i=0;i<nameLength+6;i++) {
				System.out.print("=");
			}
			System.out.println("");
			System.out.println("Money : " + myChar.getMoney());
			System.out.println("Current Income : " + myChar.getCurrentIncome());
			System.out.println("Day : " + day);
			printMap(x, y);
			System.out.print("Press [W|A|S|D] to move (N for Next Day): ");
			move = scan.next().charAt(0);scan.nextLine();
			switch(move) {
				case 'A':
					flag = 1;
					tempX--;
					break;
				case 'S':
					flag = 1;
					tempY++;
					break;
				case 'W':
					flag = 1;
					tempY--;
					break;
				case 'D':
					flag = 1;
					tempX++;
					break;
				case 'N':
					flag = 1;
					nextDay();
					break;
			}
			if(flag == 1 && move != 'N') {
				
				if(map[tempY].charAt(tempX) != '#') {
					if(map[tempY].charAt(tempX) == ' ') {
						y = tempY;
						x = tempX;
					}else if(map[tempY].charAt(tempX) == '1') {
						cls();
						kandangBurung();
					}else if(map[tempY].charAt(tempX) == '2') {
						cls();
						kandangMammal();
					}else if(map[tempY].charAt(tempX) == '3') {
						cls();
						kandangIkan();
					}else if(map[tempY].charAt(tempX) == '4') {
						cls();
						kandangReptil();
					}else if(map[tempY].charAt(tempX) == '5') {
						cls();
						kandangAmfibi();
					}else if(map[tempY].charAt(tempX) == 'E') {
						break;
					}
				}
			}else if(flag == 1 && move == 'N'){
				cls();
				System.out.println("You have earned " + myChar.getCurrentIncome() + " worth of money today");
				System.out.print("Press ENTER to Continue"); scan.nextLine();
				int newMoney = myChar.getMoney() + myChar.getCurrentIncome();
				myChar.setMoney(newMoney);
				day++;
			}
			
		}while(true);
		cls();
		SlowType("Thank You For Playing!\n", 100);
		SlowType("Press ENTER to Continue...", 100);scan.nextLine();
		cls();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	public void declareMap() {
		 map[0] = "#########################";
		 map[1] = "#          ##2##        #";
		 map[2] = "#          ## ##      ###";
		 map[3] = "##                     4#";
		 map[4] = "##                    ###";
		 map[5] = "###                     #";
		 map[6] = "#1                      #";
		 map[7] = "###                   ###";
		 map[8] = "#                       #";
		 map[9] = "####                    #";
		map[10] = "#                       #";
		map[11] = "###                   ###";
		map[12] = "#5                     3#";
		map[13] = "###                   ###";
		map[14] = "#                       #";
		map[15] = "#                       #";
		map[16] = "#                       #";
		map[17] = "#E                     E#";
		map[18] = "#                       #";
		map[19] = "#                       #";
		map[19] = "#########################";
	}

}
