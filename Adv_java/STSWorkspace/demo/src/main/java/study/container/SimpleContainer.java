package study.container;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

import study.MyClass;
import study.anno.MySticker;

public class SimpleContainer {//watchman

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
        MyClass obj = new MyClass();
        
        Class cls = obj.getClass();
        Method[] methods = cls.getMethods();
        
        for(Method m: methods)
        {
        	if(m.getName().equals("f1")|| m.getName().equals("f2"))
        	{
        		if(m.isAnnotationPresent(MySticker.class))//agar annotation rahega to true
        		{
        			System.out.println(m.getName()+" was called on "+new Date());
        		}
        		m.invoke(obj);
        	}
        }
	}

}
