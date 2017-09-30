# HRM

## 运行应用
[db.properties](src/db.properties)文件中配置了MySQL数据源。
- 本地安装并运行MySQL数据库实例。
- 创建`hrm_db`数据库。
- 通过MySQL client运行[hrm.sql](hrm.sql)初始化表并插入初始化测试数据。
- 启动应用程序后，访问http://localhost:8080/hrmapp ,输入默认账号admin/123456登录系统。