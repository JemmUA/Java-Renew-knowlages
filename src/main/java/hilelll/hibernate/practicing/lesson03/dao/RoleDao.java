package hilelll.hibernate.practicing.lesson03.dao;

import hilelll.hibernate.practicing.lesson03.model.Role;
import hilelll.hibernate.practicing.lesson03.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RoleDao {
    public void save(Role role) {

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(role);

        transaction.commit();
        session.close();
    }
}
