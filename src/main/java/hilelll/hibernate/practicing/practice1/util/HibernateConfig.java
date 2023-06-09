package hilelll.hibernate.practicing.practice1.util;

import hilelll.hibernate.practicing.practice1.model.Apprentice;
import hilelll.hibernate.practicing.practice1.model.Sport;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();//for hibernate.cfg.xml

                configuration.addAnnotatedClass(Apprentice.class);
                configuration.addAnnotatedClass(Sport.class);

                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.out.println("Session factory Error: " + e);
            }
        }
        return sessionFactory;
    }
}