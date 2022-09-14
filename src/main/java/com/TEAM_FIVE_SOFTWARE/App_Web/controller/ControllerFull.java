package com.TEAM_FIVE_SOFTWARE.App_Web.controller;

import com.TEAM_FIVE_SOFTWARE.App_Web.Modelos.Empresa;
import com.TEAM_FIVE_SOFTWARE.App_Web.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ControllerFull {
    //Instanciamos un Objeto de la Clase EmpresaService
    @Autowired
    EmpresaService empresaService;

    @GetMapping ({"/Empresa","/verEmpresa"})
    public String viewEmpresas(Model model){
        List<Empresa> listaEmpresas=empresaService.getAllEmpresas();
        model.addAttribute("emplist",listaEmpresas);
        return "verEmpresa"; //Llamamos al Html
    }


}
