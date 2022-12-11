package exe;

/* class Athlete child dari class OfficeWorker
 * ambil method train() dari interface Train
 * tambah variable power (encapsulation)
 */

import java.util.concurrent.ThreadLocalRandom;

public class Athlete extends OfficeWorker implements Train {

	private int power;
	
	public Athlete(String name, int stamina, int intelligence, int money, int power) {
		super(name, stamina, intelligence, money);
		// TODO Auto-generated constructor stub
		this.power = power;
	}
	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public void train() {
		// TODO Auto-generated method stub
		
		// ambil 1 random number buat nentuin action yang dilakuin di method train()
		
		int num = ThreadLocalRandom.current().nextInt(0,5);
		
		String s = null;
		
		switch (num) {
			case 0:{
				s = "is jogging.";
				break;
			}
			case 1:{
				s = "is going to Gym.";
				break;
			}
			case 2:{
				s = "is sparring with Kevin Sanjaya.";
				break;
			}
			case 3:{
				s = "is sparring with Jonatan Christie.";
				break;
			}
			case 4:{
				s = "is workout together with Hendra Setiawan.";
				break;
			}
			case 5:{
				s = "is taking an ice bath.";
				break;
			}
		}
		
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " " + s);
		setStamina(getStamina() - 20);
		power += 15;
		// dari latihan tambah power 15 tapi kurang stamina 20
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
		// ambil 1 random number buat nentuin action yang dilakuin di method work()
		
		int num = ThreadLocalRandom.current().nextInt(0,9);
		
		String s = null;
		
		switch (num) {
			case 0:{
				s = "is competing at World Tour Finals.";
				break;
			}
			case 1:{
				s = "is competing at the Olympics.";
				break;
			}
			case 2:{
				s = "is competing at Indonesian Open.";
				break;
			}
			case 3:{
				s = "is competing at Japan Open.";
				break;
			}
			case 4:{
				s = "appears in the Yonex Exhibiton.";
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
				s = "is going on a world tour.";
				break;
			}
			case 9:{
				s = "is competing at Sudirman Cup.";
				break;
			}
		}
		
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " " + s);
		setMoney(getMoney() + 100);
		setStamina(getStamina() - 50);
		setIntelligence(getIntelligence() + 30);
		// dari kerja dapat money 100 dan ilmu 30 tapi kurang stamina 50
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " is eating.");
		setStamina(getStamina() + 30);
		setMoney(getMoney() - 20);
		// dari makan dapat stamina 30 tapi butuh money 20
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " is sleeping.");
		setStamina(getStamina() + 40); // dari tidur dapat stamina 40
	}
	
}
