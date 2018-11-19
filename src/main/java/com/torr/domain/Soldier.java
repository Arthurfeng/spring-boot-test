package com.torr.domain;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "soldier")
public class Soldier {

    @Id
    @Column(name = "id_")
    private String id;

    /**
     * 兵種
     * 1.cavalry  騎兵
     * 2.spearman 槍兵
     * 3.archer 弓兵
     * 4.infantry 步兵
     */
    @Column(name = "military_")
    private String military;
}
