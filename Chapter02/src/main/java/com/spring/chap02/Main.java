package com.spring.chap02;

// AnnotationConfigApplicationContext Ŭ������ �ڹ� Configuration���� ������ �о�� Bean ��ü�� �����ϰ� �����Ѵ�.
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

		public static void main(String[] args) {
			
			// AnnotationConfigApplicationContext ��ü�� ������ �� �ռ� �ۼ��� AppContext Ŭ������ ������ �Ķ���ͷ� �����Ѵ�.
			// AnnotationConfigApplicationContext�� AppContext�� ������ @Bean ���� ������ �о�� Greeter ��ü�� �����ϰ� �ʱ�ȭ�Ѵ�.
			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
			
			// getBean() �޼���� AnnotationConfigApplicationContext�� �ڹ� Configuration�� �о�� ������ Bean ��ü�� �˻��� �� ���ȴ�. 
			// getBean() �޼����� ù ��° �Ķ���ʹ� @Bean �ֳ����̼��� �޼��� �̸��� Bean ��ü�� �̸��̸�,
			// �� ��° �Ķ���ʹ� �˻��� Bean ��ü�� Ÿ���̴�.
			// �ռ� �ۼ��� �ڹ� ����(AppContext)�� ���� @Bean ��ü�� �̸��� "greeter"�̰� ������ ��ü�� ���� Ÿ���� Greeter�̹Ƿ�
			// getBean() �޼���� greeter() �޼��尡 ������ Greeter ��ü�� �����Ѵ�.
			Greeter g = ctx.getBean("greeter", Greeter.class);
			String msg = g.greet("������");
			System.out.println(msg);
			ctx.close();
		}
	
}
