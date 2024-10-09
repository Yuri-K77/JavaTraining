package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;




public class CustomAnnotations {

    public static void method_1() {
        System.out.println("1");
    }

    @Testable
    public static void method_2() {
        System.out.println("2");
    }

    public static void method_3() {
        System.out.println("3");
    }

    @Testable
    public static void method_4() {
        System.out.println("4");
    }

    public static void runAllAnnotatedMethods() throws InvocationTargetException, IllegalAccessException {
        Method[] methods = CustomAnnotations.class.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Testable.class)) {
                method.invoke(Testable.class);
            }
        }
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        runAllAnnotatedMethods();
    }
}