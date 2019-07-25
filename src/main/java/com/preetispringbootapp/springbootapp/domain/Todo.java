package com.preetispringbootapp.springbootapp.domain;

import javax.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    @Column
    private  String title;

    public Todo()
    {

    }

    public Long getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;

    }

}
