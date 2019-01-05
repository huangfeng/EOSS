# Need more help?
[wiki help](https://github.com/jelly-liu/EOSS/wiki)  
# EOSS With Apache Shiro
RBAC(Role Based Access Control) Project Use Spring MyBatis MySQL  
User, Role, Permission, Resource, Menu, FilterChainDefinition  
EOSS-Pure simulate but without apache shiro, Or EOSS-Shiro completely integrate with Apache Shiro  
If you want to known more about apache shiro  
view here [Apache Shiro](http://shiro.apache.org/index.html "Apache Shiro")  
view here [shiro-demo](https://github.com/jelly-liu/shiro-demo "shiro-demo")  
view here [EOSS-Shiro](https://github.com/jelly-liu/EOSS "EOSS-Shiro")

# **** Pure Or Shiro branch, both keep on updating ***
This branch is pure, with restfull flaver, but simulate shiro

# About Master Branch
Master branch is sync with EOSS-Shiro branch

# About EOSS-Pure Branch
This branch is pure, but simulate shiro

# About EOSS-Shiro Branch
This is the EOSS completed integrated with Apache Shiro  
------------ integrated framework ------------  
--maven  
--mysql(easy translate to oracle)  
--mybatis  
--spring  
--shiro  
--redis  
--google guava  
------------ basic RBAC feature support ------------  
--support user[CRUD]  
----support user-role[CRUD]  
----support user-menu[CRUD]  
----support user-resource[CRUD]  
--support role[CRUD]  
----support role-permission[CRUD]  
--support permistion[CRUD]  
--support resource[CRUD]  
--support menu tree[CRUD]  
------------ shiro feature support ------------  
--support MD5 HashedCredentialsMatcher  
--support RolesOrAuthorizationFilter  
--support PermsOrAuthorizationFilter  
--support dynamic edit FilterChainDefinitions on line, do not need relogin or restart tomcat    
--support refresh Authentication cache, when update user or role, do not need relogin or restart tomcat  
--support Redis and Guava CacheManager  
--support sessionManager and sessionDAO and cacheManager  
--support or logic between all filter of one rule which configued in [urls] section, need open by manual

# ScreenShot  
![ScreenShot1](https://github.com/jelly-liu/EOSS/blob/master/ScreenShot1.png "ScreenShot1")  
![ScreenShot2](https://github.com/jelly-liu/EOSS/blob/master/ScreenShot2.png "ScreenShot2")  
![ScreenShot3](https://github.com/jelly-liu/EOSS/blob/master/ScreenShot3.png "ScreenShot3")  
