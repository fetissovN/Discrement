
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Enter Data</title>
    <link rel="stylesheet" type="text/css" href="css/app.css">
  </head>
  <body>
  <div align="center" class="row">
    <div class="medium-6 medium-centered large-4 large-centered columns">

      <form action="/data" method="post">
        <div class="row column log-in-form">
          <h2 class="text-center">Set a,b,c</h2>
          <%--<span style="color: red">${wrongLogin}</span>--%>
          <h4 class="text-center">Example: ax^2+bx+c</h4>
           <span style="color: red">${letterErr}</span>
          <label>a:
            <input type="text" name="a" placeholder="3"><span style="color: red">${aErr}</span>
          </label>
          <label>b:
            <input type="text"  name="b" placeholder="5"><span style="color: red">${bErr}</span>
          </label>
          <label>c:
            <input type="text"  name="c" placeholder="1"><span style="color: red">${cErr}</span>
          </label>
          <input type="submit" class="button" value="Calculate">

        </div>
      </form>
    </div>
  </div>
  </body>
</html>
