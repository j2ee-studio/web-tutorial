package com.company.team.web.jsp.bean;

import java.io.Serializable;
import java.util.Date;

public class MessageBean implements Serializable {

    //region Constants
    private static final long serialVersionUID = -547946799441273173L;
    //endregion Constants

    //region Fields
    private String message;
    //endregion Fields

    //region Getter & Setter

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //endregion Getter & Setter

}
