# ThymeleafDemo

ThymeleafDemo：
Thymeleaf是一款模板引擎，可以实现前端展示界面。
有一些常用的标签：
①th：text,显示控制器中传入的值
②th:obiect, 用于接收后台传来的对象
③th:action ,指定表单的提交地址
④th:value,用对象将id的值替换为value的属性
⑤th：field,用来绑定后台对象和表单数据。在Thymeleaf里面:th:field等同于th:name+th:value

Thymeleaf的Switch结构：
 <div th:switch="${user.role}"
        <p th:case="admin">管理员</p>
        <p th:case="vip">会员用户</p>
        <p th:case="*">普通用户</p>
        <div>
类似于以上结构，是来判断用户角色权限的

Thymeleaf的if语句
<div th:if="${role}" eq admin>
            <span>admin</span>
 </div>
 <div th:if="${role}" eq vip>
            <span>vip</span>
  </div>

以上语句同样是用来判断用户角色的


判断表达式：
gt：大于
ge：大于或等于
eq：等于
It：小于
le：小于或等于
ne：不等于


遍历对象：th:each="Object ${object}"
遍历分页：th:each="item:${page.content}"
遍历列表：th:each="item:${list}"
遍历数组：th:each=“item:${arrays}”
遍历集合（map）：th:each=“${item.key}”显示集合的key，通过th:each=“${item.value}”显示集合的value
