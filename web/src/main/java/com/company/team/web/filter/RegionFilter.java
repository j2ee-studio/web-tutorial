package com.company.team.web.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegionFilter implements Filter {

    private static Logger logger = LoggerFactory.getLogger(RegionFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("RegionFilter -> doFilter start");

        String region = request.getParameter("region");
        logger.info("region: {}", region);

        if (region != null && region.equals("US")) {
            logger.info("Requests from US are acceptable, continue to next filter");
            chain.doFilter(request, response);
        } else {
            logger.info("Requests from the region you sent the request would be rejected");
            sendError((HttpServletResponse) response, HttpServletResponse.SC_FORBIDDEN, "You are not authorized to access this page from the region you have sent the request");
        }

        logger.info("RegionFilter -> doFilter end");
    }

    private void sendError(HttpServletResponse response, int sc, String msg) throws IOException {
        response.sendError(sc, msg);
    }

    @Override
    public void destroy() {
    }
}
