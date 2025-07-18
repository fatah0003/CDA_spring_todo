package org.example.exo_1.inrfaces;

import org.example.exo_1.model.Todo;

import java.util.List;

public interface ItodoService {
    List<Todo> getAll();
    Todo getFirst();
}
