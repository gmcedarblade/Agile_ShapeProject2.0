package edu.cvtc.shapes;

/**
 * @author gcedarblade
 *
 */
public class ShapeFactory {
	
	public Dialog dialog = null;

	public ShapeFactory(Dialog messageBox) {
		this.dialog = messageBox;
	}
	
	public Shape cuboidBuilder(float width, float height, float depth, Dialog dialog) {
		return new Cuboid(12, 10, 50, null);
		
	}
	
	public Shape sphereBuilder(float radius, Dialog dialog) {
		return new Sphere(14, null);
	}
	
	public Shape cylinderBuilder(float radius, float height, Dialog dialog) {
		return new Cylinder(24, 35, null);
	}

}
