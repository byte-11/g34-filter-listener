package uz.pdp.g34initparamslistenersfilter.listeners;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ApplicationRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        String requestId = sre.getServletRequest().getRequestId();
//        System.out.println("REQUEST DESTROYED ID [%s]".formatted(requestId));
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        String requestId = sre.getServletRequest().getRequestId();
//        System.out.println("REQUEST INITIALIZED ID [%s]".formatted(requestId));
    }
}
