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
public class Vendedor extends Funcionario{
    
    public double comissao;
//Construtor
    public Vendedor() {
    }
    public Vendedor(double comissao) {
        this.comissao = comissao;
    }
    public Vendedor(double comissao, String nome, double salBase) {
        super(nome, salBase);
        this.comissao = comissao;
    }
//Getters e Setters
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
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
        return (this.salBase + this.comissao);
    }
}
