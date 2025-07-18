package org.example.exo_1.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {
    private int id;
    private String name;
    private String description;
    private boolean isDone;
}
