## project_versions
v1.1升级版本
add by feature/v1_1/graduation_use_themeleaf_dto：版本分支，功能修改分支
版本为1.1，对1.0进行版本升级，继续维护

## project_update_target
版本1.1更新
1、引入dto、do功能，对原本的接口进行改造

## project_theme
essm：Easy study system platform (易学习平台)

## project_desc
毕业设计项目
易学习平台为了让更多人学好英语，通过有趣而又灵活的多种方式来给需要学习英语的人提供了更多学习英语的方式，能够促进英语教育的发展。
功能
1、用户模块：提供三种形式的访问，分别针对用户登录访问和系统管理员登录访问设置不同的权限；
2、权限模块：通过权限限制访问
3、学习模块：提供多种形式，基于盲式英语学习、基于定制计划学习和基于中英文接龙学习；
    3.1、定制计划
    3.2、盲式学习（中文、英文学习）
    3.3、中英文接龙（中文、英文接龙）
    3.4、测测实力
4、库模块：系统的特色是单词库模块是属于自己的，所有针对学习的单词是需要自己进行输入；

## dev_desc
当前版本使用技术：JAVA+ SpringBoot2.26框架 + MySQL5.6.43 + JDK1.8 + windows10环境下完成易学习平台功能的开发实现。
前端界面使用的是HTML，后端采用Thymeleaf模板引擎，前后端交互采用JQ；后期改进应该彻底前后端分离

  #数据库配置
  datasource:
    type: com.alibaba.druid.pool.DruidDataSource
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://127.0.0.0:3306/essm_dev?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8&useSSL=false
    username: root
    password: 123456
    initialSize: 5   #初始化时建立物理连接的个数
    minIdle: 5    #最小连接池数量
    maxActive: 20   #最大连接池数量
    maxWait: 60000    #获取连接时最大等待时间
    timeBetweenEvictionRunsMillis: 60000    #Destory线程检测连接的间隔时间
    minEvictableIdleTimeMillis: 300000    #连接保持空闲而不被驱逐的最长时间
    testWhileIdle: true
    validationQuery: SELECT 1    #检测连接是否有效的sql
    testOnBorrow: false   #申请连接时执行validationQuery检测连接是否有效
    testOnReturn: false    #归还连接时执行validationQuery检测连接是否有效
    poolPreparedStatements: true   #是否缓存preparedStatements

    #配置监控统计拦截的filters，stat:监控统计、log4j：日志记录、wall：防御sql注入
    #如果允许时报错  java.lang.ClassNotFoundException: org.apache.log4j.Priority
    #则导入 log4j 依赖即可
    filters: stat,wall,log4j
    maxPoolPreparedStatementPerConnectionSize: 20
    useGlobalDataSourceStat: true
    connectionProperties: druid.stat.mergeSql=true;druid.stat.slowSqlMillis=500