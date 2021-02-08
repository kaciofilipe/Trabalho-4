/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Empregado;
import persistence.EmpregadoDaoImp;

/**
 *
 * @author heloh
 */
public class EmpregadoController {

    public void incluir(Empregado empregado) {
        EmpregadoDaoImp ed = new EmpregadoDaoImp();
        ed.incluir(empregado);
    }

    public void excluir(Empregado empregado) {
        EmpregadoDaoImp ed = new EmpregadoDaoImp();
        ed.excluir(empregado);
    }

    public Empregado buscarPeloCPF(String cpf) {
        EmpregadoDaoImp vd = new EmpregadoDaoImp();
        return vd.buscarPeloCPF(cpf);
    }
}
