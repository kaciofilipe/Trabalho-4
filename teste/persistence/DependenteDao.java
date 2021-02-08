/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.util.List;
import model.Dependente;

/**
 *
 * @author heloh
 */
public interface DependenteDao {

    public void incluir(Dependente dependente);

    public void alterar(Dependente dependente);

    public void excluir(Dependente dependente);

    public List<Dependente> listarTodos();

    public Dependente buscarPeloCPF(String cpf);
}
