package com.company.demo.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Builder
@Data
public class Grade {
    @Field
    private String name;
}
