package com.company.team.web.filter;

import com.company.team.utility.TraceHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

public class AuthFilter implements Filter {
    private static Logger logger = LoggerFactory.getLogger(AuthFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("{} -> {} start", this.getClass().getName(), TraceHelper.getMethodName(0));
        chain.doFilter(request, response);
        logger.info("{} -> {} end", this.getClass().getName(), TraceHelper.getMethodName(0));
    }

    @Override
    public void destroy() {
    }
}
