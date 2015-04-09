package com.jivesoftware.services.model.jive;


import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by erwolff on 4/2/15.
 */

@XmlRootElement
public class Result {

    private Integer itemsPerPage;
    private List[] list;

    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(Integer itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    public List[] getList() {
        return list;
    }

    public void setList(List[] list) {
        this.list = list;
    }
}
