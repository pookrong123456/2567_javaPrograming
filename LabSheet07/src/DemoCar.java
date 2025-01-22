import java.util.Scanner;

public class DemoCar {

	public static void main(String[] args) {
		
		Car car = new Car("Chevrolet", "Cruze", 2009, 150000.0);
		
		System.out.println("Company Name: "+car.getCompanyName());
		System.out.println("Model Name: "+car.getmodelName());
		System.out.println("Year: " + car.getyear());
		System.out.println("mileage : " + car.getmileage());
		Spacing();
 
        Car car1 = new Car("Toyota", "gun", 2015, 150000.0);
        System.out.println("Updated Car Details:");
        System.out.println("Company Name: " +car.getCompanyName());
      
        System.out.println("Model Name: "+car.getmodelName());
        
        System.out.println("Year: "+ car.getyear());
        
		
        car1.setcompanyName(null);
        car1.setYear(1885);


	}
	public static void Spacing() {
		System.out.println();
	}

}
