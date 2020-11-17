package com.sunnyhith.reactive.reactivemongoexample1.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.GetMapping;

@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Employee {
    @Id
    private String id;
    private String name;
    private Long salary;

    public Employee(String toString, String peter, long l) {
    }
}

