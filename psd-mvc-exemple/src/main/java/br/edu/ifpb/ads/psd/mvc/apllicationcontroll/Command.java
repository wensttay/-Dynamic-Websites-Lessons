/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.psd.mvc.apllicationcontroll;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Interface que define os metodos que todo Controle de Aplicação deve executar.
 * 
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public interface Command {

    /**
     * Metodo para executar a funcionalidade especifica do controlador de
     * Aplicação ao qual foi implementado.
     *
     * @param request Variavel de requisição
     * @param response Variavle de resposta
     * @throws ServletException
     * @throws IOException
     */
    public void execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;
}
