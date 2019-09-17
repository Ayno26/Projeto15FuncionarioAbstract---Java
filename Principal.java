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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vendedor v1 = new Vendedor(300, "Joao", 500);
        Assistente a1 = new Assistente("Roberto", 500);
        Gerente g1 = new Gerente("Angelo", 500);
        
        System.out.println("Vendedor: "+v1.getNome()+"        Salario: "+v1.calcularSalario());
        System.out.println("Assistente: "+a1.getNome()+"   Salario: "+a1.calcularSalario());
        System.out.println("Gerente: "+g1.getNome()+"       Salario: "+g1.calcularSalario());
    }
}
