package com.prugio.command.domain;

import javax.persistence.*;

@Entity
@Table(name="PROMMTGL")  //table name
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // auto created ID
    private Long id;

    @Column(length=100, nullable=false) // varchar(100) not null
    private String item_no;
    @Column		// varchar(255)
    private String image;
    @Column		// varchar(255)
    private String description_loc;
    @Column		// varchar(255)
    private String material_class;
    @Column		// varchar(255)
    private String specification;
    @Column		// varchar(255)
    private String basic_unit;
    @Column		// varchar(255)
    private String maker_name;
    @Column		// varchar(255)
    private String model_no;
    @Column		// varchar(255)
    private String origin_country;
    @Column		// varchar(255)
    private String hs_no;
    @Column		// varchar(255)
    private String add_user_id;
    @Column(name = "DATE_FIELD")
    private java.sql.Date   add_date;
//    @Column
//    private Date createDate;
}
