package com.jin.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author louisliao
 */
public class EncodingFilter implements Filter {

    /**
     * 配置中默认的字符编码
     */
    protected String encoding = null;
    protected FilterConfig filterConfig;
    /**
     * 当没有指定默认编码时是否允许跳过过滤
     */
    protected boolean ignore = true;

    /**
     *
     */
    public EncodingFilter() {
        // TODO Auto-generated constructor stub  
    }

    /* (non-Javadoc) 
     * @see javax.servlet.Filter#destroy() 
     */
    public void destroy() {
        // TODO Auto-generated method stub  
        this.encoding = null;
        this.filterConfig = null;
    }

    /* (non-Javadoc) 
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain) 
     */
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub  
        HttpServletRequest hRequest = (HttpServletRequest) request;
        HttpServletResponse hResponse = (HttpServletResponse) response;
        //Conditionally select and set the character encoding to be used    
        if (ignore || hRequest.getCharacterEncoding() == null) {
            String coding = selectEncoding(hRequest);
            if (coding != null) {
                hRequest.setCharacterEncoding(coding);
                hResponse.setCharacterEncoding(coding);
            }
        }
        // 将控制器传向下一个 filter  
        chain.doFilter(hRequest, hResponse);

    }

    /* (non-Javadoc) 
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig) 
     */
    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub  
        this.filterConfig = filterConfig;
        this.encoding = filterConfig.getInitParameter("encoding");
        System.out.println(this.encoding);
        String value = filterConfig.getInitParameter("ignore");
        if (value == null) {
            this.ignore = true;
        } else if (value.equalsIgnoreCase("true")) {
            this.ignore = true;
        } else if (value.equalsIgnoreCase("yes")) {
            this.ignore = true;
        } else {
            this.ignore = false;
        }
    }

    protected String selectEncoding(ServletRequest request) {
        return (this.encoding);
    }

}
// init 方法是在 WEB 应用启动就会调用, doFilter 则是在访问 filter-mapping 映射到的 url 时会调用。