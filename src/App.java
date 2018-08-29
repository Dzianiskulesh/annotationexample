import com.test.factory.ServiceFactory;
import com.test.service.CustomService1;
import com.test.service.CustomService2;

public class App {

    public static void main(String [] args){
        // Creating service one
        CustomService1 service1 = ServiceFactory.getService(CustomService1.class);
        Object result1 = service1.method1("5");
        Object result2 = service1.method2("555", "4444");

        System.out.println("-------------------------------");

        // Creating service two
        CustomService2 service2 = ServiceFactory.getService(CustomService2.class);
        Object result3 = service2.method3("myarg");
        Object resul4 = service2.method4("test", 6);
    }
}
