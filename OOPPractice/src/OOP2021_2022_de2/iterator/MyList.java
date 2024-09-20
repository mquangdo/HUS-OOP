package OOP2021_2022_de2.iterator;

import java.util.ArrayList;

public class MyList implements MyIterable {
	private ArrayList<String> menuItems;

	public MyList() {
		menuItems = new ArrayList<String>();
	}

	public void addItem(String name) {
		/* TODO */
		menuItems.add(name);
	}

	public ArrayList<String> getMenuItems() {
		/* TODO */
		return menuItems;
	}

	public Iterator createIterator() {
		/* TODO */
		return new MyListIterator(menuItems);
	}

	public String toString() {
		/* TODO */
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < menuItems.size(); i++) {
			sb.append(String.format("[%s]", menuItems.get(i)));
		}
		return sb.toString();
	}
}
