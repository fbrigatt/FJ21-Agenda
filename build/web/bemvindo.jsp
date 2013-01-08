<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Primeiro JSP Rodando</title>
    </head>
    <body>
        <%
                    String mensagem = "Bem vindo ao sistema de agenda do FJ-21!";
        %>
        <% out.println(mensagem);%><br />
        <%
                    String desenvolvido = "Desenvolvido por (Luiz Brandao)";
        %>
        <%= desenvolvido%><br />
        <%
                    System.out.println("Tudo foi executado!");
        %>
    </body>
</html>