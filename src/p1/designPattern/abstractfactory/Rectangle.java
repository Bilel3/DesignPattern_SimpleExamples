package p1.designPattern.abstractfactory;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside RoundedRectangle::draw() method.");
	}
}