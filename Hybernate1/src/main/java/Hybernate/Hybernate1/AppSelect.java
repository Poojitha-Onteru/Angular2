package Hybernate.Hybernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("project started...");
		Configuration cfg=new Configuration();
		cfg.configure("Hybernate.cfg.xml");
		SessionFactory fac=cfg.buildSessionFactory();
		Session session=fac.openSession();
		Student s1=(Student)session.get(Student.class, 101);
		System.out.println(s1);
		System.out.println("Fetching object using load:");
		Student s2=(Student)session.load(Student.class,101);
		System.out.println(s2);

	}

}
