package Hybernate.Hybernate1;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class AppInsert {
	public static void main(String args[]) {
		System.out.println("project started...");
		Configuration cfg=new Configuration();
		cfg.configure("Hybernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Student st=new Student();
		st.setId(101);
		st.setName("Jaya");
		st.setCity("Hyderabad");
		
		
		System.out.println(st);
		
		st.setId(102);
		st.setName("lila");
		st.setCity("Banglore");
		session.save(st);
		tx.commit();
		
		st.setId(103);
		st.setName("Sai");
		st.setCity("Chennai");
		session.save(st);
		tx.commit();
		
		st.setId(104);
		st.setName("sathvi");
		st.setCity("Banglore");
		session.save(st);
		tx.commit();
		factory.close();
		
	}
}
