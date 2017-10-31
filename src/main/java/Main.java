import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/config.xml");
//        we can get our object by beanId;
//        OurClass ourClass = (OurClass) applicationContext.getBean("OurClassId");
//        but it is better do it by interface
        OurClass ourClass = (OurClass) applicationContext.getBean(OurInterface.class);
        ourClass.helloSpring();
        ourClass.shalomSpring();
    }
}
