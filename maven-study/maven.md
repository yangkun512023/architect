1.maven 的认识    正确读：[meɪvn]  
maven 是 一个 约定大于配置的一个脚手架，具有自动管理jar包功能。以前都是手动一个一个把jar包拷贝到classpath中，现在用maven自动管理。相当于农业社会
到工业社会，但是需要遵守一定的规则。规则定义在maven-model-builder-3.5.3.jar 里面的超级pom。
1.maven有丰富的插件。
2.maven 配置文件优先级  ${user.home}/.m2/setting.xml    ----> ${maven.home}/conf/setting.xml
