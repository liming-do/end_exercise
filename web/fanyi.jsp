<%--
  Created by IntelliJ IDEA.
  User: zhixing.zzx
  Date: 2020/12/14
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.5.0.min.js"></script>
    <script src="js/fanyi.js"></script>
    <style>
        #yuan-select,
        #to-select{
            width: 120px;
            text-align: justify;
            text-align-last: justify;
        }

    </style>
</head>
<body>
<%@include file="include-nav.jsp"%>
<div id="fanyi">
    <select id="yuan-select" >
        <option value="">选择源语言</option>
    </select>
    <select id="to-select">
        <option value="">选择目标语言</option>
    </select>
    <button id="fanyi-button">
        翻译
    </button>

</div>
<span id="error"></span>
<div id="text">
    <textarea id="yuan-text" rows="15" cols="100" placeholder="输入源语言" maxlength="6000"></textarea>
    <textarea id="to-text" rows="15" cols="100" placeholder="目标语言" ></textarea>
    <img src="images/copy.png" id="copy" title="复制全部">

</div>
</body>
</html>
