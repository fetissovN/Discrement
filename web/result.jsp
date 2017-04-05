<%--
  Created by IntelliJ IDEA.
  User: Николай
  Date: 02.04.2017
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
    <link rel="stylesheet" type="text/css" href="WEB-INF/css/app.css">
    <%--<script type="text/javascript" src="/WEB-INF/js/ajax.js"></script>--%>
</head>
<body>
    <div>
        <h3 align="center">Input data: a=${A} b=${B} c=${C} </h3>
        <h3 align="center">${message}</h3><h3 align="center">${messageNoRoots}</h3>
        <h3 align="center">${root1}</h3>
        <h3 align="center">${root2}</h3>
        <h3 align="center">Discriminant equals:</h3>
        <h3 align="center">${discriminant}</h3>

        <jsp:include page="index.jsp"></jsp:include>
        <%--<div align="center">--%>
            <%--<form action="/data" method="post">--%>
                <%--<div class="row column log-in-form">--%>
                    <%--<h2 class="text-center">Set new a,b,c</h2>--%>
                    <%--&lt;%&ndash;<span style="color: red">${wrongLogin}</span>&ndash;%&gt;--%>
                    <%--<h4 class="text-center">Example: ax^2+bx+c</h4>--%>
                    <%--<span style="color: red">${letterErr}</span>--%>
                    <%--<label>a:--%>
                        <%--<input type="text" name="a" placeholder="3"><span style="color: red">${aErr}</span>--%>
                    <%--</label>--%>
                    <%--<label>b:--%>
                        <%--<input type="text"  name="b" placeholder="5"><span style="color: red">${bErr}</span>--%>
                    <%--</label>--%>
                    <%--<label>c:--%>
                        <%--<input type="text"  name="c" placeholder="1"><span style="color: red">${cErr}</span>--%>
                    <%--</label>--%>
                    <%--<input type="submit" class="button" value="Calculate">--%>

                <%--</div>--%>
            <%--</form>--%>
        <%--</div>--%>




    </div>
</body>
</html>
