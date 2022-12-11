package exe;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	
	// method program sims ala-ala
	
	public void Menu() {
		System.out.println("SIMS ala-ala");
		System.out.println("============");
		
		// minta inputan name dari user (tidak ada validasi)
		
		System.out.print("Input name : ");
		String name = scan.nextLine();
		
		// buat object newPerson dari class Person dengan upcasting ke class Student
		
		Person newPerson = new Student(name, 50, 50);
		
		// menu do-while sampai ilmu >= 100 buat naik level
		
		int menu;
		
		do {
			Status(newPerson);
			
			// list menu berdasarkan method dari class Student
			
			System.out.println("1. eat");
			System.out.println("2. sleep");
			System.out.println("3. study");
			
			// minta inputan menu dari user (validasi menu dari 1 - 3)
			
			System.out.print("Input menu : ");
			menu = scan.nextInt();
			scan.nextLine();
			
			switch (menu) {
				case 1:{
					newPerson.eat();
					scan.nextLine();
					
					break;
				}
				case 2:{
					newPerson.sleep();
					scan.nextLine();
					
					break;
				}
				case 3:{
					// validasi jika stamina <= 20, maka method study() tidak akan dijalankan
					
					if(newPerson.getStamina() <= 20) {
						System.out.println(newPerson.getClass().getSimpleName() + " " + newPerson.getName() + " is tired.");
						scan.nextLine();
					}else {
						((Student) newPerson).study();
						scan.nextLine();						
					}
					
					break;
				}
			}
		} while ((menu >= 1 || menu <= 3) && newPerson.getIntelligence() < 100);
		
		// ambil 1 random number buat nentuin job setelah naik level
		
		int num = ThreadLocalRandom.current().nextInt(1,4);
		
		switch (num) {
			case 1:{
				// pindahin object newPerson yang class Student ke object newPerson1 class OfficeWorker
				
				OfficeWorker newPerson1 = new OfficeWorker(newPerson.getName(), newPerson.getStamina(), newPerson.getIntelligence(), 100);
				
				// menu do-while sampai num2 bukan 1
				
				int menu2;
				
				int num2 = 1;
				
				do {
					Status(newPerson1);
					
					// list menu berdasarkan method dari class OfficeWorker
					
					System.out.println("1. eat");
					System.out.println("2. sleep");
					System.out.println("3. work");
					
					// minta inputan menu2 dari user (validasi menu dari 1 - 3)
					
					System.out.print("Input menu : ");
					menu2 = scan.nextInt();
					scan.nextLine();
					
					switch (menu2) {
						case 1:{
							// validasi jika money <= 20, maka method eat() tidak akan dijalankan
							
							if(newPerson1.getMoney() <= 20) {
								System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " doesn't have any money left.");
								scan.nextLine();
							}else {
								newPerson1.eat();
								scan.nextLine();
							}
							
							break;
						}
						case 2:{
							newPerson1.sleep();
							
							// buat dapat random number untuk num2
							
							num2 = ThreadLocalRandom.current().nextInt(1,3);
							
							scan.nextLine();
							
							break;
						}
						case 3:{
							// validasi jika stamina <= 20, maka method work() tidak akan dijalankan
							
							if(newPerson1.getStamina() <= 20) {
								System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " is tired.");
								scan.nextLine();
							}else {
								newPerson1.work();
								scan.nextLine();
							}
							
							break;
						}
					}
				} while ((menu2 >= 1 || menu2 <= 3) && num2 == 1);
				
				System.out.println("May " + newPerson1.getName() + " rest in peace..."); // kalo dapat num2 nya 2 atau 3, program kelar
				
				break;
			}
			case 2:{
				// pindahin object newPerson yang class Student ke object newPerson1 class Athlete
				
				Athlete newPerson1 = new Athlete(newPerson.getName(), newPerson.getStamina(), newPerson.getIntelligence(), 100, 50);
				
				// menu do-while sampai num2 bukan 1
				
				int menu2;
				
				int num2 = 1;
				
				do {
					Status(newPerson1);
					
					// list menu berdasarkan method dari class Athlete
					
					System.out.println("1. eat");
					System.out.println("2. sleep");
					System.out.println("3. work");
					System.out.println("4. train");
					
					// minta inputan menu2 dari user (validasi menu dari 1 - 4)
					
					System.out.print("Input menu : ");
					menu2 = scan.nextInt();
					scan.nextLine();
					
					switch (menu2) {
						case 1:{
							// validasi jika money <= 20, maka method eat() tidak akan dijalankan
							
							if(newPerson1.getMoney() <= 20) {
								System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " doesn't have any money left.");
								scan.nextLine();
							}else {
								newPerson1.eat();
								scan.nextLine();
							}
							
							break;
						}
						case 2:{
							newPerson1.sleep();
							
							// buat dapat random number untuk num2
							
							num2 = ThreadLocalRandom.current().nextInt(1,3);
							
							scan.nextLine();
							
							break;
						}
						case 3:{
							// validasi jika stamina <= 20, maka method work() tidak akan dijalankan
							
							if(newPerson1.getStamina() <= 20) {
								System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " is tired.");
								scan.nextLine();
							}else {
								newPerson1.work();
								scan.nextLine();
							}
							
							break;
						}
						case 4:{
							// validasi jika stamina <= 20, maka method train() tidak akan dijalankan
							
							if(newPerson1.getStamina() <= 20) {
								System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " is tired.");
								scan.nextLine();
							}else {
								newPerson1.train();
								scan.nextLine();
							}
							
							break;
						}
					}
				} while ((menu2 >= 1 || menu2 <= 4) && num2 == 1);
				
				System.out.println("May " + newPerson1.getName() + " rest in peace..."); // kalo dapat num2 nya 2 atau 3, program kelar
				
				break;
			}
			case 3:{
				// pindahin object newPerson yang class Student ke object newPerson1 class Singer
				
				Singer newPerson1 = new Singer(newPerson.getName(), newPerson.getStamina(), newPerson.getIntelligence(), 100, 50);
				
				// menu do-while sampai num2 bukan 1
				
				int menu2;
				
				int num2 = 1;
				
				do {
					Status(newPerson1);
					
					// list menu berdasarkan method dari class Singer
					
					System.out.println("1. eat");
					System.out.println("2. sleep");
					System.out.println("3. work");
					System.out.println("4. train");
					
					// minta inputan menu2 dari user (validasi menu dari 1 - 4)
					
					System.out.print("Input menu : ");
					menu2 = scan.nextInt();
					scan.nextLine();
					
					switch (menu2) {
						case 1:{
							// validasi jika money <= 20, maka method eat() tidak akan dijalankan
							
							if(newPerson1.getMoney() <= 20) {
								System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " doesn't have any money left.");
								scan.nextLine();
							}else {
								newPerson1.eat();
								scan.nextLine();
							}
							
							break;
						}
						case 2:{
							newPerson1.sleep();
							
							// buat dapat random number untuk num2
							
							num2 = ThreadLocalRandom.current().nextInt(1,3);
							
							scan.nextLine();
							
							break;
						}
						case 3:{
							// validasi jika stamina <= 20, maka method work() tidak akan dijalankan
							
							if(newPerson1.getStamina() <= 20) {
								System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " is tired.");
								scan.nextLine();
							}else {
								newPerson1.work();
								scan.nextLine();
							}
							
							break;
						}
						case 4:{
							// validasi jika stamina <= 20, maka method work() tidak akan dijalankan
							
							if(newPerson1.getStamina() <= 20) {
								System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " is tired.");
								scan.nextLine();
							}else {
								newPerson1.train();
								scan.nextLine();
							}
							
							break;
						}
					}
				} while ((menu2 >= 1 || menu2 <= 4) && num2 == 1);
				
				System.out.println("May " + newPerson1.getName() + " rest in peace..."); // kalo dapat num2 nya 2 atau 3, program kelar
				
				break;
			}
			case 4:{
				// pindahin object newPerson yang class Student ke object newPerson1 class Guitarist
				
				Guitarist newPerson1 = new Guitarist(newPerson.getName(), newPerson.getStamina(), newPerson.getIntelligence(), 100, 50);
				
				// menu do-while sampai num2 bukan 1
				
				int menu2;
				
				int num2 = 1;
				
				do {
					Status(newPerson1);
					
					// list menu berdasarkan method dari class Guitarist
					
					System.out.println("1. eat");
					System.out.println("2. sleep");
					System.out.println("3. work");
					System.out.println("4. train");
					
					// minta inputan menu2 dari user (validasi menu dari 1 - 4)
					
					System.out.print("Input menu : ");
					menu2 = scan.nextInt();
					scan.nextLine();
					
					switch (menu2) {
						case 1:{
							// validasi jika money <= 20, maka method eat() tidak akan dijalankan
							
							if(newPerson1.getMoney() <= 20) {
								System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " doesn't have any money left.");
								scan.nextLine();
							}else {
								newPerson1.eat();
								scan.nextLine();
							}
							
							break;
						}
						case 2:{
							newPerson1.sleep();
							
							// buat dapat random number untuk num2
							
							num2 = ThreadLocalRandom.current().nextInt(1,3);
							
							scan.nextLine();
							
							break;
						}
						case 3:{
							// validasi jika stamina <= 20, maka method work() tidak akan dijalankan
							
							if(newPerson1.getStamina() <= 20) {
								System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " is tired.");
								scan.nextLine();
							}else {
								newPerson1.work();
								scan.nextLine();
							}
							
							break;
						}
						case 4:{
							// validasi jika stamina <= 20, maka method train() tidak akan dijalankan
							
							if(newPerson1.getStamina() <= 20) {
								System.out.println(newPerson1.getClass().getSimpleName() + " " + newPerson1.getName() + " is tired.");
								scan.nextLine();
							}else {
								newPerson1.train();
								scan.nextLine();
							}
							
							break;
						}
					}
				} while ((menu2 >= 1 || menu2 <= 4) && num2 == 1);
				
				System.out.println("May " + newPerson1.getName() + " rest in peace..."); // kalo dapat num2 nya 2 atau 3, program kelar
				
				break;
			}
		}
		
		System.out.println("Press enter to continue...");
		scan.nextLine();
		
		// END.
	}
	
	// method print list data object
	
	public void Status(Person p) {
		System.out.println("Class : " + p.getClass().getSimpleName()); // nama class
		System.out.println("Name : " + p.getName()); // name
		System.out.println("Stamina : " + p.getStamina()); // stamina
		System.out.println("Intelligence : " + p.getIntelligence()); // ilmu
		
		if(p instanceof OfficeWorker) { // kalo bagian dari class OfficeWorker -> OfficeWorker, Athlete, Musician (Singer, Guitarist)
			System.out.println("Money : " + ((OfficeWorker) p).getMoney()); // money
		}
		
		if(p instanceof Athlete) { // kalo bagian dari class Athlete
			System.out.println("Power : " + ((Athlete) p).getPower()); // power
		}
		
		if(p instanceof Musician) { // kalo bagian dari class Musician -> Singer, Guitarist
			System.out.println("Skill : " + ((Musician) p).getSkill()); // skill
		}
	}

	public Main() {
		// TODO Auto-generated constructor stub
		
		// test codingan untuk semua class
		
//		Person p = new Person("Andi", 100, 100); -> tidak bisa karena abstract class
		
		Student s = new Student("Andi", 50, 50);
		s.eat();
		s.sleep();
		s.study();
		Status(s);
		System.out.println("");
		
		OfficeWorker o = new OfficeWorker("Andi", 50, 50, 100);
		o.eat();
		o.sleep();
		o.work();
		Status(o);
		System.out.println("");
		
		Athlete a = new Athlete("Andi", 50, 50, 100, 50);
		a.eat();
		a.sleep();
		a.work();
		a.train();
		Status(a);
		System.out.println("");
		
//		Musician m = new Musician("Andi", 50, 50, 100, 50); -> tidak bisa karena abstract class
		
		Singer i = new Singer("Andi", 50, 50, 100, 50);
		i.eat();
		i.sleep();
		i.work();
		i.train();
		Status(i);
		System.out.println("");
		
		Guitarist g = new Guitarist("Andi", 50, 50, 100, 50);
		g.eat();
		g.sleep();
		g.work();
		g.train();
		Status(g);
		System.out.println("");
		
		// SIMS
		
		Menu(); // program sims ala-ala
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Main();
		
	}

}
