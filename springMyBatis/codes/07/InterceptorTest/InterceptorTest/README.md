# SpringMVC拦截器
## 实现HandlerInterceptor接口
- override preHandle: 在该方法中进行处理器拦截，在Controller处理之前进行调用。该方法返回true才继续往下执行后续处理，否则整个请求处理结束。  
  该方法中实现具体的拦截逻辑，确认是否放行请求（返回true）或者拦截请求终止服务（返回false）。  

- override postHandle: 在controller的方法调用前挪，可以对ModelAndView操作。  
- override afterCompletion: 在整个请求完成后执行，主要用于清理资源  
[参考实现示例](src/org/fkit/interceptor/AuthorizationInterceptor.java)

## SpringMVC配置interceptor
可插拔的Interceptor配置  
```
<mvc:interceptors>
	<mvc:interceptor>
		<mvc:mapping path="/*"/>
		<!-- 使用bean定义一个Interceptor，直接定义在mvc:interceptors根下面的Interceptor将拦截所有的请求 -->  
		<bean class="org.fkit.interceptor.AuthorizationInterceptor"/>
	</mvc:interceptor>
</mvc:interceptors>
```