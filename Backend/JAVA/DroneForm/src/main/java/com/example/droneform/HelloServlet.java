package com.example.droneform;

import java.io.*;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    private String message;

    /*public void init() {
        message = "Hello World!";
    }*/

    /*public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }*/

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.write("<html>");
        out.write("<head><title>Registrado!</title>");
        out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">");
        out.write("</head>");
        out.write("<body>");
        out.write("<div class='centro'>");


        String name = request.getParameter("name");
        String user = request.getParameter("user");
        String email = request.getParameter("email");
        String validationRegex = "^[a-zA-Z\\s]+";
        if(name.matches(validationRegex) && user.matches(validationRegex) && email.matches(validationRegex)) {
            Player player = new Player();
            player.setName(name);
            player.setUser(user);
            player.setEmail(email);

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(player);
            em.getTransaction().commit();


            out.write("<h2>Guardado!</h1>");

            /*
            out.write("<table border ='1'>");
            out.write("<tr>");
            out.write("<th>Nombre:          </th>");
            out.write("<th>Nombre de usuario: </th>");
            out.write("<th>Email: </th>");
            out.write("</tr>");



            List<Player> players = em
                    .createQuery("Select p from Player p", Player.class)
                    .getResultList();
            for (Player p: players) {
                out.write("<tr>");
                out.write("<td>" + p.getName() +"</td>");
                out.write("<td>" + p.getUser() +"</td>");
                out.write("<td>" + p.getEmail() +"</td>");
                out.write("</tr>");
            }

            out.write("</table>");*/

        } else {
            out.write("<h2>Revisa que los datos ingresados sean correctos</h1>");
        }

        out.write("<br><a href=\"index.jsp\">Regresar al form</a>");
        out.write("</div>");
        out.write("</body></html>");
    }

    public void destroy() {
    }
}