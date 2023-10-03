/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.investimentos;
import java.util.Scanner;
import java.text.*;

/**
 *
 * @author Laryssa
 */
public class Investimentos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //O usuário deve digitar o valor que ele irá investir na compra
        System.out.println("Digite seu valor de entrada da compra: ");
        double valorCompra = scan.nextDouble();
        int dia = 1;
        double valorFechamento = 0.1;
        //ajuda no suporte de contas com muitas casas decimais
        DecimalFormat df = new DecimalFormat("0.00");
        //inicio do loop condicional
        while(true){
            System.out.println("Digite o valor de saída do dia " + dia + "(qualquer valor negativo fecha o programa)");
           valorFechamento = scan.nextDouble();
           
           if (valorFechamento <0.0)
               break;
           double lucros = valorFechamento-valorCompra;
           
           if (lucros > 0){
                System.out.println("O lucro do dia " + dia + " foi de R$"+df.format(lucros) );}
           else if (lucros <0.0){
                System.out.println("Houve um desfalque de R$"+df.format(lucros)+" no dia " + dia);}
           else 
                System.out.println("Você não faturou nada no dia "+ dia);
           //adiciona um dia sempre que o loop reinicia
            dia += 1;
        }
       
        scan.close();
    }
    
}
