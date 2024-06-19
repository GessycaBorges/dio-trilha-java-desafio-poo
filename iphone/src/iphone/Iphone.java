package iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void ligar(String numero) {
        System.out.println("Ligando: " + numero);
    }
    public void atender() {
        System.out.println("Atendendo");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    public void tocar() {
        System.out.println("Tocando");
    }
    public void pausar() {
        System.out.println("Pausando");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando Musica: " + musica);
    }
}