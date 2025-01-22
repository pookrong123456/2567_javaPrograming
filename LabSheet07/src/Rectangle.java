
public class Rectangle {
	private float length = 1.0f;
	private float Width = 1.0f;

	Rectangle(){}
	
	
	Rectangle(float length,float width){
		this.length = length;
	}
	public float getLegth() {
		return this.length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return this.Width;
	}
	public void setWidth(float Width) {
		this.Width = Width;
	}
	public double getArea() {
		return this.length * this.Width;
	}
	public double getPerimeter() {
		return 2*(this.length * this.Width);
	}
	public String showData() {
		return "Rectangle[length= "+ this.length + ",width ="+this.Width+"]";
	}
	public String toString() {
		return "Rectangle[length= "+ this.length + ",width ="+this.Width+"]";
	}
	//Method to display us
	
	
	
	
	
	
	
	
	
	
	
}
