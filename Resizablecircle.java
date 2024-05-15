package net.codejava;
interface Resizable{
	void resize(int radius);
}
class Circle implements Resizable {
 double radius;
 Circle(double radius){
	 this.radius = radius;
 }
	@Override
	public void resize(int radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
}
public class Resizablecircle {
	public static void main(String[] args) {
		Circle c1 = new Circle(20);
		System.out.println("Original circle radius = "+ c1.getRadius());
		Circle c2 = new Circle(50);
		System.out.println("Resized circle radius = "+ c2.getRadius());
}
}
