package exe;

// class Singer child dari class Musician

import java.util.concurrent.ThreadLocalRandom;

public class Singer extends Musician {

	public Singer(String name, int stamina, int intelligence, int money, int skill) {
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
				s = "is having a vocal class.";
				break;
			}
			case 1:{
				s = "is trying to write a song.";
				break;
			}
			case 2:{
				s = "is learning to play guitar.";
				break;
			}
			case 3:{
				s = "is going to Gym.";
				break;
			}
			case 4:{
				s = "is jogging.";
				break;
			}
			case 5:{
				s = "is training with Lyodra.";
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
		
		// ambil 1 random number buat nentuin action yang dilakuin di method work()
		
		int num = ThreadLocalRandom.current().nextInt(0,9);
		
		String s = null;
		
		switch (num) {
			case 0:{
				s = "is having a collab with Charlie Puth.";
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
				s = "appears in Hasley's concert.";
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
		setIntelligence(getIntelligence() + 20);
		// dari kerja dapat money 100 dan ilmu 20 tapi kurang stamina 50
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
