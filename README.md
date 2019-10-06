本人从码农到架构师之学习之路！
EXCEL 技能
=CONCATENATE("UPDATE shop_remarket_clue_main a SET clue_status='follow',update_time= '",TEXT(H2,"yyyy-mm-dd"),"',distribute_time= '",TEXT(H2,"yyyy-mm-dd"),"' WHERE a.phone = '",C2,"';")
查询
grep -C 20 'EJIPVRLE' ai-call-ope-web.log

linux安装ftp文档：
https://help.aliyun.com/document_detail/92048.html
安装mysql文档：
https://help.aliyun.com/document_detail/116727.html
安装docker并部署web项目
http://www.imooc.com/article/282731  


netty:
理解了这4个概念之后就对Netty5的线程模型有了清楚的认识：

在监听一个端口的情况下，一个NioEventLoop通过一个NioServerSocketChannel监听端口，处理TCP连接。
后端多个工作线程NioEventLoop处理IO事件。每个Channel绑定一个NioEventLoop线程，
1个NioEventLoop线程关联一个selector来为多个注册到它的Channel监听IO就绪事件。
NioEventLoop是单线程执行，保证Channel的pipline在单线程中执行，保证了ChannelHandler的执行顺序。

