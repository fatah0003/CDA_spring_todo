package org.example.exo_1.service;


import org.example.exo_1.inrfaces.ItodoService;
import org.example.exo_1.model.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService implements ItodoService {



    @Override
    public List<Todo> getAll() {
        return List.of();
    }

    @Override
    public Todo getFirst() {
        return null;
    }


}
