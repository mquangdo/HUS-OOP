package OOP2021_2022_de2.iterator;

public class MyArrayIterator implements Iterator {
	private String[] items;
	private int position;
 
	public MyArrayIterator(String[] items) {
		this.items = items;
		this.position = 0;
	}
 
	public String next() {
		while (hasNext()){
			String temp = items[position];
			position++;
			return temp;
		}
		return next();
	}
 
	public boolean hasNext() {
		/* TODO */
		return position < items.length;
	}
}
