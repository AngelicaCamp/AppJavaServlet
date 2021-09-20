package app;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/requisicao")
public class Requisicao extends HttpServlet {

    @Override
    public void init() throws ServletException { }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String metodo = req.getMethod();
        String uri = req.getRequestURI();
        String protocolo = req.getProtocol();

        List<String> listaRequisicao = new ArrayList<>();
        listaRequisicao.add(metodo);
        listaRequisicao.add(uri);
        listaRequisicao.add(protocolo);

        RequestDispatcher disp = req.getRequestDispatcher("requisicao.jsp");

        req.setAttribute("lista-requisicao",listaRequisicao);

        disp.forward(req,resp);
    }

    @Override
    public void destroy() { }

}