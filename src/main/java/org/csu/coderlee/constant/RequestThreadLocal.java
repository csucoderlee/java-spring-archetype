package org.csu.coderlee.constant;

import javax.servlet.http.HttpServletRequest;

/**
 * @author by bixi.lx
 * @created on 2018 07 31 13:09
 */
public class RequestThreadLocal {

    private static final ThreadLocal<HttpServletRequest> requestThreadLocal = new ThreadLocal<>();

    public static void put(HttpServletRequest request){
        requestThreadLocal.set(request);
    }

    public static HttpServletRequest get(){
        return requestThreadLocal.get();
    }

    public static void remove(){
        requestThreadLocal.remove();
    }

}
