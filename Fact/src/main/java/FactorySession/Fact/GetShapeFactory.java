package FactorySession.Fact;

public class GetShapeFactory {
	public Shape getshape(String shapetype) {
		if(shapetype==null) 
			return null;
		if(shapetype.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		else if(shapetype.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		return null;
	}

}
