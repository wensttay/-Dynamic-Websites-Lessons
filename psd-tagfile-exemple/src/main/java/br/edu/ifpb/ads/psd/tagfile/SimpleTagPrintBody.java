/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.psd.tagfile;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Classe para testar uma Tag do tipo Simples ordenação de
 * lista basica retornando o conteudo do Body da Tag.
 * 
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class SimpleTagPrintBody extends SimpleTagSupport {

    private List<Comparable> listToSort;
    private String currectElement;
    private List<Comparable> sortedList;

    /**
     *
     * @throws IOException
     * @throws JspException
     */
    @Override
    public void doTag() throws IOException, JspException {
        if (listToSort != null && !listToSort.isEmpty()) {
            sortedList = listToSort;
            Collections.sort(sortedList);

            for (Comparable c : sortedList) {
                getJspContext().setAttribute(currectElement, c);
                getJspBody().invoke(null);
            }
        }

    }

    /**
     *
     * @return
     */
    public List<Comparable> getListToSort() {
        return listToSort;
    }

    /**
     *
     * @param listToSort
     */
    public void setListToSort(List<Comparable> listToSort) {
        this.listToSort = listToSort;
    }

    /**
     *
     * @return
     */
    public String getCurrectElement() {
        return currectElement;
    }

    /**
     *
     * @param currectElement
     */
    public void setCurrectElement(String currectElement) {
        this.currectElement = currectElement;
    }

}
