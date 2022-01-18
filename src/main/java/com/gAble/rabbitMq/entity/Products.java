package com.gAble.rabbitMq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Products implements Serializable {
    @Id
    private String id;
    private String name;
    private Integer items;
}
