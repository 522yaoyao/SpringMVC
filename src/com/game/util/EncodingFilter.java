package com.game.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class EncodingFilter implements Filter{
 private FilterConfig config;
 
 private String targetEncoding="ISO-8859-1";
 
 public void destroy() {
      config=null;
  
 }
 public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
     System.out.println("×ßÁË¹ýÂËÆ÷");
      request.setCharacterEncoding(targetEncoding);
         filterChain.doFilter(request, response);
       
 
 }
 public void init(FilterConfig arg0) throws ServletException {
      this.config=arg0; 
      this.targetEncoding=config.getInitParameter("encoding");
 }
}
