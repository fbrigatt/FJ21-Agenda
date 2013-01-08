package br.com.luizbrandao.mvc.logica;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luiz
 */
public class PrimeiraLogica implements Logica {
    public void executa(HttpServletRequest req,HttpServletResponse res) throws Exception{
        System.out.println("Executando a logica e redirecionando...");

        RequestDispatcher rd = req.getRequestDispatcher("/primeira-logica.jsp");
        rd.forward(req, res);
    }
}