package com.nick.java.servlets;

import com.nick.java.Formulas;
import com.nick.java.utils.MessagesUtils;
import com.nick.java.utils.StringUtils;

import java.io.IOException;
import java.util.ArrayList;

public class InputDataServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String a = request.getParameter(StringUtils.A);
        String b = request.getParameter(StringUtils.B);
        String c = request.getParameter(StringUtils.C);

        System.out.println(request.getRequestURI());
        if (StringUtils.isBlank(a)){
            request.setAttribute("aErr", MessagesUtils.ERROR_EMPTY);
            request.getRequestDispatcher("result.jsp").forward(request,response);
        }
        if (StringUtils.isBlank(b)){
            request.setAttribute("bErr", MessagesUtils.ERROR_EMPTY);
            request.getRequestDispatcher("result.jsp").forward(request,response);
        }
        if (StringUtils.isBlank(c)){
            request.setAttribute("cErr", MessagesUtils.ERROR_EMPTY);
            request.getRequestDispatcher("result.jsp").forward(request,response);
        }

        try {

            if (Double.parseDouble(a.trim())==0){
                request.setAttribute("letterErr", MessagesUtils.ERROR_A_EQUALS_0);
                request.getRequestDispatcher("result.jsp").forward(request,response);
            }

            double digitA = Double.parseDouble(a);
            double digitB = Double.parseDouble(b);
            double digitC = Double.parseDouble(c);

            double discriminant = Formulas.disctimenant(digitA,digitB,digitC);
            int rootsAmount = Formulas.amuntOfRootsByDisctiminant(discriminant);

            request.setAttribute("A",a.trim());
            request.setAttribute("B",b.trim());
            request.setAttribute("C",c.trim());
            if (rootsAmount>0){
                ArrayList<Double> roots= Formulas.findRootsByDiscriminant(digitA,digitB,digitC);
                if (roots.size()==2){
                    request.setAttribute("discriminant",discriminant);
                    request.setAttribute("root1",roots.get(0));
                    request.setAttribute("root2",roots.get(1));
                    request.setAttribute("message",MessagesUtils.ROOTS_EXIST);
                }else {
                    request.setAttribute("root1",roots.get(0));
                    request.setAttribute("message",MessagesUtils.ROOTS_EXIST);
                }
            }else {
                request.setAttribute("messageNoRoots",MessagesUtils.NO_ROOTS);
            }
            request.getRequestDispatcher("result.jsp").forward(request,response);

        }catch (NumberFormatException e){
            request.setAttribute("letterErr", MessagesUtils.ERROR_LETTER);
            request.getRequestDispatcher("result.jsp").forward(request,response);
        }



    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
