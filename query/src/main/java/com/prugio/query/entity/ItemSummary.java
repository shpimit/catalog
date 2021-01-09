package com.prugio.query.entity;

import lombok.*;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@Entity
@Data
@NoRepositoryBean
@Table(name="PROMMTGL")
public class ItemSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "ITEM_NO",           nullable = false, length = 30)
    private String item_no;
    @Column(name = "IMAGE_FILE_PATH",   nullable = true, length = 200)
    private String image;
    @Column(name = "DESCRIPTION_LOC",   nullable = false, length = 100)
    private String description_loc;
    @Column(name = "MATERIAL_CLASS",    nullable = false, length = 30)
    private String material_class;
    @Column(name = "SPECIFICATION",     nullable = false, length = 100)
    private String specification;
    @Column(name = "BASIC_UNIT",        nullable = false, length = 10)
    private String basic_unit;
    @Column(name = "MAKER_NAME",        nullable = false, length = 30)
    private String maker_name;
    @Column(name = "MODEL_NO",          nullable = false, length = 30)
    private String model_no;
    @Column(name = "ORIGIN_COUNTRY",    nullable = false, length = 30)
    private String origin_country;
    @Column(name = "HS_NO",             nullable = false, length = 20)
    private String hs_no;
    @Column(name = "ADD_USER_ID",       nullable = false, length = 10)
    private String add_user_id;
    @Column(name = "ADD_DATE",          nullable = true, length = 30)
    private LocalDateTime add_date;
}