<%@include file="common/header.jsp"%>
<style><%@include file="../css/login.css"%></style>
<form class="login-form" action="javascript:void(0);">
    <h1>Registration</h1>
    <div class="form-input-material">
        <input type="text" name="username" id="username" placeholder=" " autocomplete="off" class="form-control-material" required />
        <label for="username">Username</label>
    </div>
    <div class="form-input-material">
        <input type="password" name="password" id="password" placeholder=" " autocomplete="off" class="form-control-material" required />
        <label for="password">Password</label>
    </div>
    <button type="submit" class="btn btn-primary btn-ghost">Registration</button>
</form>