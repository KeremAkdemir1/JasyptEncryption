package com.example.mysqllesson.entities;

import com.example.mysqllesson.config.Encryptor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Getter
@Setter
@ToString
@Table(name = "customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column
    @Convert(converter = Encryptor.class)
    private String name;
    @Column
    @Convert(converter = Encryptor.class)
    private String lastName;
}
