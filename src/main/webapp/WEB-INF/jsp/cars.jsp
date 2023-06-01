<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<head>
    <style><%@include file="../../../resources/css/normalize.css"%></style>

    <style><%@include file="../../../resources/css/style.css"%></style>

    <title>Car Sharing</title>
</head>

<body>
<nav>

    <div class="header">
        <div class="header-bg"></div>
        <div class="navigation">
            <div class="logo">
<%--                <img src="../../../resources/images/Icon%20Logo%20Normal.svg" alt="">--%>
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

        </div>
        <div class="header-arrow">
            <img src="../../../resources/images/Icon%20Arrow%20Down.svg" alt=""></div>

    </div>

    </div>
    </div>
</nav>

<img src="./../../resources/images/New-VW-Polo-black.png" width="400" height="200" alt="">
<a href="cars_orders/polo">VW Polo New, 1.6, Automatic transmission, Black, 2022
    <br>
    Cost 16.70 $/hour</a>

<img src="./../../resources/images/Kia-Rio-X-line-silver.png" width="400" height="200" alt="">
<a href="cars_orders/kia">Kia-Rio-X-line, 1.6, Automatic transmission, Silver, 2021
    Cost 16.70 $/hour </a><br>
<br>
<img src="./../../resources/images/skoda.png" width="400" height="200" alt="">
<a href="cars_orders/skoda">'Skoda Rapid, 1.4, Automatic transmission, Black, 2021
    Cost 16.70 $/hour </a>

<img src="./../../resources/images/Geely-Atlas-Pro-black.png" width="400" height="200" alt="">
<a href="cars_orders/gelly_atlas">'Geely Atlas Pro, 1.5, Automatic transmission, Grey, 2021
    Cost 20.50 $/hour </a><br>
<br>
<img src="./../../resources/images/Geely-Tugella-grey.png" width="400" height="200" alt="">
<a href="cars_orders/gelly_tugella">'Geely Tugella, 1.6, Automatic transmission, White, 2021,
    Cost 23.70 $/hour </a>
<br>
<%@ include file="common/footer.jsp"%>