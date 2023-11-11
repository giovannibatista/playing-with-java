package me.java17;

public class Main {

	public static void main(String[] args) {
		System.out.println(formatterPatternSwitch(1));
		System.out.println(formatterPatternSwitch(1L));
		System.out.println(formatterPatternSwitch(1.0));
		System.out.println(formatterPatternSwitch("Oi"));

		testTriangle(new Triangle(100.0, 150.0));
		testTriangle(new Triangle(10.0, 15.0));

		testTriangle(null);

	}


	// JEP 406: Pattern Matching for switch
	static String formatterPatternSwitch(Object o) {
		return switch (o) {
			case Integer i -> "int %d".formatted(i);
			case Long l -> "long %d".formatted(l);
			case Double d -> "double %f".formatted(d);
			case String s -> "string %s".formatted(s);
			default -> o.toString();
		};
	}

	// JEP 406: Guarded Pattern
	static void testTriangle(Shape s) {
		switch (s) {
			case null -> System.out.println("Opss!");
			case Triangle t && (t.caculateArea() > 100.0) -> System.out.println("Large triangle");
			default -> System.out.println("A shape, possible a small triangle");
		}
	}


}
