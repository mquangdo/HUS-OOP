package OOP2021_2022_de2.decorator;

public abstract class ToppingDecorator extends Bread {
	Bread bread;
	
	public abstract String getDescription();

	public Bread getBread() {
		return this.bread;
	}
}
