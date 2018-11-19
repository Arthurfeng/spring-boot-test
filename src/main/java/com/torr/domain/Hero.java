package com.torr.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "hero")
@EqualsAndHashCode(doNotUseGetters = true, exclude = {"parent"})
public class Hero {

    @Id
    @Column(name = "id_")
    private String id;

    @Column(name = "name_")
    private String name;

    @Column(name = "hp_")
    private int healthPoints;

    @Column(name = "atk_")
    private int attackDamage;

    @Column(name = "career_")
    private String career;

    @ManyToOne
    @JoinColumn(name = "soldier_id_")
    private Soldier soldier;

    @ManyToMany
    @JoinTable(
            name = "hero_soldier_",
            joinColumns = {@JoinColumn(name = "hero_id_")},
            inverseJoinColumns = {@JoinColumn(name = "soldier_id_")},
            uniqueConstraints = @UniqueConstraint(columnNames = {"hero_id_","soldier_id_"})
    )
    private List<Soldier> soldiers;

    @ManyToOne
    @JoinColumn(name = "parent_")
    private Hero parent;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "parent")
    private List<Hero> heros;
}
