package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FeedbackServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String type = request.getParameter("type");
        String comments = request.getParameter("comments");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Thank you, " + name + " for your feedback!</h2>");
        out.println("<p><b>Email:</b> " + email + "</p>");
        out.println("<p><b>Feedback Type:</b> " + type + "</p>");
        out.println("<p><b>Comments:</b> " + comments + "</p>");
        out.println("<p><b>Date & Time:</b> " + new Date() + "</p>");
        out.println("</body></html>");
    }
}