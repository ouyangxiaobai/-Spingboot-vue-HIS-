# 项目名称

（精品）基于Spingboot vue的HIS医院门诊信息系统设计与实现 毕业论文+项目源码及数据库文件

# 系统介绍
摘 要
医院门诊信息管理系统是依据医院的门诊局部以及门诊局部配套的前台、医技、药房等局部的实践状况停止开发编写的一套全方位的管理系统。它的主要目的是便当医院关于门诊局部以及其配套的一些子部份停止集中管理，便当医生的看诊过程和患者的就诊过程，进步医生的工作效率以及患者的称心度。
本系统的前端主要运用了Vue框架、Element UI和AJAX技术。Vue采用自底向上增量开发的设计。Vue 的中心库只关凝视图层，并且十分容易学习，也十分容易与其它库或已有项目整合。Element UI则具有分歧性、优化反应、高效率和可控的优点。项目后端主要运用了Spring等一系列框架和MyBatis以及Maven。这一套技术易于学习、操作和管理。数据库方面则是运用了MySQL数据库以及Navicat数据库管理工具，轻量，易于管理。
本系统根本完成了项目需求中提出的各项内容，主要完成了前台局部、门诊医生局部、医技医生局部、药房局部和系统管理局部五个子系统。其中前台局部包含了现场挂号、退号、费用查询、收费退费四个子模块；门诊医生局部包含了病历首页、检验申请、门诊确诊、处置申请、药物处方、费用查询六个子模块；医技医生局部包含了患者检验、患者处置、医技管理三个子模块；药房管理局部包含出药和药品管理两个子模块；系统管理局部包含科室管理、医生排班管理、用户管理三个子模块。
本文将从所应用的技术、详细的完成、完成的功用、在系统中的作用等方面，对我们完成的医院门诊管理系统停止细致的描绘。
关键词HIS医院信息系统；前后端别离；VUE；Spingboot
summary
The outpatient information management system of the hospital is an all-round management system developed and written according to the actual situation of the outpatient part of the hospital and the supporting reception desk, medical technology, pharmacy and other parts of the outpatient part.Its main purpose is to facilitate the hospital to conduct centralized management of the outpatient department and its supporting subsidiaries, so as to facilitate the consultation process of doctors and the treatment process of patients, and improve the work efficiency of doctors and patient satisfaction.
The front end of this system mainly uses the Vue framework, Element UI, and AJAX technologies.The Vue uses a bottom-up incremental development design.Vue's core library focuses only on the view layer and is very easy to learn and easily integrate with other libraries or existing projects.Element UI has the advantages of consistency, optimized feedback, high efficiency, and control.The backend of the project mainly uses a series of frameworks like Spring and MyBatis as well as Maven.This set of technologies is easy to learn, operate, and manage.In the database side, MySQL database and Navicat database management tools are lightweight and easy to manage.
The system basically realizes the contents proposed in the project needs, mainly realizing five sub-systems: front desk part, outpatient doctor part, medical technology doctor part, pharmacy part and system management part.The front desk part includes four sub-modules: field registration, withdrawal, fee inquiry and fee refund; outpatient doctor part includes home page, inspection application, outpatient diagnosis, treatment application, drug prescription, fee inquiry; medical doctor part includes patient inspection, patient disposal, medical technology management; pharmacy management part includes two submodules of drug delivery and drug management; and system management part includes three submodules: department management, physician scheduling management and user management.
This paper will provide a detailed description of the hospital outpatient management system we implement in terms of the applied technology, specific implementation, completed functions, role in the system, etc.
Keywords HIS hospital information system; front and rear separation; VUE;Spingboot
目录
摘 要 I
summary 1
第1章 绪论 5
1.1 项目背景 5
1.2 项目意义 6
1.3 工作内容 6
1.3.1 项目故事板 6
1.3.2 项目构造层次图 9
1.3.3 整体业务流程图 9
1.4 工作方案 10
1.4.1 人员布置 10
1.4.2 时间布置 10
1.5 本章小结 10
第2章 开发工具及相关技术简介 11
2.1 HbuilderX 11
2.2 IntelliJ IDEA 11
2.3 MySQL 11
2.4 Navicat 12
2.5 配置管理与Git应用 12
2.6 Vue开发前端开发框架 12
2.7 Element UI 13
2.8 Ajax 13
2.9 Spring 13
2.10 Spring MVC 13
2.11 Springboot 13
2.12 MyBatis 14
2.13 Maven 14
2.14 Axure RP 14
2.15 PowerDesigner 15
2.16 ProcessOn 15
2.17 本章小结 15
第3章 需求剖析 16
3.1引言 16
3.1.1目的 16
3.1.2参考材料 16
3.1.3术语 16
3.2任务概述 16
3.2.1目的 16
3.3需求规则 16
3.3.1普通性需求 16
3.3.2功用性需求 17
3.3.3挂号 19
3.3.4缴费/退费 21
3.3.5病例填写 23
3.3.6 检验申请 25
3.3.7门诊确诊 26
3.3.8处置申请 28
3.3.9开立处方 30
3.3.10处方管理 31
3.3.11患者检验 32
3.3.12患者处置 34
3.3.13医技管理 36
3.3.14药房开药 37
3.3.15药房管理 39
3.3.16医生排班管理 40
3.3.17科室管理 41
3.3.18用户管理 43
3.4系统平安性的请求 45
3.4.1数据存储平安 45
3.4.2访问控制平安 45
3.4.3网络传输平安 45
3.4.4应用系统审计 45
3.4.5系统约束 45
3.5运转环境规则 45
3.5.1运转环境 45
3.5.2接口 46
3.6遗留问题 46
3.7项目非技术需求 46
3.8本章小结 46
第4章 系统设计 47
4.1 界面原型及接口设计 47
4.1.1 挂号局部 47
4.1.2 退号局部 48
4.1.3 患者费用查询局部 49
4.1.4 缴费/退费局部 50
4.1.5 病历首页局部 51
4.1.6 检验申请局部 52
4.1.7 处置申请局部 53
4.1.8 门诊确诊局部 54
4.1.9 成药处方局部 55
4.1.10 草药处方局部 56
4.1.11门诊费用查询局部 57
4.1.12患者检验局部 58
4.1.13患者处置局部 59
4.1.14医技管理局部 60
4.1.15开药局部 60
4.1.16药物管理局部 61
4.1.17医生排班管理局部 62
4.1.18科室管理局部 63
4.1.19用户管理局部 63
4.2 数据库设计（ER图，标准化，物理设计） 64
4.2.1项目总E-R图 64
4.2.2项目分E-R图 65
70
71
4.2.3数据库标准化剖析 71
4.2.4数据库表设计 72
# 环境需要

1.运行环境：最好是java jdk 1.8，我们在这个平台上运行的。其他版本理论上也可以。\
2.IDE环境：IDEA，Eclipse,Myeclipse都可以。推荐IDEA;\
3.tomcat环境：Tomcat 7.x,8.x,9.x版本均可\
4.硬件环境：windows 7/8/10 1G内存以上；或者 Mac OS； \
5.数据库：MySql 5.7版本；\
6.是否Maven项目：否；

# 技术栈

1. 后端：Spring+SpringMVC+Mybatis\
2. 前端：JSP+CSS+JavaScript+jQuery

# 使用说明

1. 使用Navicat或者其它工具，在mysql中创建对应名称的数据库，并导入项目的sql文件；\
2. 使用IDEA/Eclipse/MyEclipse导入项目，Eclipse/MyEclipse导入时，若为maven项目请选择maven;\
若为maven项目，导入成功后请执行maven clean;maven install命令，然后运行；\
3. 将项目中springmvc-servlet.xml配置文件中的数据库配置改为自己的配置;\
4. 运行项目，在浏览器中输入http://localhost:8080/ 登录

# 高清视频演示

https://www.bilibili.com/video/BV1WF411V7bN/

> # **数据库获取：QQ:3484724101**

​