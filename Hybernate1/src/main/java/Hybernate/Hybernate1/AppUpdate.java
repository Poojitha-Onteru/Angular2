package Hybernate.Hybernate1;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class AppUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Project Started...!");
		Configuration cfg=new Configuration();
		cfg.configure("Hybernate.cfg.xml");
		SessionFactory fac=cfg.buildSessionFactory();
		Session session=fac.openSession();
		Transaction tx=session.beginTransaction();
		Student s1=(Student)session.get(Student.class, 102);
		s1.setName("Pooji");
		session.save(s1);
		tx.commit();
		fac.close();
		System.out.println("Done...!");

	}

}
