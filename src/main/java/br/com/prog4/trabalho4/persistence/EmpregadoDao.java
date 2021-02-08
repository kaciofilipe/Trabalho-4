/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.util.List;
import model.Dependente;
import model.Empregado;

/**
 *
 * @author heloh
 */
public interface EmpregadoDao {

    public void incluir(Empregado empregado);

    public void alterar(Empregado empregado);

    public void excluir(Empregado empregado);

    public List<Empregado> listarTodos();

    public Empregado buscarPeloCodigo(int codigo);

    public List<Empregado> buscarPeloDependente(Dependente dependente);
}
