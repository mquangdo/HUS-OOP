package CarMana;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class CarManagement {
	
	// Hàm dựng 
	public CarManagement(){
		super();
	}
	
	// Phương thức readData() cho phép đọc dữ liệu từ tệp văn bản
	/*
	    Thứ tự nhập như sau:
	    - Nhập số lượng xe
	    - Trong vòng lặp với mỗi loại xe:
	       - Nhập 1 số nguyên c, c = 0 là ServiceCar, c = 1 là SportCar
	       - Nhập thông tin của các xe: id, name, manufacturer, hours, price, fee (Đối với ServiceCar, tax với SportCar)
	*/
	
	public ArrayList<Car> readData(String fileName) {
	    
	    
	Scanner sc;
		try {
			sc = new Scanner(new File(fileName));
			int n;
			n = Integer.parseInt(sc.nextLine());
			ArrayList<Car> cars = new ArrayList<Car>();
			
			String id, name, manufacturer;
			double hours;
			double price;
			double fee, tax;
			for (int i = 0; i < n;i++)
			{
				int c;
				c = Integer.parseInt(sc.nextLine());
				id = sc.nextLine();
				name = sc.nextLine();
				manufacturer = sc.nextLine();
				hours = Double.parseDouble(sc.nextLine());
				price = Double.parseDouble(sc.nextLine());
				if (c==0)
				{
					fee = Double.parseDouble(sc.nextLine());
					ServiceCar srCar = new ServiceCar(id, name, manufacturer, hours, price, fee);
					cars.add(srCar);
				}else
				{
					tax = Double.parseDouble(sc.nextLine());
					SportCar spCar = new SportCar(id, name, manufacturer, hours, price, tax);
					cars.add(spCar);
				}
			}
			sc.close();
			return cars;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
			
	}
	
	// Phương thức in danh sách thông tin liên quan các loại xe trong mảng
	public void printCars(ArrayList<Car> cars) {
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i).toString());
		}
	}
	
	// Phương thức xuất ra danh sách những xe có tên nhà sản xuất là "manuName"
	public ArrayList<Car> findCars(ArrayList<Car> cars, String manuName){
	    
	    ArrayList<Car> findcars = new ArrayList<>();
	    for(int i=0;i<cars.size();i++){
	        if(cars.get(i).getManufacturer().equals(manuName)){
	            findcars.add(cars.get(i));
	        }
	    }
	
		return findcars;
	}
	
	// Phương thức xuất ra danh sách những xe giá thành tiền (amount) cao nhất thuộc loại typeOfCars
	
	public ArrayList<Car> getMaxAmount(ArrayList<Car> cars, String typeOfCars){
	    ArrayList<Car> type = new ArrayList<>();
	    double max=0;
	    for(int i=0;i<cars.size();i++){
	        if(cars.get(i).getClass().getName().equals(typeOfCars)){
	       
	            type.add(cars.get(i));
	        }
	    }
		
		
		
		for(int i=0;i<type.size();i++){
		    if(type.get(i).getAmount()>max){
		        max=type.get(i).getAmount();
		    }
		}
		
		ArrayList<Car> maxAmount = new ArrayList<>();
		for(int i=0;i<type.size();i++){
		    if(type.get(i).getAmount()==max){
		        maxAmount.add(type.get(i));
		    }
		    
		}
		return maxAmount;
		
		
	}
	
	// Phướng thức sắp xếp giá thành tiền các loại xe theo thứ tự giảm dần
	public void sortByAmount(ArrayList<Car> cars){
		//Begin editable part
		for(int i=0;i<cars.size();i++){
		    for(int j=i+1;j<cars.size();j++){
		        if(cars.get(i).getAmount()<cars.get(j).getAmount()){
		            Car temp=cars.get(j);
		            cars.set(j,cars.get(i));
		            cars.set(i,temp);
		        }
		    }
		}
			
	}

// Hàm main 
		public static void main(String[] args) {
			CarManagement carManag = new CarManagement();
			ArrayList<Car> cars = carManag.readData("D:\\Users\\Asus\\IntellijProjects\\OOP\\src\\CarMana\\data.txt");
		//	carManag.printCars(cars);
			
			for (int i = 0; i < cars.size(); i++) {
				System.out.print(cars.get(i).getAmount() + " ");
			}
			System.out.println();
			ArrayList<Car> carsList = carManag.findCars(cars,"honda");
			carManag.printCars(carsList);
			
			ArrayList<Car> carsList1 = carManag.getMaxAmount(cars, "SportCar");
			carManag.printCars(carsList1);
			
			carManag.sortByAmount(cars);
			carManag.printCars(cars);
			
		}
	}
