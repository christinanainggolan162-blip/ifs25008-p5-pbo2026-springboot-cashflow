package org.delcom.ifs25008springbootcashflow.framework.view;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class StaticCacheFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
            throws ServletException, IOException {
        if (req.getRequestURI().startsWith("/VAADIN/build/")) {
            res.setHeader("Cache-Control", "public, max-age=31536000, immutable");
            chain.doFilter(req, new HttpServletResponseWrapper(res) {
                @Override public void setHeader(String name, String value) {
                    if (!"Cache-Control".equalsIgnoreCase(name)) super.setHeader(name, value);
                }
                @Override public void addHeader(String name, String value) {
                    if (!"Cache-Control".equalsIgnoreCase(name)) super.addHeader(name, value);
                }
            });
        } else {
            chain.doFilter(req, res);
        }
    }
}