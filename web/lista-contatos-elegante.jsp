<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:import url="cabecalho.jsp"/>
<jsp:useBean id="dao" class="br.com.luizbrandao.dao.ContatoDAO"/>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Nome</td>
        <td>Email</td>
        <td>Endereço</td>
        <td>Data de Nascimento</td>
        <td>Ações</td>
    </tr>
    <!-- percorre contatos montando as linhas da tabela -->
    <c:forEach var="contato" items="${dao.lista}">
        <tr>
            <td>${contato.id}</td>
            <td>${contato.nome}</td>
            <td>
                <c:choose>
                    <c:when test="${not empty contato.email}">
                        <a href="mailto:${contato.email}">${contato.email}</a>
                    </c:when>
                    <c:otherwise>
                        Email não informado
                    </c:otherwise>
                </c:choose>
            </td>
            <td>${contato.endereco}</td>
            <td><fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy"/></td>
            <td><a href="mvc?logica=AlteraContatoLinkLogic&id=${contato.id}">Alterar</a></td>
            <td><a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">Excluir</a></td>
        </tr>
    </c:forEach>
</table>
<c:import url="rodape.jsp"/>