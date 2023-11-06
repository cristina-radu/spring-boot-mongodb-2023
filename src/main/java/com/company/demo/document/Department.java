package com.company.demo.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Builder
@Data
public class Department {
    @Field
    private String name;
}
