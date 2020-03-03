<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script type="text/javascript">
    var contextPath = "${ctx}";
</script>
        <ul>
            <c:forEach items="${categoryList}" var="pc">
                <li>
                    <div class="fj">
                        <span class="n_img"><span></span><img src="${ctx}/front/images/nav1.png" /></span>
                        <span class="fl">${pc.productCategory.name}</span>
                    </div>
                    <div class="zj">
                        <div class="zj_l">
                            <c:forEach items="${pc.productCategoryVList}" var="Vo">
                                <div class="zj_l_c">
                                    <h2>
                                        <a style="font-size: 15px" href="${ctx}/Product?action=queryProducts&categoryId=${Vo.productCategory.id}">${Vo.productCategory.name}</a>
                                    </h2>
                                    <c:forEach items="${Vo.productCategoryVList}" var="Vo2">
                                        <a href="${ctx}/Product?action=queryProducts&categoryId=${Vo2.productCategory.id}">${Vo2.productCategory.name}</a>|
                                    </c:forEach>
                                        <%--                                        <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">巧克力</a>|
                                         <a href="#">口香糖</a>|<a href="#">海苔</a>|<a href="#">鱼干</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|
                                         <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">蜜饯</a>|--%>
                                </div>
                            </c:forEach>
                                <%--                                    <div class="zj_l_c">
                               <h2>零食 / 糖果 / 巧克力</h2>
                               <a href="#">坚果</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">巧克力</a>|
                               <a href="#">口香糖</a>|<a href="#">海苔</a>|<a href="#">鱼干</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|
                               <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">蜜饯</a>|
                           <div class="zj_l_c">
                               <h2>零食 / 糖果 / 巧克力</h2>
                               <a href="#">坚果</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">巧克力</a>|
                               <a href="#">口香糖</a>|<a href="#">海苔</a>|<a href="#">鱼干</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|
                               <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">蜜饯</a>|
                           </div>
                           <div class="zj_l_c">
                               <h2>零食 / 糖果 / 巧克力</h2>
                               <a href="#">坚果</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">巧克力</a>|
                               <a href="#">口香糖</a>|<a href="#">海苔</a>|<a href="#">鱼干</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|
                               <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">蜜饯</a>|
                           </div>
                           <div class="zj_l_c">
                               <h2>零食 / 糖果 / 巧克力</h2>
                               <a href="#">坚果</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">巧克力</a>|
                               <a href="#">口香糖</a>|<a href="#">海苔</a>|<a href="#">鱼干</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|
                               <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">蜜饯</a>|
                           </div>
                           <div class="zj_l_c">
                               <h2>零食 / 糖果 / 巧克力</h2>
                               <a href="#">坚果</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">巧克力</a>|
                               <a href="#">口香糖</a>|<a href="#">海苔</a>|<a href="#">鱼干</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|
                               <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">蜜饯</a>|
                           </div>--%>
                        </div>
                        <div class="zj_r">
                            <a href="#"><img src="${ctx}/front/images/n_img1.jpg" width="236" height="200" /></a>
                            <a href="#"><img src="${ctx}/front/images/n_img2.jpg" width="236" height="200" /></a>
                        </div>
                    </div>
                </li>
            </c:forEach>

            <%--                    <li>--%>
            <%--                        <div class="fj">--%>
            <%--                            <span class="n_img"><span></span><img src="${ctx}/front/images/nav2.png" /></span>--%>
            <%--                            <span class="fl">食品、饮料、酒</span>--%>
            <%--                        </div>--%>
            <%--                        <div class="zj" style="top:-40px;">--%>
            <%--                            <div class="zj_l">--%>
            <%--                                <div class="zj_l_c">--%>
            <%--                                    <h2>零食 / 糖果 / 巧克力2</h2>--%>
            <%--                                    <a href="#">坚果</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">巧克力</a>|--%>
            <%--                                    <a href="#">口香糖</a>|<a href="#">海苔</a>|<a href="#">鱼干</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|--%>
            <%--                                    <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">蜜饯</a>|--%>
            <%--                                </div>--%>
            <%--                                <div class="zj_l_c">--%>
            <%--                                    <h2>零食 / 糖果 / 巧克力</h2>--%>
            <%--                                    <a href="#">坚果</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">巧克力</a>|--%>
            <%--                                    <a href="#">口香糖</a>|<a href="#">海苔</a>|<a href="#">鱼干</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|--%>
            <%--                                    <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">蜜饯</a>|--%>
            <%--                                </div>--%>
            <%--                            </div>--%>
            <%--                            <div class="zj_r">--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img1.jpg" width="236" height="200" /></a>--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img2.jpg" width="236" height="200" /></a>--%>
            <%--                            </div>--%>
            <%--                        </div>--%>
            <%--                    </li>--%>
            <%--                    <li>--%>
            <%--                        <div class="fj">--%>
            <%--                            <span class="n_img"><span></span><img src="${ctx}/front/images/nav3.png" /></span>--%>
            <%--                            <span class="fl">母婴、玩具、童装</span>--%>
            <%--                        </div>--%>
            <%--                        <div class="zj" style="top:-80px;">--%>
            <%--                            <div class="zj_l">--%>
            <%--                                <div class="zj_l_c">--%>
            <%--                                    <h2>零食 / 糖果 / 巧克力3</h2>--%>
            <%--                                    <a href="#">坚果</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">巧克力</a>|--%>
            <%--                                    <a href="#">口香糖</a>|<a href="#">海苔</a>|<a href="#">鱼干</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|--%>
            <%--                                    <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">蜜饯</a>|--%>
            <%--                                </div>--%>
            <%--                            </div>--%>
            <%--                            <div class="zj_r">--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img1.jpg" width="236" height="200" /></a>--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img2.jpg" width="236" height="200" /></a>--%>
            <%--                            </div>--%>
            <%--                        </div>--%>
            <%--                    </li>--%>
            <%--                    <li>--%>
            <%--                        <div class="fj">--%>
            <%--                            <span class="n_img"><span></span><img src="${ctx}/front/images/nav4.png" /></span>--%>
            <%--                            <span class="fl">家居、家庭清洁、纸品</span>--%>
            <%--                        </div>--%>
            <%--                        <div class="zj" style="top:-120px;">--%>
            <%--                            <div class="zj_l">--%>
            <%--                                <div class="zj_l_c">--%>
            <%--                                    <h2>零食 / 糖果 / 巧克力4</h2>--%>
            <%--                                    <a href="#">坚果</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">巧克力</a>|--%>
            <%--                                    <a href="#">口香糖</a>|<a href="#">海苔</a>|<a href="#">鱼干</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|--%>
            <%--                                    <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">蜜饯</a>|--%>
            <%--                                </div>--%>
            <%--                            </div>--%>
            <%--                            <div class="zj_r">--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img1.jpg" width="236" height="200" /></a>--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img2.jpg" width="236" height="200" /></a>--%>
            <%--                            </div>--%>
            <%--                        </div>--%>
            <%--                    </li>--%>
            <%--                    <li>--%>
            <%--                        <div class="fj">--%>
            <%--                            <span class="n_img"><span></span><img src="${ctx}/front/images/nav5.png" /></span>--%>
            <%--                            <span class="fl">美妆、个人护理、洗护</span>--%>
            <%--                        </div>--%>
            <%--                        <div class="zj" style="top:-160px;">--%>
            <%--                            <div class="zj_l">--%>
            <%--                                <div class="zj_l_c">--%>
            <%--                                    <h2>零食 / 糖果 / 巧克力5</h2>--%>
            <%--                                    <a href="#">坚果</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">巧克力</a>|--%>
            <%--                                    <a href="#">口香糖</a>|<a href="#">海苔</a>|<a href="#">鱼干</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|--%>
            <%--                                    <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">蜜饯</a>|--%>
            <%--                                </div>--%>
            <%--                            </div>--%>
            <%--                            <div class="zj_r">--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img1.jpg" width="236" height="200" /></a>--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img2.jpg" width="236" height="200" /></a>--%>
            <%--                            </div>--%>
            <%--                        </div>--%>
            <%--                    </li>--%>
            <%--                    <li>--%>
            <%--                        <div class="fj">--%>
            <%--                            <span class="n_img"><span></span><img src="${ctx}/front/images/nav6.png" /></span>--%>
            <%--                            <span class="fl">女装、内衣、中老年</span>--%>
            <%--                        </div>--%>
            <%--                        <div class="zj" style="top:-200px;">--%>
            <%--                            <div class="zj_l">--%>
            <%--                                <div class="zj_l_c">--%>
            <%--                                    <h2>零食 / 糖果 / 巧克力6</h2>--%>
            <%--                                    <a href="#">坚果</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">巧克力</a>|--%>
            <%--                                    <a href="#">口香糖</a>|<a href="#">海苔</a>|<a href="#">鱼干</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|--%>
            <%--                                    <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">蜜饯</a>|--%>
            <%--                                </div>--%>
            <%--                            </div>--%>
            <%--                            <div class="zj_r">--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img1.jpg" width="236" height="200" /></a>--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img2.jpg" width="236" height="200" /></a>--%>
            <%--                            </div>--%>
            <%--                        </div>--%>
            <%--                    </li>--%>
            <%--                    <li>--%>
            <%--                        <div class="fj">--%>
            <%--                            <span class="n_img"><span></span><img src="${ctx}/front/images/nav7.png" /></span>--%>
            <%--                            <span class="fl">鞋靴、箱包、腕表配饰</span>--%>
            <%--                        </div>--%>
            <%--                        <div class="zj" style="top:-240px;">--%>
            <%--                            <div class="zj_l">--%>
            <%--                                <div class="zj_l_c">--%>
            <%--                                    <h2>零食 / 糖果 / 巧克力7</h2>--%>
            <%--                                    <a href="#">坚果</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">巧克力</a>|--%>
            <%--                                    <a href="#">口香糖</a>|<a href="#">海苔</a>|<a href="#">鱼干</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|--%>
            <%--                                    <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">蜜饯</a>|--%>
            <%--                                </div>--%>
            <%--                            </div>--%>
            <%--                            <div class="zj_r">--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img1.jpg" width="236" height="200" /></a>--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img2.jpg" width="236" height="200" /></a>--%>
            <%--                            </div>--%>
            <%--                        </div>--%>
            <%--                    </li>--%>
            <%--                    <li>--%>
            <%--                        <div class="fj">--%>
            <%--                            <span class="n_img"><span></span><img src="${ctx}/front/images/nav8.png" /></span>--%>
            <%--                            <span class="fl">男装、运动</span>--%>
            <%--                        </div>--%>
            <%--                        <div class="zj" style="top:-280px;">--%>
            <%--                            <div class="zj_l">--%>
            <%--                                <div class="zj_l_c">--%>
            <%--                                    <h2>零食 / 糖果 / 巧克力8</h2>--%>
            <%--                                    <a href="#">坚果</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">巧克力</a>|--%>
            <%--                                    <a href="#">口香糖</a>|<a href="#">海苔</a>|<a href="#">鱼干</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|--%>
            <%--                                    <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">蜜饯</a>|--%>
            <%--                                </div>--%>
            <%--                            </div>--%>
            <%--                            <div class="zj_r">--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img1.jpg" width="236" height="200" /></a>--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img2.jpg" width="236" height="200" /></a>--%>
            <%--                            </div>--%>
            <%--                        </div>--%>
            <%--                    </li>--%>
            <%--                    <li>--%>
            <%--                        <div class="fj">--%>
            <%--                            <span class="n_img"><span></span><img src="${ctx}/front/images/nav9.png" /></span>--%>
            <%--                            <span class="fl">手机、小家电、电脑</span>--%>
            <%--                        </div>--%>
            <%--                        <div class="zj" style="top:-320px;">--%>
            <%--                            <div class="zj_l">--%>
            <%--                                <div class="zj_l_c">--%>
            <%--                                    <h2>零食 / 糖果 / 巧克力9</h2>--%>
            <%--                                    <a href="#">坚果</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">巧克力</a>|--%>
            <%--                                    <a href="#">口香糖</a>|<a href="#">海苔</a>|<a href="#">鱼干</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|--%>
            <%--                                    <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">蜜饯</a>|--%>
            <%--                                </div>--%>
            <%--                            </div>--%>
            <%--                            <div class="zj_r">--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img1.jpg" width="236" height="200" /></a>--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img2.jpg" width="236" height="200" /></a>--%>
            <%--                            </div>--%>
            <%--                        </div>--%>
            <%--                    </li>--%>
            <%--                    <li>--%>
            <%--                        <div class="fj">--%>
            <%--                            <span class="n_img"><span></span><img src="${ctx}/front/images/nav10.png" /></span>--%>
            <%--                            <span class="fl">礼品、充值</span>--%>
            <%--                        </div>--%>
            <%--                        <div class="zj" style="top:-360px;">--%>
            <%--                            <div class="zj_l">--%>
            <%--                                <div class="zj_l_c">--%>
            <%--                                    <h2>零食 / 糖果 / 巧克力10</h2>--%>
            <%--                                    <a href="#">坚果</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">巧克力</a>|--%>
            <%--                                    <a href="#">口香糖</a>|<a href="#">海苔</a>|<a href="#">鱼干</a>|<a href="#">蜜饯</a>|<a href="#">红枣</a>|--%>
            <%--                                    <a href="#">蜜饯</a>|<a href="#">红枣</a>|<a href="#">牛肉干</a>|<a href="#">蜜饯</a>|--%>
            <%--                                </div>--%>
            <%--                            </div>--%>
            <%--                            <div class="zj_r">--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img1.jpg" width="236" height="200" /></a>--%>
            <%--                                <a href="#"><img src="${ctx}/front/images/n_img2.jpg" width="236" height="200" /></a>--%>
            <%--                            </div>--%>
            <%--                        </div>--%>
            <%--                    </li>--%>
        </ul>

