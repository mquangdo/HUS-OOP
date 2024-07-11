package midterm.year2324.decorator;



import java.util.ArrayList;
import java.util.List;

public class BreadStore {
	private List<Bread> breads;

	public BreadStore() {
		/* TODO */
		breads = new ArrayList<>();
	}

	public void init() {
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

		int max = 10;
		int min = 5;
		int num = (int) (Math.random() * (max - min + 1) + min);

		for (int i = 0; i < num; i++){
			Bread bread = new ThickcrustBread();
			Bread cheese = new Cheese(bread);
			breads.add(cheese);
		}
		for (int i = 0; i < num; i++){
			Bread bread = new ThickcrustBread();
			Bread olive = new Olives(bread);
			breads.add(olive);
		}
		for (int i = 0; i < num; i++){
			Bread bread = new ThickcrustBread();
			Bread cheese = new Cheese(bread);
			Bread olive = new Olives(cheese);
			breads.add(olive);
		}
		for (int i = 0; i < num; i++){
			Bread bread = new ThickcrustBread();
			Bread olive = new Olives(bread);
			Bread cheese = new Cheese(olive);
			breads.add(cheese);
		}


		for (int i = 0; i < num; i++){
			Bread bread = new ThincrustBread();
			Bread cheese = new Cheese(bread);
			breads.add(cheese);
		}
		for (int i = 0; i < num; i++){
			Bread bread = new ThincrustBread();
			Bread olive = new Olives(bread);
			breads.add(olive);
		}
		for (int i = 0; i < num; i++){
			Bread bread = new ThincrustBread();
			Bread cheese = new Cheese(bread);
			Bread olive = new Olives(cheese);
			breads.add(olive);
		}
		for (int i = 0; i < num; i++){
			Bread bread = new ThincrustBread();
			Bread olive = new Olives(bread);
			Bread cheese = new Cheese(olive);
			breads.add(cheese);
		}

		System.out.println("Random value is: " + num);
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
		for (int i = 0; i < breads.size(); i++){
			if (breads.get(i).getDescription().equals(bread)){
				breads.remove(i);
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
			System.out.println(breads.get(i).getDescription() + ", Cost " + breads.get(i).cost());
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
		List<Bread> res = new ArrayList<>(breads);
		for (int i = 0; i < res.size() - 1; i++){
			for (int j = i + 1; j < res.size(); j++){
				if (order? res.get(i).cost() > res.get(j).cost() : res.get(i).cost() < res.get(j).cost()){
					Bread temp = res.get(i);
					res.set(i, res.get(j));
					res.set(j, temp);
				}
			}
		}
		return res;
	}

	public void printList(List<Bread> list){
		for (int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).getDescription() + ", Cost " + list.get(i).cost());
		}
	}

	/**
	 * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
	 *  nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
	 *  nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
	 */
	public List<Bread> filter(int howMany, boolean order) {
		/* TODO */
		List<Bread> temp = sort(!order);
		List<Bread> res = new ArrayList<>();
		for (int i = 0; i < howMany; i++){
			res.add(temp.get(i));
		}
		return res;
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
		System.out.println("\nThe original breads list:");
		breadStore.print();

		Bread bread = new ThickcrustBread();
		Bread cheese = new Cheese(bread);
		Bread olive = new Olives(cheese);

		System.out.println("\nTest sell 5 breads:");
		System.out.println("Breadstore sells this bread: " + olive.getDescription());
		System.out.println();
		for (int i = 0; i < 5; i++){
			breadStore.sell(olive.getDescription());
			System.out.println("\nBread list after sell " + (i + 1) + " breads:");
			breadStore.print();
			System.out.println("\nPrint decreasing cost: ");
			breadStore.printList(breadStore.sort(false));

		}

		System.out.println("\nTop 10 highest cost: ");
		breadStore.printList(breadStore.filter(10, true));
	}
}
