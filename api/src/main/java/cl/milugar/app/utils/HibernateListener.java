package cl.milugar.app.utils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HibernateListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {
        HibernateLauncher.getSessionFactory();
    }

    public void contextDestroyed(ServletContextEvent event) {
        HibernateLauncher.getSessionFactory().close();
    }

}
