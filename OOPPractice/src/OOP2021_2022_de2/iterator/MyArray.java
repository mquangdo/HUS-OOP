package OOP2021_2022_de2.iterator;

public class MyArray implements MyIterable {
	private static final int MAX_ITEMS = 6;
	private int numberOfItems;
	private String[] menuItems;
  
	public MyArray() {
		numberOfItems = 0;
		menuItems = new String[MAX_ITEMS];
	}
  
	public void addItem(String name) {
		/* TODO */

		menuItems[numberOfItems] = name;
		numberOfItems++;

	}
 
	public String[] getMenuItems() {
		/* TODO */
		return menuItems;
	}
  
	public Iterator createIterator() {
		/* TODO */
		return new MyArrayIterator(menuItems);
	}
 
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < menuItems.length; i++) {
			sb.append(String.format("[%s]", menuItems.length));
		}
		return sb.toString();
	}
}
