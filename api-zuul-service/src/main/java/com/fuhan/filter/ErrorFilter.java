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
public class ErrorFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "error";
    }

    @Override
    public int filterOrder() {
        return 2;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("进入Error过滤器");
//        RequestContext requestContext = RequestContext.getCurrentContext();
//        requestContext.setSendZuulResponse(false);
//        try {
//            requestContext.getResponse().getWriter().write("Error");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return null;
    }
}
