package com.xyz.entity;

import com.xyz.model.City;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "THEATRE")
public class Theatre {
    @Id
    private final String id;
    private final String name;
    @OneToMany(mappedBy = "theatre")
    private final List<Screen> screens;
    private final City city;
}
