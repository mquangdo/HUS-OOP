package OOP2023_2024.decorator;

public abstract class ToppingDecorator extends Bread {
	Bread bread;
	
	public abstract String getDescription();

	public Bread getBread() {
		return this.bread;
	}
}
