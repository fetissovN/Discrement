
$(document).ready(function(){
    $(".button").click(function(){
        alert("asdasd");
        var data = {};
        data = {"digitA":$(".a").val(), "digitB":$(".b").val(), "digitC":$(".c").val()};

        $.ajax
        ({
            type: "POST",//Метод передачи
            data: data,//Передаваемые данные в JSON - формате
            url: 'http://127.0.0.1:3030/validation',//Название сервлета
            success:function(serverData)//Если запрос удачен
            {
                // $("#auth-info").css({"background-color":serverData.backgroundColor, "height": "50px", "color":"white"});
                $(".a").html(serverData.aErr);
            },
            error: function(e)//Если запрос не удачен
            {
                $("#auth-info").css({"background-color":"#CC6666", "height": "50px", "color":"white"});
                $("#auth-info").html("Запрос не удался!");
            }
        });
    });
});


