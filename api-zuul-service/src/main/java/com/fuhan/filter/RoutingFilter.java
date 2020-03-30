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
public class RoutingFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "route";
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
        System.err.println("进入routing过滤器!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return null;
    }
}
