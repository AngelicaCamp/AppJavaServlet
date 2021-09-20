package app;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException { }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String mensagem = "Olá Mundo";

        RequestDispatcher disp = req.getRequestDispatcher("index.jsp");

        req.setAttribute("chave",mensagem);

        disp.forward(req,resp);

    }

    @Override
    public void destroy() { }
}
