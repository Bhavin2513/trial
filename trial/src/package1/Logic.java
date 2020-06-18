package package1;

public class Logic {
	
	protected static double  rectangleArea(double length, double width) {
		double area = length*width;
		return area;
	}
	public static double  rectanglePerimeter(double length, double width) {
		double area = 2*(length+width);
		return area;
	}
	public static double circleArea(double radius) {
		double area = 3.14*radius*radius;
		return area;
	}
	public static double circleCircumference(double radius) {
		double circumference = 2*3.14*radius;
		return circumference;
	}
	public static double rightTriangleArea(double base, double height) {
		double area = 0.5*base*height;
		return area;
	}
	public static double rightTrianglePerimeter(double base, double height) {
		double hypo=Math.sqrt((base*base)+(height*height));
		double perimeter= base+height+hypo;
		return perimeter;
	}
	public static double boxVolume(double length, double width, double depth) {
		double volume = length*width*depth;
		return volume;
	}
	public static double boxSurfaceArea(double length, double width,double depth) {
		double area = 2*(depth*length)+2*(depth*width)+2*(width*length);
		return area;
	}
	public static double sphereVolume(double radius) {
		double volume = 1.3333*3.14*radius*radius*radius;
		return volume;
	}
	public static double sphereSurfaceArea(double radius) {
		double area = 4*3.14*radius*radius;
		return area;
	}


	
	public static void main(String[] args) { 
		
		System.out.println("Area of Rectangle = "+rectangleArea(5,4));
		System.out.println("Perimeter of Rectangle = "+rectanglePerimeter(5,4));
		System.out.println("Area of circle = "+circleArea(5));
		System.out.println("Circumference of Circle = "+circleCircumference(5));
		System.out.println("Area of Right angle Triangle = "+rightTriangleArea(5, 4));
		System.out.println("Perimeter of Right angle Triangle = "+rightTrianglePerimeter(5, 4));
		System.out.println("Volume of Box = "+boxVolume(5, 4, 5));
		System.out.println("Surface Area of Box = "+boxSurfaceArea(5, 4, 5));
		System.out.println("Volume of Sphere = "+sphereVolume(5));
		System.out.println("Surface area of Sphere = "+sphereSurfaceArea(5));


	}
}
