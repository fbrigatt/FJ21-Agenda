<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="luiz" %>
<c:import url="cabecalho.jsp"/>
        <form action="adicionaContato" method="POST">
            Nome: <input type="text" name="nome" /><br />
            E-mail: <input type="text" name="email" /><br />
            Endereço: <input type="text" name="endereco" /><br />
            Data Nascimento:<luiz:campoData id="dataNascimento"/><br />
            <input type="submit" value="Gravar" />
        </form>
<c:import url="rodape.jsp" />