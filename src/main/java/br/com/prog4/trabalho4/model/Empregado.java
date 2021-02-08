/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "empregado")
/**
 *
 * @author heloh
 */
public class Empregado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "nome")
    private String nome;
    @Column(name = "idade")
    private String idade;
    @Column(name = "salario")
    private Float salario;

    @OneToMany(mappedBy = "veiculo", targetEntity = Dependente.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Dependente> dependente;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public List<Dependente> getDependente() {
        return dependente;
    }

    public void setDependente(List<Dependente> dependente) {
        this.dependente = dependente;
    }

}
