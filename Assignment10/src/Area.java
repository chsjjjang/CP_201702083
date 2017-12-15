class Shape {
	 int width,height;
	public void Shape(int a, int b){
		width = a;
		height = b;
	}
	public void area(){
	}
}
class Rectangle extends Shape {
	public void area() {
		System.out.println("≥–¿Ã : "+width*height);;
	}
}
class Triangle extends Shape {
	public void area() {
		System.out.println("≥–¿Ã : "+0.5*width*height);;
	}
}
class Circle extends Shape {
	public void area() {
		System.out.println("≥–¿Ã : "+(0.5*width)*(0.5*width));;
	}
}
public class Area {
	private static Shape arrayOfShapes[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();
		areaAll();
	}
	public static void array(){
		arrayOfShapes = new Shape[3];
		arrayOfShapes[0] = new Rectangle();
		arrayOfShapes[1] = new Triangle();
		arrayOfShapes[2] = new Circle();
	}
	public static void areaAll(){
		for ( int  i = 0 ; i <arrayOfShapes.length;i++){
			arrayOfShapes[i].Shape(3, 6);
			arrayOfShapes[i].area();
		}
	}

}
