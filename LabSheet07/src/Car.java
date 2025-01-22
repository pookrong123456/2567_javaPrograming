
public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;

	Car(){
		/*companyName = "Unknow";
		modelName = "Unknow";
		year = 2000;
		mileage = 0.0;*/
		this("Unknow","Unknow",2000,0.0);
	}
	Car(String companyName,String modelName,int year,double mileage){
		
		this.companyName = companyName;
		this.modelName = modelName;
		this.year = year < 1886? 2000:year;
		this.mileage = mileage;
		
		
	}
	public void setcompanyName(String companyName) {
		if(companyName != null && !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		}else {
			System.out.println("Error: Invalid company name");
		}
		
		
	}
   public void setModelName(String modelName) {
	   if(modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
		}else {
			System.out.println("Error: Invalid model name");
		}
   }
   public void setYear(int year) {
	   if(year<1886) {
		   System.out.println("Error: Invalid year");
		   
		}else {
			this.year=year;
		}
   }
   public String getCompanyName() {
		return companyName;
	}
   public String getmodelName() {
		return modelName;
	}
   public int getyear() {
		return year;
	}
   public double getmileage() {
		return mileage;
	}
	
}

