/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dependente")
/**
 *
 * @author heloh
 */
public class Dependente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cpfEmpregado")
    private String cpfEmpregado;
    @Column(name = "nome")
    private String nome;
    @Column(name = "grauParentesco")
    private String grauParentesco;
    @Column(name = "dataNascimento")
    private String dataNascimento;

    
    @ManyToOne
    @JoinColumn(name = "cpf")
    private Empregado empregado;
    
    public String getCpfEmpregado() {
        return cpfEmpregado;
    }

    public void setCpfEmpregado(String cpfEmpregado) {
        this.cpfEmpregado = cpfEmpregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }

}
