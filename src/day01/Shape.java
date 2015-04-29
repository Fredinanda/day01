package day01;

public class Shape {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(4);
		point1.setY(5);
		
		Point point2 = new Point();
		point2.setX(10);
		point2.setY(30);
		
		Point point3 = new Point(50, 50);
	
		
		
		point1.show();
		point2.show();
		point3.show(true);
		point3.show(false);
	}

}
