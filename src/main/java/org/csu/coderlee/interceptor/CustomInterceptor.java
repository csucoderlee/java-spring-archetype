package org.csu.coderlee.interceptor;

import org.csu.coderlee.constant.RequestThreadLocal;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author by bixi.lx
 * @created on 2018 07 31 11:11
 */
public class CustomInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        RequestThreadLocal.put(request);
        return super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        RequestThreadLocal.remove();
        super.postHandle(request, response, handler, modelAndView);
    }
}
