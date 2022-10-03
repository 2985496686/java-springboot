package com.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//配置拦截器
@Configuration
public class FilterConfig {

    //返回一个注册过滤器的bean
    @Bean
    public FilterRegistrationBean registrationBean(){
        FilterRegistrationBean registBean = new FilterRegistrationBean();
        registBean.setFilter(new MyFilter());
        registBean.setOrder(1);
        registBean.addUrlPatterns("/*");
        return registBean;
    }

    public class MyFilter implements Filter{

        @Override
        public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {
        }

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
                throws IOException, ServletException {
            HttpServletRequest req = (HttpServletRequest)servletRequest;
            System.out.println("this is myfilter url:" + req.getRequestURI());
            filterChain.doFilter(servletRequest,servletResponse);
        }

        @Override
        public void destroy() {
        }
    }
}
