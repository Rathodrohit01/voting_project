package Com.Tka.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Com.Tka.Entity.Address;
import Com.Tka.Entity.Person;
import Com.Tka.Entity.VotingCard;

public class utility {

	public static Session session() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Person.class);
		cfg.addAnnotatedClass(VotingCard.class);
		cfg.addAnnotatedClass(Address.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		return session;
	}

}
