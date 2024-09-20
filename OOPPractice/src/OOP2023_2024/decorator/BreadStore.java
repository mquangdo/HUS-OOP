package OOP2023_2024.decorator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

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
		for (int i = 0; i < 5; i++){
			Bread thickcrust = new ThickcrustBread();
			Bread cheese = new Cheese(thickcrust);
			breads.add(cheese);
		}
		for (int i = 0; i < 5; i++){
			Bread thickcrust = new ThickcrustBread();
			Bread olive = new Olives(thickcrust);
			breads.add(olive);
		}

		for (int i = 0; i < 5; i++){
			Bread thickcrust = new ThickcrustBread();
			Bread cheese = new Cheese(thickcrust);
			Bread olive = new Olives(cheese);
			breads.add(olive);
		}
		for (int i = 0; i < 5; i++){
			Bread thincrust = new ThincrustBread();
			Bread cheese = new Cheese(thincrust);
			breads.add(cheese);
		}
		for (int i = 0; i < 5; i++){
			Bread thincrust = new ThincrustBread();
			Bread olive = new Olives(thincrust);
			breads.add(olive);
		}

		for (int i = 0; i < 5; i++){
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
			if (bread1.cost() == bread.cost()){
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
			System.out.print(bread.getDescription() + " ");
			System.out.println(bread.cost());
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
		List<Bread> temp = breads;
		Comparator<Bread> comparator = new Comparator<Bread>() {
			@Override
			public int compare(Bread o1, Bread o2) {
				return order? Double.compare(o1.cost(), o2.cost()): Double.compare(o2.cost(), o1.cost());
			}
		};
		Collections.sort(temp, comparator);
		return temp;
	}

	/**
	 * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
	 * nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
	 * nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
	 */
	public List<Bread> filter(int howMany, boolean order) {
		/* TODO */
		List<Bread> temp = sort(!order);
		List<Bread> filter = new LinkedList<>();
		int size = Math.min(howMany, temp.size());
		for (int i = 0; i < size; i++){
			filter.add(temp.get(i));
		}
		return filter;
	}

	public static void main(String[] args) {
		BreadStore breadStore = new BreadStore();
		breadStore.init();
		breadStore.print();

		/*
		* Sau khi khởi tạo số bánh mỳ cho cửa hàng, viết chương trình demo:
		* - Thêm một số bánh mỳ vào cửa hàng
		* - Bán một số bánh mỳ từ cửa hàng
		* - In ra số bánh mỳ còn lại theo thứ tự giá tăng dần.
		* - In ra nhiều nhất 10 cái bánh mỳ có giá thấp nhất còn trong cửa hàng.
		*/
		/* TODO */
	}
}
