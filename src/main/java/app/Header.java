package app;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/header")
public class Header extends HttpServlet {

    @Override
    public void init() throws ServletException { }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String host = req.getHeader("host");
        String agente_usuario = req.getHeader("user-agent");
        String encoding = req.getHeader("accept-encoding");
        String language = req.getHeader("accept-language");

        // Lista de informações (cabeçalho)
        List<String> listaHeader = new ArrayList<>();
        listaHeader.add(host);
        listaHeader.add(agente_usuario);
        listaHeader.add(encoding);
        listaHeader.add(language);

        // Enviar para ser carregada na JSP (pagina dinâmica)
        RequestDispatcher disp = req.getRequestDispatcher("header.jsp");

        // Coloca a lista dentro de um request (chave e objeto) como atributo
        req.setAttribute("lista-header",listaHeader);

        // Encaminha a req e resp ao JSP
        disp.forward(req,resp);

    }

    @Override
    public void destroy() { }

} // fim class





