<%@ include file="common/header.jsp"%>
<section class="contact">
    <div class="blog-title">
        <h2> contact</h2>
    </div>
    <div class="contact-box">
        <img src="images/Form%20Photo.png" alt="">
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
                    <p> I hereby giv my personal data included in my application to be processed for the
                        purposes of
                        the recruitment process under the European Parliament’s and Council of the European
                        Union
                        Regulation on the Protection of Natural Persons as of 27 April 2016, with regard to
                        the
                        processing of personal data and on the free movement of such data, and repealing
                        Directive
                        95/46/EC (Data Protection Directive)</p>
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
<%@include file="common/footer.jsp"%>