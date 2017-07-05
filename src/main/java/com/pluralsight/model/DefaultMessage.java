package com.pluralsight.model;


public class DefaultMessage implements Message {
    public DefaultMessage(String message) {
        this.message = message;
    }

    private String message = "Spring is fun.";

    private Integer COUNTER2 = 10;

    /**
     * Gets message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     */
    public void setMessage(String message) {
        this.message = message;
    }


    public Integer getCOUNTER() {
        return COUNTER2;
    }

    public void setCOUNTERMETHOD(Integer counter) {
        this.COUNTER2 = counter;
    }
}