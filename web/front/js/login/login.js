//登录的方法
function login() {
    var loginName=$("#loginName").val();
    var password=$("#password").val();
    $.ajax({
        url:contextPath+"/login",
        dataType:"json",
        type:"post",
        data:{loginName:loginName,password:password,action:"login"},
        success:function(json) {
            if (json.status == 1) {
                window.location.href = contextPath + "/home?action=index";
            } else {
                showMessage(json.message)
            }
        },error:function () {
            alert("error");
        }
    })
}