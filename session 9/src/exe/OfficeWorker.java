package exe;

/* class OfficeWorker child dari class Person
 * ambil method work() dari interface Work
 * tambah variable money (encapsulation)
 */

public class OfficeWorker extends Person implements Work {

	private int money;
	
	public OfficeWorker(String name, int stamina, int intelligence, int money) {
		super(name, stamina, intelligence);
		// TODO Auto-generated constructor stub
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " is working.");
		money += 50;
		setStamina(getStamina() - 20);
		setIntelligence(getIntelligence() + 20);
		// dari kerja dapat money 50 dan ilmu 20 tapi kurang stamina 20
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " is eating.");
		setStamina(getStamina() + 10);
		money -= 5;
		// dari makan dapat stamina 10 tapi butuh money 5 buat bayar
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " is sleeping.");
		setStamina(getStamina() + 30); // dari tidur dapat stamina 30
	}

}
