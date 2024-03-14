import Apple.Iphone;
import NavegadorNaInternet.Navegador;
import TocadorDeMusica.Tocador;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Navegador nav = new Iphone();
        Iphone iphone = new Iphone();
        nav.adicionrNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina();
        iphone.atender();
        iphone.ligar();
        iphone.iniciaCorreioVoz();
        iphone.pausar();
        iphone.tocar();
        iphone.selecionarMusica();
    }
}