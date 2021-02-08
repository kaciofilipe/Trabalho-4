/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Empregado;

/**
 *
 * @author heloh
 */
public class Teste {

    public static void main(String[] args) {
        //HibernateUtil.getSessionFactory();

        Empregado e = new Empregado();
        EmpregadoController ec = new EmpregadoController();
        e.setNome("Maria");
        e.setCpf("0102");
        e.setIdade("25");
        e.setSalario(1000.00f);

        ec.incluir(e);
    }

    EmpregadoController vc = new EmpregadoController();
    Empregado ve = vc.buscarPeloCPF("0102");

    if(ve != null){
        System.out.println("CPF: " + ve.getCpf());
    }
    //dependente 
}
