package uz.pdp.g34initparamslistenersfilter.listeners;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ApplicationContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
//        System.out.println(":::::::::::::::::APPLICATION STARTED::::::::::::::::::::::::");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
//        System.out.println(":::::::::::::::::APPLICATION DESTROYED::::::::::::::::::::::");
    }
}
