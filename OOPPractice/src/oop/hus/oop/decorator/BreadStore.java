package oop.hus.oop.decorator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BreadStore {
	private List<Bread> breads;

	public BreadStore() {
		/* TODO */
		this.breads = new LinkedList<Bread>();
	}

	public void init() {
		Random random = new Random();
		int num = random.nextInt(5,11);
		System.out.println(num);

		for (int i = 0; i < num; i++){
			Bread thick = new ThickcrustBread();
			Bread cheese = new Cheese(thick);
			breads.add(cheese);
		}
		for (int i = 0; i < num; i++){
			Bread thick = new ThickcrustBread();
			Bread olive = new Olives(thick);
			breads.add(olive);
		}

		for (int i = 0; i < num; i++){
			Bread thick = new ThickcrustBread();
			Bread cheese = new Cheese(thick);
			Bread olive = new Olives(cheese);
			breads.add(olive);
		}

		for (int i = 0; i < num; i++){
			Bread thick = new ThickcrustBread();
			Bread olive = new Olives(thick);
			Bread cheese = new Cheese(olive);
			breads.add(cheese);
		}

		for (int i = 0; i < num; i++){
			Bread thin = new ThincrustBread();
			Bread cheese = new Cheese(thin);
			breads.add(cheese);
		}
		for (int i = 0; i < num; i++){
			Bread thin = new ThincrustBread();
			Bread olive = new Olives(thin);
			breads.add(olive);
		}

		for (int i = 0; i < num; i++){
			Bread thin = new ThincrustBread();
			Bread cheese = new Cheese(thin);
			Bread olive = new Olives(cheese);
			breads.add(olive);
		}

		for (int i = 0; i < num; i++){
			Bread thin = new ThincrustBread();
			Bread olive = new Olives(thin);
			Bread cheese = new Cheese(olive);
			breads.add(cheese);
		}


	    /* TODO
		Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [5, 10], gọi là n.
		Khởi tạo ban đầu cửa hàng có:
	    n bánh mỳ ThickcrustBread chỉ có cheese,
	    n bánh mỳ ThickcrustBread chỉ có olives,
	    n bánh mỳ ThickcrustBread có cheese và sau đó thêm olives,
	    n bánh mỳ ThickcrustBread có olives và sau đó thêm cheese,

	    n bánh mỳ ThincrustBread chỉ có cheese,
	    n bánh mỳ ThincrustBread chỉ có olives,
	    n bánh mỳ ThincrustBread có cheese và sau đó thêm olives,
	    n bánh mỳ ThincrustBread có olives và sau đó thêm cheese.
		*/

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
	 * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên theo yêu cầu
	 *  của khác hàng (ví dụ, ThickcrustBread + Cheese + Olives)
	 * Nếu còn bánh mỳ để bán thì trả về giá trị true,
	 *  nếu không còn trả về giá trị false.
	 */
	public boolean sell(String bread) {
		/* TODO */
		for (Bread bread1: breads){
			if (bread1.getDescription().equals(bread)){
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
		for (int i = 0; i < breads.size(); i++){
			System.out.println(breads.get(i));
		}
	}

	/**
	 * Trả ra các bánh mỳ còn lại trong cửa hàng được sắp xếp theo giá, thứ tự được cho bởi order,
	 *  nếu order là true, sắp xếp theo thứ tự tăng dần,
	 *  nếu order là false, sắp xếp theo thứ tự giảm dần.
	 * Chú ý: việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
	 */
	public List<Bread> sort(boolean order) {
		/* TODO */
		List<Bread> temp = new LinkedList<>(breads);
		Comparator<Bread> comparator = new Comparator<Bread>() {
			@Override
			public int compare(Bread o1, Bread o2) {
				return order? Double.compare(o1.cost(), o2.cost()):Double.compare(o2.cost(), o1.cost());
			}
		};
		Collections.sort(temp, comparator);
		return temp;
	}

	/**
	 * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
	 *  nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
	 *  nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
	 */
	public List<Bread> filter(int howMany, boolean order) {
		/* TODO */
		List<Bread> temp = sort(!order);
		List<Bread> filter = new LinkedList<>();
		int min = Math.min(howMany, temp.size());
		for (int i = 0; i < min; i++){
			filter.add(temp.get(i));
		}
		return filter;
	}

	public void printList(List<Bread> breads){
		for (int i = 0; i < breads.size(); i++){
			System.out.println(breads.get(i).getDescription() + ", Cost " + breads.get(i).cost());
		}
	}

	public static void main(String args[]) {
		/* TODO

		 Tạo ra một cửa hàng bánh mỳ, với số bánh mỳ ban đầu được khởi tạo qua phương thức init(),

		 Viết demo các chức năng:
		   - Bán 5 cái bánh mỳ từ cửa hàng
		   - Mỗi lần bán,
		       + in ra những bánh mỳ còn lại trong cửa hàng (theo định dạng: thông tin mỗi bánh mỳ là description + giá,
		         ví dụ, ThickcrustBread + Cheese, Cost 31.0; mỗi bánh mỳ in ra trên một dòng).
		       + in ra số bánh mỳ còn lại theo thứ tự giá giảm dần (theo định dạng như trên).
		   - In ra nhiều nhất 10 cái bánh mỳ có giá cao nhất còn lại trong cửa hàng (theo định dạng như trên)


		 - Hoàn thiện chương trình và thực hiện các chức năng demo, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_BreadStore>.txt (Ví dụ, NguyenVanA_123456_BreadStore.txt).
         - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BreadStore>.zip (Ví dụ, NguyenVanA_123456_BreadStore.zip),
          nộp lên classroom.
		 */
		BreadStore breadStore = new BreadStore();
		breadStore.init();
		Bread thick = new ThickcrustBread();
		Bread cheese = new Cheese(thick);
		breadStore.add(cheese);
		for (int i = 0; i < 5; i++){
			breadStore.sell(cheese.getDescription());
			breadStore.printList(breadStore.breads);
			System.out.println();
			List<Bread> sorted = breadStore.sort(false);
			breadStore.printList(sorted);
			System.out.println();
		}
		System.out.println();
		List<Bread> fil = breadStore.filter(10, true);
		breadStore.printList(fil);
	}
}
