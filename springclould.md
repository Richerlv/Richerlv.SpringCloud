#### CAP原则

consistency 一致性

availability  可用性 （当一个节点挂掉，整个集群可以继续对外提供服务）

Partition tolerance  分区容错性（由于机房网络、分区等原因会导致各个机器中的数据短暂不一致）

***以上三个特性最多同时满足两个***

选择：CP-数据一致但是有个节点挂了整个服务几分钟内不能提供服务

​			AP-数据可能不一致

ZK遵循CP原则， Eureka遵循AP高可用



#### 配置Eureka集群

要修改映射：C:\Windows\System32\drivers\etc\hosts

按这个教程修改：[如何修改Hosts文件-百度经验 (baidu.com)](https://jingyan.baidu.com/article/335530dafcb63719cb41c3ad.html)

```markdown
原理：`Hosts是一个没有扩展名的系统文件，主要作用是定义IP地址和主机名的映射关系，就是将一些常用的域名网址与其对应的IP地址建立一个关联“数据库”，当用户在浏览器中输入一个需要登录的网址时，系统会首先自动从Hosts文件中寻找对应的IP地址，如果找到，系统会立即打开对应网页，若没有找到，则系统会再将网址提交DNS域名解析服务器进行IP地址的解析，若发现是被屏蔽的IP或域名，就会禁止打开此网页！`
```

