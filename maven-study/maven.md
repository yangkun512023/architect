1.maven 的认识    正确读：[meɪvn]  
maven 是 一个 约定大于配置的一个脚手架，具有自动管理jar包功能。以前都是手动一个一个把jar包拷贝到classpath中，现在用maven自动管理。相当于农业社会
到工业社会，但是需要遵守一定的规则。规则定义在maven-model-builder-3.5.3.jar 里面的超级pom。
重要的知识点：
1.maven有丰富的插件。
2.maven 配置文件优先级  ${user.home}/.m2/setting.xml    ----> ${maven.home}/conf/setting.xml
3.dependencyManagement   依赖的子类不继承，申明式   子类要想用得再定义，集中规范了 版本号
4.scope   -->默认compile test provided runtime system
  compile  编译  会打包到jar
  test     测试  不会打包
  provided 编译 不会打包到jar  比如 sevelet 
  runtime  运行时，会打包  比如 驱动类jar  jdbc 驱动
  system  本地jar  会打包
5.快速查看依赖   mvn dependency::tree > d.txt
6.引用jar包原则  
        1.最短路径原则
        2.书写先后原则
7.生命周期
 三个阶段  clean   default  site
 default  --》compile test package install 。。。
 lifecycle/phases/goals
 打包命名 前面的phases 都执行
 
 