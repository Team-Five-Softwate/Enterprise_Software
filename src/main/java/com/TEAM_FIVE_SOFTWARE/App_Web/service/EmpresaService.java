package com.TEAM_FIVE_SOFTWARE.App_Web.service;

import com.TEAM_FIVE_SOFTWARE.App_Web.Modelos.Empresa;
import com.TEAM_FIVE_SOFTWARE.App_Web.reposotorio.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//Le decimos a Spring que esta clase es de servicios
@Service
public class EmpresaService  {
    @Autowired //Conectamos esta clase con el repository de Empresa
    EmpresaRepository empresaRepository; //Creamos un objeto de tipo EmpresaRepository para poder usar los metodos que dicha clase hereda

    //Metodo que retornará la lista de empresas usando metodos heredados del jpaRepository
    public List<Empresa> getAllEmpresas(){
        List<Empresa> empresaList = new ArrayList<>();
        empresaRepository.findAll().forEach(empresa -> empresaList.add(empresa));
        //Por cada empresa que me encuentre, entonces agg esa empresa a la Lista de Empresas
        return empresaList;
    }
    //Metodo que me trae un objeto de tipo Empresa cuando cuento con el id de la misma
    public Empresa getEmpresaById(Integer id){
        return  empresaRepository.findById(id).get();
    }

    //Metodo para guardar o actualizar objetos de tipo Empresa
    public boolean saveOrUpdateEmpresa(Empresa empresa){
        Empresa emp=empresaRepository.save(empresa);
        if(empresaRepository.findById(emp.getId())!=null){
            return true;
        }
        return false;
    }

    //metodo delete pendiente
}
