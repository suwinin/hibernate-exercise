package core.listener;

import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.ServletContextEvent;

import static core.util.HibernateUtil.*;

@WebListener
public class HibernateListener implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
         getSessionFactory(); // 可以將這個方法請求賦值給一個變數，或者直接作爲語句
	}
	
	@Override
	public void contextDestroyed (ServletContextEvent sce) {
		shutdown();
	}
}
