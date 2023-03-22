package com.xyz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "CITY")
public class City {
    @Id
    private final int id;
    private final String name;
}
