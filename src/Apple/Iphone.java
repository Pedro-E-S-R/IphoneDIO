package Apple;

import AparelhoTelefonico.Telefone;
import NavegadorNaInternet.Navegador;
import TocadorDeMusica.Tocador;

public class Iphone implements Telefone, Navegador, Tocador {
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciaCorreioVoz() {
        System.out.println("Ouvindo o correio de voz.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionrNovaAba() {
        System.out.println("Abrindo uma nova guia");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolhendo a musica");
    }
}
