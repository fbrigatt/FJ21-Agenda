<%-- 
    Document   : lista-contatos-scriptlet
    Created on : 05/04/2011, 15:27:23
    Author     : luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, br.com.luizbrandao.dao.*, br.com.luizbrandao.modelo.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <%
                        ContatoDAO dao = new ContatoDAO();
                        List<Contato> contatos = dao.getLista();
                        for (Contato contato : contatos) {
            %>
            <tr>
                <td><%=contato.getNome()%></td>
                <td><%=contato.getEmail()%></td>
                <td><%=contato.getEndereco()%></td>
                <td><%=contato.getDataNascimento().getTime()%></td>
            </tr>
            <%
                        }
            %>
        </table>
    </body>
</html>
