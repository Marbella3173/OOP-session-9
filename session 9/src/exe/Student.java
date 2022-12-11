package exe;

/* class Student child dari class Person
 * tambah method study()
 */

public class Student extends Person {

	public Student(String name, int stamina, int intelligence) {
		super(name, stamina, intelligence);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " is eating.");
		setStamina(getStamina() + 15); // dari makan tambah stamina 15
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " is sleeping.");
		setStamina(getStamina() + 50); // dari tidur tambah stamina 50
	}
	
	public void study() {
		System.out.println(super.getClass().getSimpleName() + " " + super.getName() + " is studying.");
		setIntelligence(getIntelligence() + 20);
		setStamina(getStamina() - 10);
		// dari belajar tambah ilmu 20 tapi kura stamina 10
	}
	
}
