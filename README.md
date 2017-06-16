# Dubbo-Support
本项目在借鉴Dubbo官方的源码及脚本的基础之上做了一些封装，以方便开发者更快的搭建起自己的dubbo应用

## 创建自己的Provider应用
请参照用示例 `dubbosupport-sample-provider`

## 打包
修改`assembly`目录下的两个配置文件：`full.xml`和`interface-only.xml`

第一次打包需在根目录下执行 `mvn clean install -Dmaven.test.skip=true` 即可完成打包，以后打包可以cd到指定的子项目目录下执行此命令。

生成的包当中，我们用到的有两个  
dubbosupport-sample-provider/target下，有两个包：

`dubbosupport-sample-provider-1.0-interface-only.jar`  接口包，只包含接口，不包含实现类，可以放到nexus上；

`dubbosupport-sample-provider-1.0-full.tar.gz`  完整包，包含全部类、配置文件以及依赖包，包含启动脚本等若干脚本文件；

## 运行
1. 修改application.properties相关参数，应用名、端口号不可与其他应用重复；
2. dubbosupport-sample-provider-1.0-full.tar.gz上传到服务器，解压，直接运行bin/目录下的start.sh脚本运行；
3. 其他脚本功能：

`status.sh` 查看应用是否启动；  
`stop.sh` 关闭应用（kill）；  
`log.sh` 查看日志（标准输出）；

## 发布你的接口包到你的maven仓库
修改 `deploy-interface-release.bat` 中的相关参数，然后运行，注意如果你的nexus服务器需要用户名密码认证，请修改你本地的maven配置文件settings.xml，增加以下内容：
```xml
<servers>
    <server>
        <id>your-nexus-id</id>
        <username>your_username</username>
        <password>your_password</password>
    </server>
</servers>
```

## contact me
pengyu
qq: 450550330
