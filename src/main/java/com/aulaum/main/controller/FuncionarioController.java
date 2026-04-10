/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulaum.main.controller;

import com.aulaum.main.dao.FuncionarioDAO;
import com.aulaum.main.model.FuncionarioBEAN;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Aluno
 */
@Controller
public class FuncionarioController {
    FuncionarioDAO dao = new FuncionarioDAO();
    @GetMapping("/Funcionarios")
    public String Funcionarios(Model model){
       List<FuncionarioBEAN> lista = dao.ler();
       model.addAttribute("lista", lista);
       return"Funcionarios";
    }
    @GetMapping("/painel")
    public String abrirPainel(Model model){
        int total = dao.TotalFuncionarios();
        model.addAttribute("total", total);
        return "painel";
    }
    @GetMapping("/Funcionarios/tecnologia")
    public String funcionariosTecnologia(Model model){
        List<FuncionarioBEAN> list = dao.Tecnologia();
        model.addAttribute("list", list);
        return "Funcionarios";
    }
}
