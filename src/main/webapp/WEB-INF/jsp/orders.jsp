<%--<%@ include file="common/header.jsp"%>--%>
<%--<%@ include file="common/footer.jsp"%>--%>
<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Order</title>
    <link rel="stylesheet" href="/css/styles.css" type="text/css"/>
</head>
<body>
<div class="container">
    <h1>Order</h1>
    <hr>
<%--    <div class="button">--%>
<%--        <a href="<c:url value="/authors/addForm"/>"><button type="button">Создать</button></a>--%>
<%--    </div>--%>
<%--    <hr>--%>
<%--    <div class="button">--%>
<%--        <a href="<c:url value="/authors/searchForm"/>"><button type="button">Поиск</button></a>--%>
<%--    </div>--%>
<%--    <hr>--%>
    <%--@elvariable id="orders" type=""--%>
    <%--@elvariable id="ordersDto" type=""--%>
<%--    <form:form method="get" modelAttribute="orders">--%>
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
                <th>Delete Order</th>
            </tr>
            <jsp:useBean id="orderPerson" scope="request" type="java.util.List"/>
            <c:forEach items="${orderPerson}" var="orders">
                <tr>
                    <td>${orders.id}</td>
                    <td>${orders.rentalStartDate}</td>
                    <td>${orders.rentalEndDate}</td>
                    <td>${orders.orderAmount}</td>
                    <td>${orders.massage}</td>
                    <c:forEach items="${orders.carDto}" var="carDto">
                        ${carDto.model}  <br>
                    </c:forEach>
                    <c:forEach items="${orders.orderStatusDto}" var="orderStatusDto">
                        ${orderStatusDto.statusOrder}  <br>
                    </c:forEach>
                    <c:forEach items="${orders.paymentStatusDto}" var="paymentStatusDto">
                        ${paymentStatusDto.statusPayment}  <br>
                    </c:forEach>
                    <td><button>Delete</button></td>
                    <td>
<%--                        <a href="<c:url value="/authors/${author.id}/fullInfo"/>">Подробнее</a>--%>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
<%--    </form:form>--%>
</html>
