package com.spring.chap02;

// AnnotationConfigApplicationContext 클래스는 자바 Configuration에서 정보를 읽어와 Bean 객체를 생성하고 관리한다.
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

		public static void main(String[] args) {
			
			// AnnotationConfigApplicationContext 객체를 생성할 때 앞서 작성한 AppContext 클래스를 생성자 파라미터로 전달한다.
			// AnnotationConfigApplicationContext는 AppContext에 정의한 @Bean 설정 정보를 읽어와 Greeter 객체를 생성하고 초기화한다.
			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
			
			// getBean() 메서드는 AnnotationConfigApplicationContext가 자바 Configuration을 읽어와 생성한 Bean 객체를 검색할 때 사용된다. 
			// getBean() 메서드의 첫 번째 파라미터는 @Bean 애노테이션의 메서드 이름인 Bean 객체의 이름이며,
			// 두 번째 파라미터는 검색할 Bean 객체의 타입이다.
			// 앞서 작성한 자바 설정(AppContext)를 보면 @Bean 객체의 이름이 "greeter"이고 생성한 객체의 리턴 타입이 Greeter이므로
			// getBean() 메서드는 greeter() 메서드가 생성한 Greeter 객체를 리턴한다.
			Greeter g = ctx.getBean("greeter", Greeter.class);
			String msg = g.greet("스프링");
			System.out.println(msg);
			ctx.close();
		}
	
}
