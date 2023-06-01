<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

    <title>Skoda Order </title>
    <%--  <link rel="stylesheet" href="/css/form.css">--%>
</head>

<body>
<nav>
    <div class="header">
        <div class="header-bg"></div>
        <div class="navigation">
            <div class="logo">
                <img src="../../../resources/images/Icon%20Logo%20Normal.svg" alt="">
                <p>car<span class="logo-span">sharing</span></p>
            </div>
            <div class="menu">
                <a href="/main_page">home</a>
                <a href="/cars">share a car</a>
                <a href="/orders">order</a>
                <a href="">service</a>
                <a href="">contact</a>
                <a href="/person_data">profile</a>
                <a href="<c:url value="/logout" />">exit</a>
            </div>
            <br>
    <%--@elvariable id="skoda" type=""--%>
    <form:form method="post" modelAttribute="skoda">
            Skoda Rapid, 1.4, Automatic transmission, Black, 2021
        <br>
        Cost 16.70 $/hour
        <img src="../../../resources/images/skoda.png" alt="">
        <form:errors path="rentalStartDate"></form:errors>
        <font color="red">${CarError}</font>
        <div class="user-box">
            <form:input type="date" path="rentalStartDate" placeholder="rentalStartDate"/>
            <label>Rental Start Date</label>
        </div>
        <div class="user-box">
            <form:input type="date" path="rentalEndDate" placeholder="rentalEndDate"/>
            <label>Rental end Date</label>
        </div>
        <button type="submit">Order Car</button>
        <br>
    </form:form>
    <%--</div>--%>
</nav>
</body>
    <%--</div>--%>

</html>
