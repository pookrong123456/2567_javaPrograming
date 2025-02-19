public class ResizableCircle extends Circle implements Resizable {
	
	ResizableCircle(double radius){
		super(radius);				
	}
	
	@Override
	public void resize(int percent) {
		radius *= percent / 100.0;		
	}
	public String toString() {
		return "ResizebleCircle" + super.toString() + "j";
	}
	
	
		
}