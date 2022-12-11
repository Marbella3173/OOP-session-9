package exe;

//class Guitarist child dari class Musician

import java.util.concurrent.ThreadLocalRandom;

public class Guitarist extends Musician {

	public Guitarist(String name, int stamina, int intelligence, int money, int skill) {
		super(name, stamina, intelligence, money, skill);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void train() {
		// TODO Auto-generated method stub
		
		// ambil 1 random number buat nentuin action yang dilakuin di method train()
		
		int num = ThreadLocalRandom.current().nextInt(0,5);
		
		String s = null;
		
		switch (num) {
			case 0:{
				s = "is having a guitar class.";
				break;
			}
			case 1:{
				s = "explores new genres.";
				break;
			}
			case 2:{
				s = "is testing a new guitar.";
				break;
			}
			case 3:{
				s = "is trying to write a song.";
				break;
			}
			case 4:{
				s = "is training with Day6.";
				break;
			}
			case 5:{
				s = "is learning with Dewa Budjana.";
				break;
			}
		}
		
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " " + s);
		setStamina(getStamina() - 20);
		setSkill(getSkill() + 15);
		// dari latihan dapat skill 15 tapi kurang stamina 20
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
		// ambil 1 random number buat nentuin action yang dilakuin di method train()
		
		int num = ThreadLocalRandom.current().nextInt(0,9);
		
		String s = null;
		
		switch (num) {
			case 0:{
				s = "is performing at Coachella.";
				break;
			}
			case 1:{
				s = "writes a single with Ed Sheeran.";
				break;
			}
			case 2:{
				s = "is having a world tour concert.";
				break;
			}
			case 3:{
				s = "performs at We The Fest.";
				break;
			}
			case 4:{
				s = "makes a song for Charlie Puth";
				break;
			}
			case 5:{
				s = "is having a magazine photoshoot.";
				break;
			}
			case 6:{
				s = "is shooting a commercial video.";
				break;
			}
			case 7:{
				s = "is looking for an endorsement.";
				break;
			}
			case 8:{
				s = "performs at MAMA.";
				break;
			}
			case 9:{
				s = "receives a trophy.";
				break;
			}
		}
		
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " " + s);
		setMoney(getMoney() + 100);
		setStamina(getStamina() - 50);
		setIntelligence(getIntelligence() + 25);
		// dari kerja dapat money 100 dan ilmu 25 tapi kurang stamina 50
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " is eating.");
		setStamina(getStamina() + 30);
		setMoney(getMoney() - 25);
		// dari makan dapat stamina 30 tapi butuh money 25
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " is sleeping.");
		setStamina(getStamina() + 45); // dari tidur dapat stamina 45
	}

}
