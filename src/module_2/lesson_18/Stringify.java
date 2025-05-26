package module_2.lesson_18;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Stringify {
    boolean includeClassName() default true;
    String fieldSeparator() default "\n";
    char equalSign() default '=';
}
