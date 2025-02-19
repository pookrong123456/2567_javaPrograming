public class Drink {
	 protected int type;
	 protected char size;
	 public Drink(int type, char size) {
	     this.type = type;
	     this.size = size;
	 }
	 public Drink() {
		 this.type = 0;
		 this.size = ' ';
		
	 }
	 public String getTypeName() {
		 if (type == 1) {
		        return "Hot";
		    } else if (type == 2) {
		        return "Cold";
		    }else return null;
	 }
	 public int getTypePrice()  {
		 if (type == 1) {
		        return 10;
		    } else if (type == 2) {
		        return 20;
		    }else return 0;
	 }
	 
	 public String getSizeName() {
	     if (size == 'S' || size == 's') {
	         return "Small";
	     } else if (size == 'M' || size == 'm') {
	         return "Medium";
	     } else if (size == 'L' || size == 'l') {
	         return "Large";
	     } else return null;
		
	 }
	 public int getSizePrice() {
		 if (size == 'S' || size == 's') {
	         return 15;
	     } else if (size == 'M' || size == 'm') {
	         return 20;
	     } else if (size == 'L' || size == 'l') {
	         return 25;
	     } else return 0;
		 
	 }
	 public String getTotalPrice() {
		 return getSizePrice() + getTypeName() ;
		 
	 }
	 
	 
}
