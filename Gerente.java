/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Gerente extends Funcionario{
    
    //Construtor
    public Gerente() {
    }
    public Gerente(String nome, double salBase) {
        super(nome, salBase);
    }
//Getters e Setters
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public double getSalBase() {
        return salBase;
    }
    @Override
    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }
    
    @Override
    public double calcularSalario(){
        return (this.salBase * 2);
    }
}
