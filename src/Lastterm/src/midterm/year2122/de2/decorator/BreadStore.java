package midterm.year2122.de2.decorator;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class BreadStore {
	private List<Bread> breads;

	public BreadStore() {
		breads = new LinkedList<>();
	}

	/**
	 * Giả sử bánh mỳ được làm không cho một loại gia vị nhiều hơn một lần.
	 * Bắt đầu, tạo ra và cho vào cửa hàng:
	 *  5 bánh mỳ ThickcrustBread chỉ có cheese,
	 *  5 bánh mỳ ThickcrustBread chỉ có olives,
	 *  5 bánh mỳ ThickcrustBread có cả cheese và olives,
	 *  5 bánh mỳ ThincrustBread chỉ có cheese,
	 *  5 bánh mỳ ThincrustBread chỉ có olives,
	 *  5 bánh mỳ ThincrustBread có cả cheese và olives.
	 */


	public void init() {
		/* TODO */
		for (int i = 0; i < 5; i++) {
			Bread thickcrust = new ThickcrustBread();
			Bread cheese = new Cheese(thickcrust);
			breads.add(cheese);
		}
		for (int i = 0; i < 5; i++) {
			Bread thickcrust = new ThickcrustBread();
			Bread olive = new Olives(thickcrust);
			breads.add(olive);
		}
		for (int i = 0; i < 5; i++) {
			Bread thickcrust = new ThickcrustBread();
			Bread cheese = new Cheese(thickcrust);
			Bread olive = new Olives(cheese);
			breads.add(olive);
		}
		for (int i = 0; i < 5; i++) {
			Bread thincrust = new ThincrustBread();
			Bread cheese = new Cheese(thincrust);
			breads.add(cheese);
		}
		for (int i = 0; i < 5; i++) {
			Bread thincrust = new ThincrustBread();
			Bread olive = new Olives(thincrust);
			breads.add(olive);
		}
		for (int i = 0; i < 5; i++) {
			Bread thincrust = new ThincrustBread();
			Bread cheese = new Cheese(thincrust);
			Bread olive = new Olives(cheese);
			breads.add(olive);
		}
	}

	/**
	 * Thêm bánh mỳ vào cửa hàng.
	 */
	public void add(Bread bread) {
		/* TODO */
		breads.add(bread);
	}

	/**
	 * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
	 * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên có giá bằng giá
	 *  bánh mỳ yêu cầu.
	 * Nếu còn bánh mỳ để bán thì trả về giá trị true,
	 *  nếu không còn trả về giá trị false.
	 */
	public boolean sell(Bread bread) {
		/* TODO */
		for (Bread bread1: breads){
			if (bread1.getDescription().equals(bread.getDescription())){
				breads.remove(bread1);
				return true;
			}
		}
		return false;
	}

	/**
	 * In ra những bánh mỳ còn trong cửa hàng.
	 */
	public void print() {
		/* TODO */
		for (Bread bread: breads){
			System.out.println(bread.getDescription());
		}
	}

	/**
	 * Sắp xếp các bánh mỳ còn lại theo thứ tự được cho bởi order,
	 * nếu order là true, sắp xếp theo thứ tự tăng dần,
	 * nếu order là false, sắp xếp theo thứ tự giảm dần.
	 * Việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
	 */
	public List<Bread> sort(boolean order) {
		/* TODO */
		List<Bread> res = new LinkedList<>(breads);
		for (int i = 0; i < res.size() - 1; i++){
			for (int j = i + 1; j < res.size(); j++){
				if (order? res.get(i).cost() > res.get(j).cost():res.get(i).cost() < res.get(j).cost()){
					Bread temp = res.get(i);
					res.set(i, res.get(j));
					res.set(j, temp);
				}
			}
		}
		return res;
	}

	public void printList(List<Bread> breads){
		for (Bread bread: breads){
			System.out.println(bread.getDescription() + " " + bread.cost());
		}
	}

	/**
	 * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
	 * nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
	 * nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
	 */
	public List<Bread> filter(int howMany, boolean order) {
		/* TODO */
		List<Bread> temp = sort(order);
		List<Bread> res = new LinkedList<>();

		int minSize = Math.min(temp.size(), howMany);

		for (int i = 0; i < minSize; i++){
			res.add(temp.get(i));
		}
		return res;
	}

	public static void main(String args[]) {
		BreadStore breadStore = new BreadStore();
		breadStore.init();

		/*
		* Sau khi khởi tạo số bánh mỳ cho cửa hàng, viết chương trình demo:
		* - Thêm một số bánh mỳ vào cửa hàng
		* - Bán một số bánh mỳ từ cửa hàng
		* - In ra số bánh mỳ còn lại theo thứ tự giá tăng dần.
		* - In ra nhiều nhất 10 cái bánh mỳ có giá thấp nhất còn trong cửa hàng.
		*/
		/* TODO */

		Bread bread = new ThickcrustBread();
		Bread cheese = new Cheese(bread);
		System.out.println("Bread will be added into store description: " + cheese.getDescription());

		System.out.println("\nBefore add to store:");
		breadStore.print();

		breadStore.add(cheese);
		System.out.println("\nAfter add to store:");
		breadStore.print();
		System.out.println();

		Bread olive = new Olives(cheese);
		System.out.println("\nBread will be sold from store description: " + olive.getDescription());

		System.out.println("\nBefore sell:");
		breadStore.print();

		breadStore.sell(olive);
		System.out.println("\nAfter sell:");
		breadStore.print();
		System.out.println();

		System.out.println("\nPrint breads by increasing price with cost:");
		breadStore.printList(breadStore.sort(true));
		System.out.println();

		System.out.println("\nPrint top 10 cheapest bread from store:");
		breadStore.printList(breadStore.filter(10, true));
	}
}
