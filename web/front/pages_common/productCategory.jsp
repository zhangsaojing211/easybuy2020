
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<ul class="menu_r">
<li><a href="home.jsp">首页</a></li>
<c:forEach var="category" items="${categoryList}">
    <li> <a href="${ctx}/Product?action=queryProducts&categoryId=${category.productCategory.id}">${category.productCategory.name}</a></li>
</c:forEach>