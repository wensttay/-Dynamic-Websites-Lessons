/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.psd.tagfile;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Classe para testar o SkipPageException de um SimpleTag
 * 
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class SkipPage extends SimpleTagSupport {

    /**
     *
     * @throws IOException
     * @throws JspException
     */
    @Override
    public void doTag() throws IOException, JspException {
        throw new SkipPageException();
    }
}
