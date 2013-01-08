package br.com.luizbrandao.mvc.logica;

import br.com.luizbrandao.dao.ContatoDAO;
import br.com.luizbrandao.modelo.Contato;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luiz
 */
public class RemoveContatoLogic implements Logica{
    public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception{
        Contato contato = new Contato();
        long id = Long.parseLong(request.getParameter("id"));
        contato.setId(id);

        ContatoDAO dao = new ContatoDAO();
        dao.remover(contato);

        RequestDispatcher rd = request.getRequestDispatcher("/lista-contatos-elegante.jsp");
        rd.forward(request, response);
        System.out.println("Removendo contato ... "+contato.getId());
    }
}