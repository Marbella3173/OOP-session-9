package exe;

/* abstract class Musician (base buat class Singer dan Guitarist) child dari class OfficeWorker
 * ambil method train() dari interface Train
 * tambah variable skill (encapsulation)
 */

public abstract class Musician extends OfficeWorker implements Train {

	private int skill;
	
	public Musician(String name, int stamina, int intelligence, int money, int skill) {
		super(name, stamina, intelligence, money);
		// TODO Auto-generated constructor stub
		this.skill = skill;
	}
	
	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	@Override
	public abstract void train();

	@Override
	public abstract void work();

	@Override
	public abstract void eat();

	@Override
	public abstract void sleep();
	
}
