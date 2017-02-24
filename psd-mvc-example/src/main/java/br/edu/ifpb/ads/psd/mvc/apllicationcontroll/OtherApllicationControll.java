/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.psd.mvc.apllicationcontroll;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class OtherApllicationControll implements Command {

    /**
     * @see Command
     * @param request
     * @param response
     *
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("nome");
        request.setAttribute("resposta", "O que fazer agora " + user + "?");
        RequestDispatcher dispatcher = request.getRequestDispatcher("resposta.jsp");
        dispatcher.forward(request, response);
    }

}
