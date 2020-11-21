package com.example.demo.entity;


import javax.persistence.*;

@Entity
@Table(name = "tbl_user")
public class User {
    @Id//设置主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;

    @Column(name = "last_name",length = 50)//和数据表对应的一个列
    private String lastName;
    @Column//省略，默认列名就是属性名
    private String emil;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }
}
