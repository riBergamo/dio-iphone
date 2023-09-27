package org.iphone.reprodutorMusical;

public class ReprodutorMusicalImpl implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando Música");
    }

    public void pausar() {
        System.out.println("Pausado Música");
    }

    @Override
    public void selecionarMusica() {//String m
        System.out.println("Música Selecionada");
    }
}
