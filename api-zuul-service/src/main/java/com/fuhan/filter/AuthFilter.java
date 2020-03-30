package com.fuhan.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/12/3
 */
@Component
public class AuthFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("进入token过滤器");
//        RequestContext requestContext = RequestContext.getCurrentContext();
//        HttpServletRequest request = requestContext.getRequest();
//        String token = request.getParameter("token");
//        if(token == null){
//            requestContext.setSendZuulResponse(false);
//            try {
//                requestContext.getResponse().getWriter().write("token is null !!");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        return null;
    }
}
