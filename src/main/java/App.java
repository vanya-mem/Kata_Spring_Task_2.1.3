import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld helloWorldBean2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");

        System.out.printf("Равны ли по ссылке бины helloworld? %s\n", (bean == helloWorldBean2));
        System.out.printf("Равны ли по ссылке бины cat? %s", (catBean1 == catBean2));
    }
}