package p1.designPattern.factory;

public class FactoryMain {
	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape shape1 = sf.getShape("CIRCLE");
		shape1.draw();
		Shape shape2 = sf.getShape("Square");
		shape2.draw();
		Shape shape3 = sf.getShape("RECTANGLE");
		shape3.draw();

	}

}
