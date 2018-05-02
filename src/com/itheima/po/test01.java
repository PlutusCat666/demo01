package com.itheima.po;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test01 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class clazz = Car.class;
		Constructor constructor = clazz.getConstructor();
		Car c1 = (Car) constructor.newInstance();
		
		Method method = clazz.getMethod("getCar");
		Car c2 = (Car) method.invoke(c1);
//		
//		car.setCname("奔驰");
//		car.setNum(4);
		
		
		Car c3 = Car.getCar();
		c3.setCname("QQ");
		c3.setNum(3);
//		c3.show();
//		c1.show();
//		c2.show();
	}
}
