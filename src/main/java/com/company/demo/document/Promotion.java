package com.company.demo.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Builder
@Data
public class Promotion {
    @Field
    private Integer salary;
    @Field
    private String currency;
    @Field
    private String gradeIncrease;
    @Field
    private String date;
}
