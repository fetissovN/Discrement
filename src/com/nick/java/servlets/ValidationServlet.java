package com.nick.java.servlets;

import com.nick.java.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


@WebServlet(name = "ValidationServlet", urlPatterns = {"/validation"})
public class ValidationServlet extends javax.servlet.http.HttpServlet{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, JSONException {
        response.setContentType("application/json");//Отправляем от сервера данные в JSON -формате
        response.setCharacterEncoding("utf-8");//Кодировка отправляемых данных
        try (PrintWriter out = response.getWriter()) {

            JSONObject jsonEnt = new JSONObject();
            if (StringUtils.isBlank(request.getParameter("digitA"))){
                jsonEnt.put("aErr","fail in a");
//                System.out.println("jdbvsjdbv");
            }
            out.print(jsonEnt.toString());
        }
    }
        protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
            try {
                processRequest(request, response);
            } catch (JSONException ex) {
                Logger.getLogger(ValidationServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
            try {
                processRequest(request, response);
            } catch (JSONException ex) {
                Logger.getLogger(ValidationServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


}
