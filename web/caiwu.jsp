<%--
  Created by IntelliJ IDEA.
  User: zhixing.zzx
  Date: 2020/12/9
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="js/jquery-3.5.0.min.js"></script>

<style>
    body{
        background-image: url("images/money.jpg");
    }
    #main{
        width: 400px;
        height: 300px;
        margin: 250px 60px;
    }
    .bank {
        list-style-type: none;
        text-align: center;
        list-style: none;
        margin: 0;
        padding: 0;
        width: 200px;
        background-color: #f1f1f1;
    }

    .bank li a {
        display: block;
        color: #000;
        padding: 8px 16px;
        text-decoration: none;
    }

    /* 鼠标移动到选项上修改背景颜色 */
    .bank li a:hover {
        background-color: #555;
        color: white;
    }
</style>
<script type="text/javascript">
$(document).ready(function () {
    $("#money_yue").click(function () {
        $.ajax({
            type: "post",
            url: "getYuE.do",
            data: {},
            dataType: "json",
            success: function(response) {
                alert(response.money);
            }
        });
    })
})

</script>
<body>
<%@include file="include-nav.jsp"%>
<div id="main">
    <ul class="bank">
        <li><a href="zhuanzhang.jsp">转账</a></li>
        <li><a href="qukuan.jsp">取钱</a></li>
        <li><a id="money_yue" >查询余额</a></li>
        <li><a href="detail.jsp">查询明细</a></li>
        <li><a href="main.jsp">退出</a></li>
    </ul>
</div>
</body>
</html>
