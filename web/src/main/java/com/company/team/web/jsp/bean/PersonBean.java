package com.company.team.web.jsp.bean;

import java.io.Serializable;
import java.util.Date;

public class PersonBean implements Serializable {

    //region Constants
    private static final long serialVersionUID = -5326342810436047403L;
    //endregion Constants

    //region Fields
    private String name = "Sandy";

    private Date birthdate = new Date();

    private int age = 18;
    //endregion Fields

    //region Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //endregion Getter & Setter

}
