package com.willen.restapiwithmongodb.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

    private String text;
    private Date date;
    private AuthoDTO author;

    public CommentDTO() {
    }

    public CommentDTO(String text, Date date, AuthoDTO author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AuthoDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthoDTO author) {
        this.author = author;
    }

}
