package org.example.exo_1.controller;

import org.example.exo_1.inrfaces.ItodoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api")
public class TodoCntroller {
    private ItodoService todoService;

    public TodoCntroller(ItodoService todoService) {
        this.todoService = todoService;
    }
    @RequestMapping("/todo")
    @ResponseBody
    public List list(){
        return
    }
}
