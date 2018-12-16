package com.subrsa.spring.model;


import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

@Entity
@Data
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "pass")
    private String pass;
    @Column(name = "alive")
    private Boolean alive;
}
