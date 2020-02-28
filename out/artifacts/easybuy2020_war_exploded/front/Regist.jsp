<%--
  Created by IntelliJ IDEA.
  User: 张扫静
  Date: 2020/2/24
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script type="text/javascript">
    var contextPath = "${ctx}";
</script>
<head>
<%--    <script type="text/javascript" src="${ctx}/front/js/regist/regist.js"></script>--%>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link type="text/css" rel="stylesheet" href="${ctx}/front/css/style.css" />
    <!--[if IE 6]>
    <script src="${ctx}/front/js/iepng.js" type="text/javascript"></script>
    <script type="text/javascript">
        EvPNG.fix('div, ul, img, li, input, a');
    </script>
    <![endif]-->
    <script type="text/javascript" src="${ctx}/front/js/jquery-1.11.1.min_044d0927.js"></script>
    <script type="text/javascript" src="${ctx}/front/js/jquery.bxslider_e88acd1b.js"></script>

    <script type="text/javascript" src="${ctx}/front/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="${ctx}/front/js/menu.js"></script>

    <script type="text/javascript" src="${ctx}/front/js/select.js"></script>

    <script type="text/javascript" src="${ctx}/front/js/lrscroll.js"></script>

    <script type="text/javascript" src="${ctx}/front/js/iban.js"></script>
    <script type="text/javascript" src="${ctx}/front/js/fban.js"></script>
    <script type="text/javascript" src="${ctx}/front/js/f_ban.js"></script>
    <script type="text/javascript" src="${ctx}/front/js/mban.js"></script>
    <script type="text/javascript" src="${ctx}/front/js/bban.js"></script>
    <script type="text/javascript" src="${ctx}/front/js/hban.js"></script>
    <script type="text/javascript" src="${ctx}/front/js/tban.js"></script>

    <script type="text/javascript" src="${ctx}/front/js/lrscroll_1.js"></script>


    <title>注册</title>
</head>
<body>
<!--Begin Header Begin-->
<div class="soubg">
    <div class="sou">
        <span class="fr">
        	<span class="fl">你好，请<a href="login.jsp">登录</a>&nbsp; <a href="${ctx}/front/Regist.jsp" style="color:#ff4e00;">免费注册</a>&nbsp; </span>
            <span class="fl">|&nbsp;关注我们：</span>
            <span class="s_sh"><a href="#" class="sh1">新浪</a><a href="#" class="sh2">微信</a></span>
            <span class="fr">|&nbsp;<a href="#">手机版&nbsp;<img src="${ctx}/front/images/s_tel.png" align="absmiddle" /></a></span>
        </span>
    </div>
</div>
<!--End Header End-->
<!--Begin Login Begin-->
<div class="log_bg">
    <div class="top">
        <div class="logo"><a href="home.jsp"><img src="${ctx}/front/images/logo.png" /></a></div>
    </div>
    <div class="regist">
        <div class="log_img"><img src="${ctx}/front/images/l_img.png" width="611" height="425" /></div>
        <div class="reg_c">
            <form>
                <table border="0" style="width:420px; font-size:14px; margin-top:20px;" cellspacing="0" cellpadding="0">
                    <tr height="50" valign="top">
                        <td width="95">&nbsp;</td>
                        <td>
                            <span class="fl" style="font-size:24px;">注册</span>
                            <span class="fr">已有商城账号，<a href="login.jsp" style="color:#ff4e00;">我要登录</a></span>
                        </td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>登录用户名 &nbsp;</td>
                        <td><input type="text" value="" name="loginName" class="l_user"/></td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>&nbsp;密码 &nbsp;</td>
                        <td><input type="password" value="" name="password" class="l_pwd"/></td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>&nbsp;确认密码 &nbsp;</td>
                        <td><input type="password" value="" name="confirmPassword" class="l_pwd"/></td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>&nbsp;真实姓名 &nbsp;</td>
                        <td><input type="text" value="" name="userName" class="l_user"/></td>
                    </tr>
                    <tr height="50">
                        <td align="right"><font color="#ff4e00">*</font>&nbsp;性别 &nbsp;</td>
                        <td>
                            <input type="radio" name="sex" value="1" checked="checked">&nbsp;男&nbsp;&nbsp;
                            <input type="radio" name="sex" value="0">&nbsp;女
                        </td>
                    </tr>

                    <tr height="50">
                        <td align="right">&nbsp;身份证号 &nbsp;</td>
                        <td><input type="text" value="" name="identityCode" class="l_user"/></td>
                    </tr>
                    <tr height="50">
                        <td align="right">&nbsp;邮箱 &nbsp;</td>
                        <td><input type="text" value="" name="email" class="l_email"/></td>
                    </tr>
                    <tr height="50">
                        <td align="right">&nbsp;手机 &nbsp;</td>
                        <td><input type="text" value="" name="mobile" class="l_tel"/></td>
                    </tr>
<%--                    <tr height="50">--%>
<%--                        <td align="right"> <font color="#ff4e00">*</font>&nbsp;验证码 &nbsp;</td>--%>
<%--                        <td>--%>
<%--                            <input type="text" value="" class="l_ipt" />--%>
<%--                            <a href="#" style="font-size:12px; font-family:'宋体';">换一张</a>--%>
<%--                        </td>--%>
<%--                    </tr>--%>
                    <tr>
                        <td>&nbsp;</td>
                        <td style="font-size:12px; padding-top:20px;">
                	<span style="font-family:'宋体';" class="fl">
                    	<label class="r_rad"><input type="checkbox" /></label><label class="r_txt">我已阅读并接受《用户协议》</label>
                    </span>
                        </td>
                    </tr>
                    <tr height="60">
                        <td>&nbsp;</td>
                        <td><input type="submit" value="立即注册" class="log_btn" onclick="register();"/></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
<!--End Login End-->
<!--Begin Footer Begin-->
<div class="btmbg">
    <div class="btm">
        备案/许可证编号：蜀ICP备12009302号-1-www.dingguagua.com   Copyright © 2015-2018 尤洪商城网 All Rights Reserved. 复制必究 , Technical Support: Dgg Group <br />
        <img src="images/b_1.gif" width="98" height="33" /><img src="images/b_2.gif" width="98" height="33" /><img src="images/b_3.gif" width="98" height="33" /><img src="images/b_4.gif" width="98" height="33" /><img src="images/b_5.gif" width="98" height="33" /><img src="images/b_6.gif" width="98" height="33" />
    </div>
</div>
<!--End Footer End -->
<script type="text/javascript">
    function register() {
        //获取相关字段的值
        var loginName = $("input[name='loginName']").val();
        var userName = $("input[name='userName']").val();
        var password = $("input[name='password']").val();
        var confirmPassword = $("input[name='confirmPassword']").val();
        var email = $("input[name='email']").val();
        var mobile = $("input[name='mobile']").val();
        var identityCode = $("input[name='identityCode']").val();
        var address = $("input[name='address']").val();
        var sex = $("input[name='sex']:checked").val();
        //判断密码是否一致
        if(loginName==null || loginName==""){
            alert("用户名不能为空.");
            return;
        }

        if(loginName.length<2 || loginName>10){
            alert("登录名不能小于两个字符或者大于十个字符.");
            return;
        }

        if(userName==null || userName==""){
            alert("真实姓名不能为空.");
            return;
        }

        if(userName.length<2 || userName>10){
            alert("真实姓名不能小于两个字符或者大于十个字符.");
            return;
        }

        if (password != confirmPassword) {
            alert("两次输入的密码不一致.");
            return;
        }
        //判断密码是否为空
        if (password =="") {
            alert("密码不能为空");
            return;
        }
        //验证邮箱格式
        if(email!=null && email!="" && !checkMail(email)){
            alert("邮箱格式不正确");
            return;
        }
        //验证邮箱格式
        if(mobile!=null && mobile!="" && !checkMobile(mobile)){
            alert("手机格式不正确");
            return;
        }
        //验证邮箱格式
        if(identityCode!=null && identityCode!="" && !checkIdentityCode(identityCode)){
            alert("身份证号格式不正确");
            showMessage()
            return;
        }
        $.ajax({
            url:contextPath + "/Register",
            dataType:"json",
            method: "post",
            data: {
                action: "login",
                loginName: loginName,
                userName: userName,
                password: password,
                sex: sex,
                email: email,
                mobile: mobile,
                action: 'saveUserToDatabase',
                identityCode: identityCode,
                address: address
            },
            success: function (json) {

                     var result = eval("(" + json + ")");
                     if (result.status == 1) {
                         alert("成功")
                          showMessage(result.message);

                 } else {
                     alert("失败")
                     showMessage(json.message);
                 }
            },error:function () {
                alert("error")
            }
        })
    }


    function checkMail(mail) {
        var filter  = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
        if (filter.test(mail))
            return true;
        else {
            return false;}
    }

    function checkMobile(phone) {
        var filter  = /^\d{5,11}$/;
        if (filter.test(phone))
            return true;
        else {
            return false;
        }
    }

    function checkIdentityCode(identityCode) {
        var filter  = /^\w{18}$/;
        if (filter.test(identityCode))
            return true;
        else {
            return false;
        }
    }

</script>
</body>


<!--[if IE 6]>
<script src="//letskillie6.googlecode.com/svn/trunk/2/zh_CN.js"></script>
<![endif]-->
</html>
