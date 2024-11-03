package com.boxer.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class HelloDTO {
    @NotNull(message = "Field cannot be null")
    private String email;

//    @DateFormat(message = "eventDate日期格式错误")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date eventDate;

//    @DateFormat(message = "startDate 日期格式错误")
    private String startDate;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
}
