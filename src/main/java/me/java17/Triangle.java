package me.java17;

public class Triangle implements Shape{

	double base;
	double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double caculateArea() {
		return (base * height) / 2;
	}
}
