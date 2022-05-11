package br.senai.controller;

import br.senai.model.Filial;
import br.senai.service.FilialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FilialController {

    @Autowired
    FilialService filialService;

    @GetMapping("/filial/list")
    public String findAll(Model model){
        model.addAttribute("filiais", filialService.findAll());
        return "filial/list";
    }

    @GetMapping("/filial/add")
    public String add(Model model){
        model.addAttribute("filial", new Filial());
        return "filial/add";
    }

    @PostMapping("/filial/save")
    public String save(Filial filial, Model model){
        try{
            filialService.save(filial);
            model.addAttribute("filial", filial);
            model.addAttribute("isSaved",true);
            return "filial/add";
        } catch (Exception e){
            model.addAttribute("filial", filial);
            model.addAttribute("isError", true);
            model.addAttribute("errorMsg", e.getMessage());
            return "filial/add";
        }
    }



}
