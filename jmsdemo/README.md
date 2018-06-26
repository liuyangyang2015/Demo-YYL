
在 Wildfly 10.x 中使用自带的 ActiveMQ 消息中间件 提供 Java 消息服务(JMS)
如何使用：
* 启动Wildfly时采用 standalone-full.xml 配置文件 (默认的 standalone.xml 并未提供 JMS)
在命令提示窗口进入 %WildFly_HOME%\bin\目录 执行 standalone.bat -c standalone-full.xml

注意：
1. 在 standalone-full.xml 中 需添加你打算中转消息的destination(Queue或Topic) ，
该例子中使用 &lt;jms-topic name="MyTopic" entries="java:/jboss/exported/jms/topic/MyTopic"/&gt;
2. 要使用 JMS, 必须有一个用户角色是 guest 的 WildFly 用户。如果之前没有添加的话，那么需要先添加一个用户
在 %WildFly_HOME%\bin\ 目录下执行 add-user.bat 按提示添加用户