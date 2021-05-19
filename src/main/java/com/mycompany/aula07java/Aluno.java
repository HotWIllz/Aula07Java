/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula07java;

import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Aluno {

    public void cadastrarAluno() {
        String a[] = new String[5];
        String m[] = {"Matemática", "Português", "Ciências", "Geografia", "Física"};

        for (int i = 0; i < a.length; i++) {
            a[i] = JOptionPane.showInputDialog("Nome do aluno " + i);
        }
        for (String aluno : a) {
            System.out.println(a[0]);
        }

    }

    public void atividade1() {
        String disc[] = {"Português", "Matemática", "Física", "História", "Geografia"};
        double nota[] = new double[5];
        String result = "";
        double media = 0;
        double soma = 0;
        String pesquisa = "";

        for (int i = 0; i < disc.length; i++) {
            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota de " + disc[i]));
            result += disc[i] + ": " + nota[i] + "\n";

        }
        for (int i = 0; i < nota.length; i++) {
            soma = soma + nota[i];
            media = soma / 5;

        }

        JOptionPane.showMessageDialog(null, result);
        JOptionPane.showMessageDialog(null, "A média de suas notas é " + media);

        pesquisa = (JOptionPane.showInputDialog("Digite o número correspondente a matéria: "));

        if (pesquisa.equals("1")) {
            JOptionPane.showMessageDialog(null, "A nota de Português é " + nota[0]);
        } else if (pesquisa.equals("2")) {
            JOptionPane.showMessageDialog(null, "A nota de Matemática é " + nota[1]);
        } else if (pesquisa.equals("3")) {
            JOptionPane.showMessageDialog(null, "A nota de Física é " + nota[2]);
        } else if (pesquisa.equals("4")) {
            JOptionPane.showMessageDialog(null, "A nota de História é " + nota[3]);
        } else if (pesquisa.equals("5")) {
            JOptionPane.showMessageDialog(null, "A nota de Geografia é " + nota[4]);
        } else {
            JOptionPane.showMessageDialog(null, "Escolha um número válido");
        }

    }
}
