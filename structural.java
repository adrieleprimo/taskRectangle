package entities;

public class structural {
	public double width;
	public double height;
	
	
	public  double Area() {
		return width * height;
		
	}
	public double Perimeter () {
		return 2*(width + height);
	}
	public double Diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f", Area()) + "\n" + "PERIMETER = " + String.format("%.2f", Perimeter()) + "\n" + "DIAGONAL = " + String.format("%.2f", Diagonal());
	}
}
