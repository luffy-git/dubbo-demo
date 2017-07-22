Zookeeper下载地址:
    链接：http://pan.baidu.com/s/1eSIhZUi 密码：dzmd
    下载完成，解压之后，直接运行bin目录下的zkServer.cmd即可.



一大堆各版本JDK、JQuery、Java主流框架、数据库、CSS等等的中英文API，文件有点大,
最好是保存在自己网盘，有选择性的下载吧。
    链接：http://pan.baidu.com/s/1o7Zm0sy 密码：cbxq



Maven中settings.xml,讲Maven仓库修改为阿里云的镜像地址,找到mirror节点，复制下面代码即可.
    <mirror>
        <id>alimaven</id>
        <name>aliyun maven</name>
        <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
        <mirrorOf>central</mirrorOf>
    </mirror>

运行
    1.对dubbo-demo执行maven install命令
    2.运行dubbo-provider项目下的App中的main方法
    3.运行dubbo-consumer项目下的App中的main方法
    4.在浏览器输入http://localhost:8082/hello测试即可
