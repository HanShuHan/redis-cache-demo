/*
 * Project name: redis-cache-demo
 * Date: August 28, 2024
 */

package com.hankhan.rediscachedemo.util;


/**
 * Todo: What does this class do...
 *
 * @author Shu-Han Han
 * @version 1.0
 * @since 20.0.1
 */
public class LoggingUtils {

    public static String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}