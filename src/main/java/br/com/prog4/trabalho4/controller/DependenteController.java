/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Dependente;
import model.Empregado;
import persistence.DependenteDaoImp;

/**
 *
 * @author heloh
 */
public class DependenteController {

    public void incluir(Dependente multa) {
        DependenteDaoImp md = new DependenteDaoImp();
        md.incluir(multa);
    }

    public void alterar(Dependente multa) {
        DependenteDaoImp md = new DependenteDaoImp();
        md.alterar(multa);
    }

    public void excluir(Dependente multa) {
        DependenteDaoImp md = new DependenteDaoImp();
        md.excluir(multa);
    }

    public List<Dependente> listarTodos() {
        DependenteDaoImp md = new DependenteDaoImp();
        return md.listarTodos();
    }

    public Dependente buscarPeloCodigo(int codigo) {
        DependenteDaoImp md = new DependenteDaoImp();
        return md.buscarPeloCodigo(codigo);
    }

    public List<Dependente> buscarPeloVeiculo(Empregado veiculo) {
        DependenteDaoImp md = new DependenteDaoImp();
        return md.buscarPeloVeiculo(veiculo);
    }
}
