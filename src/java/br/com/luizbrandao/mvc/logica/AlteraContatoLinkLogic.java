package br.com.luizbrandao.mvc.logica;

import br.com.luizbrandao.dao.ContatoDAO;
import br.com.luizbrandao.modelo.Contato;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AlteraContatoLinkLogic implements Logica {

    public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception{
        Contato contato = new Contato();
        long id = Long.parseLong(request.getParameter("id"));
        contato.setId(id);
        contato.setNome(request.getParameter("nome"));
        contato.setEndereco(request.getParameter("endereco"));
        contato.setEmail(request.getParameter("email"));

        String dataEmTexto = request.getParameter("dataNascimento");
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(date);

        contato.setDataNascimento(dataNascimento);

        RequestDispatcher rd = request.getRequestDispatcher("/altera-contato-mvc.jsp");
        rd.forward(request, response);
        System.out.println("Manda para um pagina diferente ... "+contato.getNome());
    }
}