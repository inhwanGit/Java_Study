package org.example.클래스로더;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // a() 메소드를 가지고 있는 클래스가 있다.
        // 이 클래스이름이 아직 무엇인지 모르겠다.
        // 나중에 이 클래스 이름을 알려주겠다.
        // a()메소드를 실행할 수 있도록 코드를 작성하라.

        // className에 해당하는 클래스 정보를 CLASSPATH에서 읽어들이고,
        // 그 정보를 clazz가 참조하도록한다.
        //Object o = new Bus();
        String className ="";
        Class clazz = Class.forName(className);
//        Method[] declaredMethods = clazz.getDeclaredMethods();
//        for(Method m : declaredMethods){
//            System.out.println(m.getName());
//        }
        Object o = clazz.newInstance();

        Method m = clazz.getDeclaredMethod("a", null); // a()메소드 정보를 가지고 있는 Method를 반환하라
        m.invoke(o, null); // Object o가 참조하는 객체의 m 메소드를 실행하라.
    }
}
