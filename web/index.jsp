
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
        <title>Enter Data</title>
        <link rel="stylesheet" type="text/css" href="css/app.css">
      <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
        <%--<script type="text/javascript" src="/WEB-INF/js/ajax.js"></script>--%>
        <script type="text/javascript">
            $(document).ready(function(){
                $(".submit").on('click',function(e){
                    e.preventDefault();
//                    var fieldValue = $('input[name="a"]').val();
                    var data = {"digitA":$('input[name="a"]').val(), "digitB":$('input[name="b"]').val(), "digitC":$('input[name="c"]').val()};
//                    alert(fieldValue);

                    $.ajax({
                        type: "POST",//Метод передачи
                        data: data,//Передаваемые данные в JSON - формате
                        url: 'http://127.0.0.1:3030/validation',//Название сервлета
                        success:function(serverData)//Если запрос удачен
                        {
                            alert('success');
                            // $("#auth-info").css({"background-color":serverData.backgroundColor, "height": "50px", "color":"white"});
                            $("#errorA").appendData(serverData.aErr);

                        },
                        error: function(e)//Если запрос не удачен
                        {
                            alert('fail');
                        }
                    });
                });
            });
        </script>

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
            <input type="text" name="a" placeholder="3"><span id="errorA" style="color: red">${aErr}</span>
          </label>
          <label>b:
            <input type="text"  name="b" placeholder="5"><span style="color: red">${bErr}</span>
          </label>
          <label>c:
            <input type="text"  name="c" placeholder="1"><span style="color: red">${cErr}</span>
          </label>
          <input type="submit" id="buttonSent" class="submit" value="Calculate">

        </div>
      </form>
    </div>
  </div>
  </body>
</html>
