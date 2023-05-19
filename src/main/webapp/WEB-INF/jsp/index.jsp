<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<head>
<%--    <meta charset="UTF-8">--%>
<%--    <meta http-equiv="X-UA-Compatible" content="IE=edge">--%>
<%--    <meta name="viewport" content="width=device-width, initial-scale=1.0">--%>
    <style><%@include file="../css/normalize.css"%></style>
<%--    <link rel="stylesheet" href="../css/normalize.css">--%>
    <style><%@include file="../css/style.css"%></style>
<%--    <link rel="stylesheet" href="../css/style.css">--%>

<%--    <link rel="preconnect" href="https://fonts.googleapis.com">--%>
<%--    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>--%>
<%--    <link--%>
<%--        href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@400;700;900&family=Open+Sans:wght@500;700;800&display=swap"--%>
<%--        rel="stylesheet">--%>
    <title>Car Sharing</title>
</head>

<body>
    <nav>

        <div class="header">
            <div class="header-bg"></div>
            <div class="navigation">
                <div class="logo">
                    <img src="../../WEB-INF/images/Icon%20Logo%20Normal.svg" alt="">
                    <p>car<span> class="logo-span">sharing</span></p>
                </div>
                <div class="menu">
                    <a href="/">home</a>
                    <a href="#blog">order</a>
                    <a href="/service">service</a>
                    <a href="/contact">contact</a>
                    <a href="/registration">registration</a>
                    <a href="/login">login in</a>
                </div>

            </div>
            <div class="header-title">
                <h1>car sharing</h1>
                <p>Welcome! The car rental company welcomes you, we value every customer!</p>
                <div class="header-buttons">
                    <button class="btn btn1">
                        <p>share a car</p>
                    </button>
<!--                    <button class="btn btn2">-->
<!--                        <p>key features</p>-->
<!--                    </button>-->
                </div>
                <div class="header-arrow">
                    <img src="../images/Icon%20Arrow%20Down.svg" alt=""></div>

            </div>

        </div>
        </div>
    </nav>


    <main>
                <section class="service">

            <div class="blog-title service-title">
                <h2> service</h2>
            </div>
            <div class="blog-boxes service-boxes">
                <div class="box service-box"><img src="../images/mini2.png" alt="">
<%--                    <h3>Lorem ipsum dolor sit.</h3>--%>
<%--                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Placeat cum similique aperiam laborum--%>
<%--                        voluptatem minus reiciendis delectus veniam officiis necessitatibus.</p>--%>
                    <button class="btn-box">
                        <p>read more</p>
                    </button>
                </div>

                <div class="box service-box"><img src="../images/mini1.png" alt="">
<%--                    <h3>Lorem ipsum dolor sit.</h3>--%>
<%--                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Placeat cum similique aperiam--%>
<%--                        laborum--%>
<%--                        voluptatem minus reiciendis delectus veniam officiis necessitatibus.</p>--%>
                    <button class="btn-box">
                        <p>read more</p>
                    </button>
                </div>

                <div class="box service-box"><img src="../images/mini3.png" alt="">
<%--                    <h3>Lorem ipsum dolor sit.</h3>--%>
<%--                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Placeat cum similique aperiam--%>
<%--                        laborum--%>
<%--                        voluptatem minus reiciendis delectus veniam officiis necessitatibus.</p>--%>
                    <button class="btn-box">
                        <p>read more</p>
                    </button>
                </div>

            </div>


        </section>
        <section class="contact">
            <div class="blog-title">
                <h2> contact</h2>
            </div>
            <div class="contact-box">
                <img src="../images/Form%20Photo.png" alt="">
                <div class="form-box">
                    <form>
                        <div class="input-style">
                            <label for="name"></label><input type="text" name="name" placeholder="Type your name">
                        </div>

                        <div class="input-style">
                            <label for="email"></label><input type="email" name="email" placeholder="Type your e-mail">
                        </div>

                        <div class="input-style">
                            <label for="textarea">
                            </label><textarea name="" class="
                            form-text" id="" cols="30" rows="10" placeholder="Type your message"></textarea>
                        </div>


                        <div class="checkbox-style">
                            <input type="checkbox" id="checkbox" name="checkbox" value="consent"><label for="checkbox">
                                <p> Text</p>
                            </label>
                        </div>
                        <div class="button-box">
                            <button class="btn-send">
                                <p>Send</p>
                            </button>
                        </div>

                    </form>
                </div>
            </div>

        </section>
    </main>
    <footer>

        <div class="logo logo-footer">
            <img src="../images/Icon%20Logo%20Normal.svg" alt="">
            <p>car<span class="logo-span">sharing</span></p>
        </div>

        <div class="footer-links">
            <div class="column1">
                <a href="#">Home page</a>
                <a href="#">abouts us</a>
                <a href="#">gallery</a>
                <a href="#">share regulation</a>
            </div>
            <div class="column1">
                <a href="#">price</a>
                <a href="#">our fleet</a>
                <a href="#">our clients</a>
                <a href="#">contact</a>
            </div>
        </div>
        <div class="footer-text">
            <p>Copyright</p>
        </div>

    </footer>
</body>

</html>