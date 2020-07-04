package HW7;

import java.lang.reflect.*;

public class HW7 {

    public static void main(String[] args) {
        start("HW7.Tester");
        start(Tester.class);
    }

    private static void start(String className) {
        try {
            Class class1 = Class.forName(className);
            start(class1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void start(Class classObject) {
        Method[] methods = classObject.getDeclaredMethods();
        try {
            int count1 = 0;
            for (Method method : methods) {
                if (method.getAnnotation(BeforeSuite.class) != null) {
                    if (count1 == 1) throw new TestException();
                    System.out.println(method);
                    count1++;
                }
            }
            for (int i = 1; i < 11; i++) {
                for (Method method : methods) {
                    if (method.getAnnotation(Test.class) != null) {
                        Test test =
                                method.getAnnotation(Test.class);
                        if (test.value() == i) {
                            System.out.println(method);
                            System.out.println("value: " + test.value());
                        }
                    }
                }
            }
            int count2 = 0;
            for (Method method : methods) {
                if (method.getAnnotation(AfterSuite.class) != null) {
                    if (count2 == 1) throw new TestException();
                    System.out.println(method);
                    count2++;
                }
            }
        } catch (TestException e) {
            e.printStackTrace();
        }
    }
}