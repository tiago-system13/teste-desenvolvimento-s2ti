/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provas2tiquestao08;

/**
 *
 * @author Tiago
 */
public class ProvaS2tiQuestao08 {

    
    public int ObterValorDeC(int a, int b){
        char[] arrayNumerosDeA ; 
        char[] arrayNumerosDeB;
        arrayNumerosDeA =  Integer.toString(a).toCharArray();
        arrayNumerosDeB = Integer.toString(b).toCharArray();
        
        int ArrayComMairTamanho = arrayNumerosDeA.length > arrayNumerosDeB.length?arrayNumerosDeA.length:arrayNumerosDeB.length;
        String c="";

        for (int i = 0; i < ArrayComMairTamanho; i++) {
            
            if(arrayNumerosDeA.length > i)
               c += String.valueOf(arrayNumerosDeA[i]);
            
            if(arrayNumerosDeB.length > i)
                c += String.valueOf(arrayNumerosDeB[i]);            
        }
        
        int valorDeC =Integer.parseInt(c);
        
        if(valorDeC> 1000000 ){
            return -1;
        }
        
        return  valorDeC;
     
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProvaS2tiQuestao08 numeroDeC = new ProvaS2tiQuestao08();
        System.out.println("Número C: " + numeroDeC.ObterValorDeC(3678, 80));
        
    }
    
}
