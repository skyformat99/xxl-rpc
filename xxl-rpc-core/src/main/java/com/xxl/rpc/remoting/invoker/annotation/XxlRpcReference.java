package com.xxl.rpc.remoting.invoker.annotation;

import java.lang.annotation.*;

/**
 * rpc service annotation, skeleton of stub ("@Inherited" allow service use "Transactional")
 *
 * @author 2015-10-29 19:44:33
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface XxlRpcReference {

    String netType() default "";
    String serialize() default "";
    String address() default "";
    String accessToken() default "";

    //Class<?> iface;
    String version() default "";

    long timeout() default -1;
    String callType() default "";

}
