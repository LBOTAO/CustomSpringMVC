package cn.happy.annotation;

        import java.lang.annotation.*;

@Target({ElementType.FIELD})  //表示注解可以用在什么地方
@Retention(RetentionPolicy.RUNTIME)   //在什么级别保存该注解 RUNTIME 在运行期间保留注解，可以使用反射获取到
@Documented  //将注解包含在javadoc中
public @interface CAutowired {
    String value() default "";
}
