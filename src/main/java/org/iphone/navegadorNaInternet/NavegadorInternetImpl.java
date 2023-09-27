package org.iphone.navegadorNaInternet;

public class NavegadorInternetImpl implements Navegador {

    @Override
    public void exibirPagina() {//String p
        System.out.println("Exibindo página");
    }

    @Override
    public void addNovaAba() {
        System.out.println("Nova Aba Adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}
