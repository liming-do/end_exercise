<%--
  Created by IntelliJ IDEA.
  User: zhixing.zzx
  Date: 2020/12/8
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="js/jquery-3.5.0.min.js"></script>
    <script src="js/echarts.min.js"></script>
    <script src="js/bmap.min.js"></script>
    <script type="text/javascript" src="http://api.map.baidu.com/getscript?v=3.0&ak=EOP7HGz2Xo57k59D0Tq6NOTYoeCYiMtP"></script>
    <script src="js/tongji.js"></script>
    <style type="text/css">
        #map-tongji{
            width: 1300px;
            height: 600px;
            margin: auto;
        }
        .anchorBL {
            display: none;
        }
    </style>


</head>
<body>
<%@include file="include-nav.jsp"%>
<div id="map-tongji" ></div>



</body>

</html>
