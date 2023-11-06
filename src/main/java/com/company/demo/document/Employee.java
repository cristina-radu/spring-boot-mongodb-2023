package com.company.demo.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Builder
@Data
@Document
public class Employee {
    @Id
    private String id;
    @Field
    private String firstName;
    @Field
    private String lastName;
    @Field
    private Department department;
    @Field
    private Grade grade;
    @Field
    private Integer salary;
    @Field
    private String currency;
    @Field
    private Address address;
    @Field
    private String employmentDate;
    @Field
    private String[] gradeIncrease;
    @Field
    private List<Promotion> promotions;
    @Field(name = "city")
    private String location;
}
