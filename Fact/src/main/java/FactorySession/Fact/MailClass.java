package FactorySession.Fact;
import java.util.*;
public class MailClass {
	public static void main(String args[]) {
		GetShapeFactory fac=new GetShapeFactory();
		Scanner sca=new Scanner(System.in);
		String type=sca.nextLine();
		Shape s=fac.getshape(type);
		s.draw();
		sca.close();
	}

}
