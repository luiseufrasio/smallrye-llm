package org.eclipse.microprofile.ai.llm;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Parameter of a Tool
 */
@Documented
@Retention(RUNTIME)
@Target({ PARAMETER })
public @interface P {

    /**
     * Description of a parameter
     *
     * @return the description of a parameter
     */
    String value();

    /**
     * Whether the parameter is required
     *
     * @return true if the parameter is required, false otherwise
     *         Default is true.
     */
    boolean required() default true;
}
