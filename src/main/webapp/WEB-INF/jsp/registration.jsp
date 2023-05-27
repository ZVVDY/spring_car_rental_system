<%--<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>--%>
<%--<!DOCTYPE html>--%>
<%--<head>--%>
<%--<style><%@include file="../../resources/css/login.css"%></style>--%>
<%--<form class="login-form" action="javascript:void(0);">--%>
<%--    <form:form method="POST" modelAttribute="registration">--%>
<%--    <h1>Registration</h1>--%>
<%--    <div class="form-input-material">--%>
<%--        <input type="text" name="username" id="username" placeholder=" " autocomplete="off" class="form-control-material" required />--%>
<%--        <label for="username">Username</label>--%>
<%--    </div>--%>
<%--    <div class="form-input-material">--%>
<%--        <input type="password" name="password" id="password" placeholder=" " autocomplete="off" class="form-control-material" required />--%>
<%--        <label for="password">Password</label>--%>
<%--    </div>--%>
<%--    <button type="submit" class="btn btn-primary btn-ghost">Registration</button>--%>
<%--</form>--%>
<%--</head>--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Регистрация</title>
</head>
<body>
<div>
    <%--@elvariable id="userForm" type=""--%>
    <form:form method="POST" modelAttribute="userForm">
        <h2>Регистрация</h2>
        <div>
            <form:input type="text" path="username" placeholder="Username"
                        autofocus="true"></form:input>
            <form:errors path="username"></form:errors>
                ${usernameError}
        </div>
        <div>
            <form:input type="password" path="password" placeholder="Password"></form:input>
        </div>
                <button type="submit">Зарегистрироваться</button>
    </form:form>
    <a href="/">Главная</a>
</div>
</body>
</html>