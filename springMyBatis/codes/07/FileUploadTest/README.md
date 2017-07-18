# SpringMVC文件上传
基于Apache Commons FileUpload的进一步封装。
## 表单设置
- 必须设置`method＝"post"`
- 并且设置`enctype="multipart/form-data"`
- 设置file input: `<input type＝"file"`
## SpringMVC上下文配置
添加`multipartResolver` bean配置：  
```
 <bean id="multipartResolver"  
        class="org.springframework.web.multipart.commons.CommonsMultipartResolver">  
		<!-- 上传文件大小上限，单位为字节（10MB） -->
        <property name="maxUploadSize">  
            <value>10485760</value>  
        </property>  
        <!-- 请求的编码格式，必须和jSP的pageEncoding属性一致，以便正确读取表单的内容，默认为ISO-8859-1 -->
        <property name="defaultEncoding">
        	<value>UTF-8</value>
        </property>
</bean>
```
## Controller映射
在controller中通过`@RequestParam`注解将"file"字段映射到`MultipartFile`对象。  
```
	 // 上传文件会自动绑定到MultipartFile中
	 @RequestMapping(value="/upload",method=RequestMethod.POST)
	 public String upload(HttpServletRequest request,
			@RequestParam("description") String description,
			@RequestParam("file") MultipartFile file) throws Exception{
		...		
	}		 
```
