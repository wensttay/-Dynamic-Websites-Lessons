/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.psd.tagfile;

import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * Classe para testar uma Tag do tipo Classic com váriaveis internas que não
 * devem ser printadas fora da mesma.
 * 
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class ClassicTag extends TagSupport {

    /**
     *
     * @return
     */
    @Override
    public int doStartTag() {
        this.pageContext.setAttribute("Cidade", "Cajazeiras");
        this.pageContext.setAttribute("Estado", "Paraiba");
        this.pageContext.setAttribute("Pais", "Brasil");
        return Tag.EVAL_BODY_INCLUDE;
    }

    /**
     *
     * @return
     */
    @Override
    public int doEndTag() {
        this.pageContext.removeAttribute("Cidade");
        this.pageContext.removeAttribute("Estado");
        this.pageContext.removeAttribute("Pais");
        return Tag.EVAL_BODY_INCLUDE;
    }
}
