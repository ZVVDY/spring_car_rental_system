<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <style><%@include file="../../resources/css/normalize_login.css"%></style>

    <style><%@include file="../../resources/css/style_login.css"%></style>
    <meta charset="utf-8">
    <title>Registration</title>
</head>
<body>
<nav>
    <div class="header">
        <div class="header-bg"></div>
        <div class="navigation">
            <div class="logo">
                <img src="../../resources/images/Icon%20Logo%20Normal.svg" alt="">
                <p>car<span class="logo-span">sharing</span></p>
            </div>
            <div class="menu">
<%--                <a href="/">home</a>--%>
                <a href="/">home</a>
            </div>

        </div>


<%--    </div>--%>
<%--    </div>--%>




<div>
    <style><%@include file="./../../resources/css/loginForm.css"%></style>
 <div class="login-box">
    <h2>Login</h2>

    <%--@elvariable id="user" type=""--%>
    <form:form method="POST" modelAttribute="user">
        <div class="user-box">
            <form:input type="text" path="username" placeholder="Username"
                        autofocus="true"/>
            <label>Username</label>
            <br>
            <form:errors path="username"></form:errors>
            <font color="white">${usernameError}</font>
            <form:errors path="username"></form:errors>
            <font color="white">${usernameError1}</font>
        </div>
     <br>
     <br>
        <div class="user-box">
            <form:input type="password" path="password" placeholder="Password"/>
            <label>Password</label>
            <form:errors path="password"></form:errors>
            <font color="white">${passwordError}</font>
        </div>
        <button type="submit">Registration</button>
     <br>
         <form:errors path="password"></form:errors>
     <font color="white">${passwordAndNameError}</font>
<%--        <a href="#">--%>
<%--            <span></span>--%>
<%--            <span></span>--%>
<%--            <span></span>--%>
<%--            <span></span>--%>
<%--            Submit--%>
<%--        </a>--%>
    </form:form>

</nav>
</body>
</html>