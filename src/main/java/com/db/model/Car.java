package com.db.model;

import javax.persistence.*;
@Entity //开启正向工程 创建表
@Table(name = "tb_car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "sheep")
    private Double sheep;
    @Column(name = "price")
    private Integer price;

    public Car() {
    }

    public Car(Long id, String name, Double sheep, Integer price) {
        this.id = id;
        this.name = name;
        this.sheep = sheep;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSheep() {
        return sheep;
    }

    public void setSheep(Double sheep) {
        this.sheep = sheep;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sheep=" + sheep +
                ", price=" + price +
                '}';
    }
}
