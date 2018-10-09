package com.example.demo;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;


/**
 * @program:com.example.demo
 * @description:
 * @class:MyFilter
 * @author:SanCheng
 * @create:2018-10-09-11-34
 **/
@Component
public class MyFilter extends ZuulFilter {
	private static Logger logger= LoggerFactory.getLogger(MyFilter.class);
	@Override
	public String filterType() {
		return PRE_TYPE;
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
		RequestContext context=RequestContext.getCurrentContext();
		HttpServletRequest request=context.getRequest();
		Object accessToken=request.getParameter("token");
		if(accessToken==null){
			logger.warn("token is empty!");
			context.setSendZuulResponse(false);
			context.setResponseStatusCode(401);
			try{
				context.getResponse().getWriter().write("token is empty");
			}catch (Exception e){
				return null;
			}
		}
		logger.info("ok");
		return null;
	}
}
