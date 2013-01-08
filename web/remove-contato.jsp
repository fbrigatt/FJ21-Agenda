<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="cabecalho.jsp"/>
Formulário para remoção de contatos:<br/>
<form action="mvc" method="POST">
    Id:
    <input type="text" name="id"/><br/>
    <input type="hidden" name="logica" value="RemoveContatoLogic"/>
    <input type="submit" value="Enviar"/>
</form>
<c:import url="rodape.jsp" />
