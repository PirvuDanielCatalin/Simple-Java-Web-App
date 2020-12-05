<%@page language="java" import="java.util.*" %>
<%@page import="java.util.List" %>
<%@page import="java.util.Iterator" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Result</title>
</head>
<body>
<center>
    <h1>
        Available Data
    </h1>
    <br>We have<br><br>
    <%
        List result = (List) request.getAttribute("data");
        Iterator it = result.iterator();

        while (it.hasNext()) {
            System.out.println(it.next() + "<br>");
        }
    %>
</center>
</body>
</html>
