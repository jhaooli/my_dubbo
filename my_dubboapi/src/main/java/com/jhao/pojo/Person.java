package com.jhao.pojo;

import java.io.Serializable;

/**
 * pojo
 * @author      jhao
 * @param
 * @return
 * @exception
 * @date        2018/12/14 20:51
 */
public class Person implements Serializable{

    private static final long serialVersionUID = -5809782578272943999L;

    private String name;//名字

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
