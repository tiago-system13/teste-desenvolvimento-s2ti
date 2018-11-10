/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provas2tiquestao9;

/**
 *
 * @author Tiago
 */
public class ArvoreBinaria {
     Node raiz;

    int somaDosNodesSubsequentes = 0;

    public void inserir(Node node, int valor) {
        if (valor < node.valor) {
            if (node.filhoEsquerdo != null) {
            inserir(node.filhoEsquerdo, valor);
            } else {
                System.out.println(" Inserindo " + valor + " a esqueda de " + node.valor);
                node.filhoEsquerdo = new Node(valor);
            }
        } else if (valor > node.valor) {
            if (node.filhoDireito != null) {
                inserir(node.filhoDireito, valor);
            } else {
                System.out.println(" Inserindo " + valor + " a direita de " + node.valor);
                node.filhoDireito = new Node(valor);
            }
        }
    }
    
    public void run() {
        raiz = new Node(20);        
        inserir(raiz, 22);
        inserir(raiz, 34);
        inserir(raiz, 13);
        inserir(raiz,21);
        inserir(raiz, 12);
        inserir(raiz, 7);
        inserir(raiz, 3);
        inserir(raiz, 11);
        inserir(raiz, 9);
        System.out.println(SomatorioNodesSubsequentes(raiz));
    }
    
     public int SomatorioNodesSubsequentes(Node nodo) {
        if (nodo == null) {
            return 0;
        }

        if (nodo == raiz) {
            somaDosNodesSubsequentes = SomatorioNodesSubsequentes(nodo.filhoEsquerdo)
                    + SomatorioNodesSubsequentes(nodo.filhoDireito);
        } else {
            somaDosNodesSubsequentes = SomatorioNodesSubsequentes(nodo.filhoEsquerdo)
                    + SomatorioNodesSubsequentes(nodo.filhoDireito)
                    + nodo.valor;
        }

        return somaDosNodesSubsequentes;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
         ArvoreBinaria arvore = new ArvoreBinaria();
         arvore.run();
     }

}
