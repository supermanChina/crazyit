# SpringMVC基础项目
## 创建Eclipse项目框架
- 基于Eclipse创建MAVEN管理的Spring WEB项目，参考[使用Eclipse创建MAVEN WEB项目](https://github.com/supermanChina/JavaWeb/tree/master/mavenWebApp)
- 在pom.xml中添加spring相关的依赖
```
<properties>
		<v.spring>4.2.0.RELEASE</v.spring>
	</properties>

	<dependencies>
		<!-- Spring core -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-core</artifactId>
			<version>${v.spring}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-beans</artifactId>
			<version>${v.spring}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>${v.spring}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-expression</artifactId>
			<version>${v.spring}</version>
		</dependency>
		<!-- Spring web -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-web</artifactId>
			<version>${v.spring}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
			<version>${v.spring}</version>
		</dependency>
```
## 配置web.xml
在web.xml中配置Spring MVC的前端控制器，并通过ur-pattern将所有URL映射到该Servlet控制器.
```
	<servlet>
		<servlet-name>springmvc</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<init-param>
			<param-name>ContextConfigLocation</param-name>
			<param-value>/WEB-INF/springmvc-config.xml</param-value>
		</init-param>
		<load-on-startup>1</load-on-startup>
	</servlet>
	
	<servlet-mapping>
		<servlet-name>springmvc</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>
```