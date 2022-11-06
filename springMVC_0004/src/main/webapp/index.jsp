<%--
  Created by IntelliJ IDEA.
  User: Sky
  Date: 2022/11/2
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <script src="js/jquery-3.6.1.js"></script>
</head>
<body>
<a href="javascript:show()">访问服务器获取学生集合</a>
<div id="myDiv">请等待</div>

</body>
<script type="text/javascript">
    function show() {
        $.ajax({
            url:"${pageContext.request.contextPath}/student.action",
            dataType:"json",
            type:"get",
            success:function (list) {
                //  alert(list);
                var s="";
                $.each(list,function (i,stu) {
                    //  alert(stu);
                    s+=stu.name+"----"+stu.age+"<br>";
                });
                $("#myDiv").html(s);

            }
        });
    }

</script>
</html>
