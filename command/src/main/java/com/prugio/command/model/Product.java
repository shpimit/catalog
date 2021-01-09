package com.prugio.command.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@Document(collection = "MyDatabase")
public class Product {

    @Id
    private long id;

    @NotBlank
    @Size(max = 100)
    @Indexed(unique = true)
    private String itemNO;
    private String image;
    private String descriptionLoc;
    private String materialClass;
    private String specification;
    private String basicUnit;
    private String makerName;
    private String modelNO;
    private String originCountry;
    private String hsNO;
    private String addUserID;
}
