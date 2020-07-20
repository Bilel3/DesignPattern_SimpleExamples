package p1.designPattern.factory;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside RoundedRectangle::draw() method.");
	}
}