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
            System.out.println(aluno);
        }

    }

}
