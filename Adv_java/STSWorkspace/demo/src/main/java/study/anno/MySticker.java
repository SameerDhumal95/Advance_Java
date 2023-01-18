package study.anno;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({METHOD,ElementType.TYPE})
public @interface MySticker {//Annotation = Sticker 
	
	public String value();
	public int roll();
	 
}
