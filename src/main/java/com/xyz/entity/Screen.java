package com.xyz.entity;

import com.xyz.model.Theatre;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "SCREEN")
public class Screen {
    @Id
    private final int id;
    private final String name;
    @ManyToOne
    @JoinColumn(name = "theatre_id", nullable = false)
    private final Theatre theatre;
}
