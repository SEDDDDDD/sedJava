package javabook2.ch11.sec06;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javabook2.ch08.sec02.RemoteControl;

public class ReflectionExample {

	public static void main(String[] args) {
		try {
			//리플렉션 : 클래스의 필드, 생성자, 메소드 정보 얻는것
			Class clazz = Class.forName("javabook2.ch07.sec07.car.Car");
			
//			선언된 생성자 얻기
			Constructor[] constructors = clazz.getDeclaredConstructors();
//			선언된 메소드 얻기
			Method[] methods = clazz.getDeclaredMethods();
//			선언된 필드 얻기
			Field[] fields = clazz.getDeclaredFields();
			for(int i=0; i<constructors.length; i++) {
				System.out.println(constructors[i]);
			}
			for(int i=0; i<methods.length; i++) {
				System.out.println(methods[i]);
			}
			
			for(int i=0; i<fields.length; i++) {
				System.out.println(fields[i]);
			}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 동적 개체 생성
		// 구현클래스(인터페이스 존재해야함)
		try {
			Class clazz3 = Class.forName("javabook2.ch08.sec02.Audio");
			Object obj3 = clazz3.newInstance();
			RemoteControl rc = (RemoteControl)obj3;
			rc.turnOn();
			rc.turnOff();
			
		}catch(InstantiationException | IllegalAccessException e) {
			System.out.println("Class 클래스의 newInstance() 메소드의 예외처리");
		} catch (ClassNotFoundException e) {
			System.out.println("Class 클래스의 forName() 메소드의 예외처리");
			e.printStackTrace();
		}
		
	}

}
