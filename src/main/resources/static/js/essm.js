/*每次刷新页面都要去检查cookie是否存在，然后判断用户名啥的*/
window.onload=function () {
    if ($.cookie("cookie") != null) {
        var cookie = $.cookie("cookie");
        if (cookie == "true") {
            $('#btn').css("display","none");
            $('#btn_user').text($.cookie("u_cookie"));
            $('#btn_user').css("display","inline");
        }
    }
}