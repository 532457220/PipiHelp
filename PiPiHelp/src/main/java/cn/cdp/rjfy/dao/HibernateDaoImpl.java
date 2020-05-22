package cn.cdp.rjfy.dao;

import cn.cdp.rjfy.entity.Admin;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateDaoImpl implements Dao {

    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }

    public Admin getAdmin(String account, String password) {
        final Session session = getSession();
        Admin admin = new Admin();
        try {
            Query query=session.createQuery("from Admin a where a.account=:account and a.password=:password");
            query.setParameter("account",account);
            query.setParameter("password",password);
            admin= (Admin) query.uniqueResult();
        }finally {
            session.close();
        }
        return admin;
    }
}
