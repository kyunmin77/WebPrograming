package com.hexagon;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Round18_04_Listener implements ServletContextListener, ServletContextAttributeListener {
	
	@Override
	public void contextInitialized(ServletContextEvent e) {
		System.out.println("ServletContext가 초기화 되었습니다.");
		System.out.println("init context = " + e.getServletContext());
	}
	@Override
	public void contextDestroyed(ServletContextEvent e) {
		System.out.println("ServletContext가 소멸 되었습니다.");
		System.out.println("dest context" + e.getServletContext());
	}
	@Override
	public void attributeAdded(ServletContextAttributeEvent e) {
		System.out.println("Context 영역에 값이 추가 되었습니다.");
		System.out.println("added = " + e.getName() + " : " + e.getValue());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent e) {
		System.out.println("Context 영역에 값이 삭제 되었습니다.");
		System.out.println("removed = " + e.getName() + " : " + e.getValue());
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent e) {
		System.out.println("Context 영역에 값이 변경 되었습니다.");
		System.out.println("replaced = " + e.getName() + " : " + e.getValue());
	}

}
