# prototype-server

## 0x01.简介

> prototype-server是j2ee快启动框架，集成通用业务抽象和可插拔技术组件中间件，可以作为商业项目或毕业设计快速启动模板。

## 0x02.技术选型

### - FrontEnd

1. `prototype-browser-ui`: [浏览器端管理后台代码]()

### - BackEnd

1. Spring Boot
2. Spring Security
3. Mybatis Plus

## 0x03.项目结构介绍

- `prototype-app`: 移动端后台
- `prototype-browser`: 浏览器端后台
- `prototype-core`: 框架核心依赖代码
- `prototype-generator`: 代码生成工具，包含前后台代码生成。
- `prototype-mysql`: mysql数据库依赖，**app**与**browser**公用。
- `prototype-mongo`: mongo数据库依赖，**app**与**browser**公用。

## 0x03.开发人员

1. [K.O](https://github.com/prototypeol)
2. [CuiChaoJin](https://github.com/ccj)

## 0x04.更新日志

### - 2019-12-24

- 添加API版本管理功能
- 去掉原app工程，将browser修改为app


### - 2019-11-05

- 修改菜单显示问题
- 添加直接单Jar包部署能力
- 重构全局异常和异常代码

### - 2019-11-01

1. 短信登录注册，以及短信验证
2. 新增验证码记录表
3. sms功能开发完成

### - 2019-10-30

1. 注册用户，验证发送

### - 2019-10-29

1. 抽取前端项目，创了一个新的github仓库;
2. 添加mongodb访问，调整项目文档。

### - 2019-09-20

1. 修改权限下新增菜单报错异常
2. 调整权限和菜单关联关系

### - 2019-08-17

1. 修复全局异常处理bug

### - 2019-08-05

1. 添加邮箱验证码发送。
2. 添加短信验证码发送代码，等待aliyun审批。

### - 2019-08-04

1. 注册接口添加，用户名，邮箱，手机号重复校验。
2. 添加用户字段校验接口。

### - 2019-08-03

1. 修改用户接口，注册用户时如果不传权限信息，给予默认普通用户权限
2. Springboot版本从1.5.21.RELEASE升级到2.1.6.RELEASE
