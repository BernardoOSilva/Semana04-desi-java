package colecoes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Colecoes {

    public static void main(String[] args) {
        
        //List alunos = new ArrayList<>();
//        ArrayList alunos = new ArrayList<>();
//        alunos.add("Pedrinh");
//        alunos.add(100);
//        alunos.add(true);
//        alunos.add("Bernardo");
//        System.out.println(alunos);
//        System.out.println(alunos.lastIndexOf("Bernardo"));
//        alunos.remove("Bernardo");
//        alunos.remove(2);
//        alunos.contains(2123);
//        alunos.size();
//        alunos.get(1);
//        
//        ArrayList<String> frutas = new ArrayList();
//        //int fruta = JOptionPane.showConfirmDialog(null, "CONFIRME");
//        String fruta = JOptionPane.showInputDialog("INFORME A FRUTA");
//        frutas.add(fruta);
//        fruta = JOptionPane.showInputDialog("INFORME A FRUTA");
//        frutas.add(fruta);
//        
//        for(int i = 0; i < frutas.size(); i++){
//            System.out.println(frutas.get(i));
//        }
//        
//        for(String fruit: frutas){
//            System.out.println(fruit);
//        }
//        
//        frutas.forEach((item) -> {
//            System.out.println(item);
//        });
//        
//        System.out.println(frutas);
//

//        alunos.size(); // 2
        
//        alunos.add(2.23);
//        
//        //int index = alunos.size() - 1;
//        alunos.add(false);
//        alunos.forEach((item) -> {
//            System.out.println(item);
//        });
//        
//        for (Object aluno : alunos){
//            System.out.println(alunos);
//        }
        
        //System.out.println(alunos.isEmpty());
        //System.out.println(alunos.get(alunos.size() - 1));
        //System.out.println(alunos.get(2));
        
    
    
    //1) Faça um programa que leia 20 numeros inteiros e
    //armazene-os numa lista. Armazene os números pares
    //na lista PAR e os números IMPARES na lista impar.
    //Imprima os três
    //
    //2) Faça um programa que receba a temperatura média de cada
    //mês do ano e armazene-as em uma lista. Após isto, calcule a
    //média anual das temperaturas e mostre todas as temperaturas
    //acima da média anual, e em que mês elas ocorreram (mostar o
    //mês por extenso: 1 - Janeiro, 2 - Fevereiro, . . .).
    //
    //3) Utilizando listas faça um programa que faça 5 perguntas
    //para uma pessoa sobre um crime. As perguntas são:
    //"Telefonou para a vítima?", "Esteve no local do crime?",
    //"Mora perto da vítima?", "Devia para a vítima?",
    //"Já trabalhou com a vítima?"
    //O programa deve no final emitir uma classificação
    //sobre a participação da pessoa n crime, Se a pessoa responder 
    //positivamente a 2 questões ela deve ser classificada como "Suspeita",
    //entre 3 e 4 como "Cúmplice" e 5 como "Assasino". Caso contrário, ele
    //será classificado como "Inocente".

//1)    
//    ArrayList<Integer> pares = new ArrayList<>(); 
//    ArrayList<Integer> impares = new ArrayList<>(); 
//    ArrayList<Integer> numeros = new ArrayList<>(); 
//    
//    for (int i = 0; i < 20; i++) {
//           String numero = JOptionPane.showInputDialog(null,"QUAL NÚMERO VOCÊ DESEJA COLOCAR NA LISTA");
//           int numerosInteiro = Integer.parseInt(numero);
//        if(numerosInteiro % 2 == 1){
//            impares.add(numerosInteiro);
//            numeros.add(numerosInteiro);
//            
//        }else if(numerosInteiro % 2 == 0){
//            pares.add(numerosInteiro);
//            numeros.add(numerosInteiro);
//        }
//        
//    }
//        JOptionPane.showMessageDialog(null, pares);
//        JOptionPane.showMessageDialog(null, impares);
//        JOptionPane.showMessageDialog(null, numeros);
//    
//    }

//2)
//    ArrayList<Double> temperaturaMedia = new ArrayList<>();
//    ArrayList<Double> acimaDaMedia = new ArrayList<>();
//    ArrayList<Double> mes = new ArrayList<>();
//    
//    for (int i = 0; i < ; i++) {
//         
//        }
//        
//    }
//        JOptionPane.showMessageDialog(null, temperaturaMedia);
//        JOptionPane.showMessageDialog(null, acimaDaMedia);
//        JOptionPane.showMessageDialog(null, mes);
    
//3)
    ArrayList<String> perguntas = new ArrayList<>();
    String perguntas1 = JOptionPane.showInputDialog("Telefonou para a vítima?");
    String perguntas2 = JOptionPane.showInputDialog("?");
    String perguntas3 = JOptionPane.showInputDialog("Telefonou para a vítima?");
    String perguntas4 = JOptionPane.showInputDialog("Telefonou para a vítima?");
    String perguntas5 = JOptionPane.showInputDialog("Telefonou para a vítima?");
}
}
