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
 * lista basica retornando caso queira os valores max e min da mesma.
 * 
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class SimpleTag extends SimpleTagSupport {

    private String min;
    private String max;
    private List<Comparable> listToSort;
    private String outPutList;
    private List<Comparable> sortedList;

    /**
     *
     * @throws JspException
     * @throws IOException
     */
    @Override
    public void doTag() throws JspException, IOException {
        sortedList = listToSort;
        Collections.sort(sortedList);
        this.getJspContext().setAttribute(outPutList, getSortedList());
        if (!getListToSort().isEmpty()) {
            if (min != null) {
                this.getJspContext().setAttribute(min, getSortedList().get(0));
            }
            if (max != null) {
                this.getJspContext().setAttribute(max, getSortedList().get(getSortedList().size() - 1));
            }
        }

    }

    /**
     *
     * @return
     */
    public String getMin() {
        return min;
    }

    /**
     *
     * @param min
     */
    public void setMin(String min) {
        this.min = min;
    }

    /**
     *
     * @return
     */
    public String getMax() {
        return max;
    }

    /**
     *
     * @param max
     */
    public void setMax(String max) {
        this.max = max;
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
    public String getOutPutList() {
        return outPutList;
    }

    /**
     *
     * @param outPutList
     */
    public void setOutPutList(String outPutList) {
        this.outPutList = outPutList;
    }

    /**
     *
     * @return
     */
    public List<Comparable> getSortedList() {
        return sortedList;
    }

    /**
     *
     * @param sortedList
     */
    public void setSortedList(List<Comparable> sortedList) {
        this.sortedList = sortedList;
    }

}
