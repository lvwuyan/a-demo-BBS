// JavaScript Document
function show(t)
{
    var xmlhttp;
    if (window.XMLHttpRequest)
    {
        //  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
        xmlhttp=new XMLHttpRequest();
    }
    else
    {
        // IE6, IE5 浏览器执行代码
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange=function()
    {
        if (xmlhttp.readyState==4 && xmlhttp.status==200)
        {
            var data = xmlhttp.responseText;
            document.getElementById("content").innerHTML = data;
        }
    }
    if(t==1){xmlhttp.open("GET","../kt.jsp",true);}
    else if(t==2){xmlhttp.open("GET","",true);}
    else if(t==3){xmlhttp.open("GET","",true);}
    else if(t==4){xmlhttp.open("GET","",true);}

    xmlhttp.send();
}