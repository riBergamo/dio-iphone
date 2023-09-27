package org.iphone;

import org.iphone.aparelhoTelefonico.AparelhoTelefonico;
import org.iphone.aparelhoTelefonico.AparelhoTelefonicoImpl;
import org.iphone.navegadorNaInternet.Navegador;
import org.iphone.navegadorNaInternet.NavegadorInternetImpl;
import org.iphone.reprodutorMusical.ReprodutorMusical;
import org.iphone.reprodutorMusical.ReprodutorMusicalImpl;

public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusicalImpl();
        AparelhoTelefonico telefone = new AparelhoTelefonicoImpl();
        Navegador navegador = new NavegadorInternetImpl();

        // Exemplos
        reprodutor.tocar();
        telefone.ligar();
        navegador.exibirPagina();
    }
}