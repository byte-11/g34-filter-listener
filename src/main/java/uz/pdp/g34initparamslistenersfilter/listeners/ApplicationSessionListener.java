package uz.pdp.g34initparamslistenersfilter.listeners;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

//@WebListener
public class ApplicationSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        session.setMaxInactiveInterval(30);
        String id = session.getId();
//        System.out.println("SESSION CREATED ID [%s]".formatted(id));
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        String id = se.getSession().getId();
//        System.out.println("SESSION DESTROYED ID [%s]".formatted(id));
    }
}
