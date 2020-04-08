<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>ajax</title>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"hanfan","password":"123","age":30}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        alert(data.username);
                        alert(data.password);
                        alert(data.age);
                    }
                });
            });
        });
    </script>
</head>
<body>
<h2>Hello World!</h2>
<a href="hello">Success</a><br>
<button id="btn">发送ajax请求</button>
</body>
</html>
