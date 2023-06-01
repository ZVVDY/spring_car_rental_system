<%--<%@ include file="common/header.jsp"%>--%>
<%--<%@ include file="common/footer.jsp"%>--%>
<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Order</title>
    <link rel="stylesheet" href="/css/styles.css" type="text/css"/>
</head>
<body>
<div class="container">
    <h1>Order</h1>
    <hr>
    <%--@elvariable id="orders" type=""--%>
        <form:form method="get" modelAttribute="orders">
    <div class="table">
        <table>
            <tr>
                <th>№</th>
                <th>Rental Start Date</th>
                <th>Rental End Date</th>
                <th>Order Amount</th>
                <th>Massage</th>
                <th>Car</th>
                <th>Order Status</th>
                <th>Payment Status</th>
            </tr>

            <c:forEach items="${ordersAll}" var="orders">
            <tr>
                <td>${orders.id}</td>
                <td>${orders.rentalStartDate}</td>
                <td>${orders.rentalEndDate}</td>
                <td>${orders.orderAmount}</td>
                <td>${orders.massage}</td>
                <td>${orders.carDto.model}</td>
                <td>${orders.orderStatusDto.statusOrder}</td>
                <td>${orders.paymentStatusDto.statusPayment}</td>


                <td>
<%--                    <a href="<c:url value=""  />" class="menu-button"> Delete</a>--%>
                    <a href="<c:url value="/delete?id=${orders.id}"/>"> Delete </a>

<%--                    <button>Delete</button>--%>
                </td>
                </c:forEach>

            </tr>

        </table>
    </div>
</div>
</body>
    </form:form>
</html>
