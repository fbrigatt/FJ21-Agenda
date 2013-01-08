<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="luiz" %>

<c:import url="cabecalho.jsp"/>
Formulário para alteração de contatos:<br/>
<form action="mvc" method="POST">
    Id:
    <input type="text" name="id"s/><br/>
    Nome:
    <input type="text" name="nome"/><br/>
    E-mail:
    <input type="text" name="email"/><br/>
    Endereço: <input type="text" name="endereco"/><br/>
    Data de Nascimento: <luiz:campoData id="dataNascimento" />
    <input type="hidden" name="logica" value="AlteraContatoLogic"/>
    <input type="submit" value="Enviar"/>
</form>
<c:import url="rodape.jsp" />