package estabelecimento;

import iphone.Iphone;

public class Apple {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("\n- Ações de Reprodutor Musical");
        iphone.selecionarMusica("Snow");
        iphone.tocar();
        iphone.pausar();

        System.out.println("\n- Ações de Aparelho Telefônico");
        iphone.ligar("9 9999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\n- Ações de Navegador de Internet");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://www.apple.com/br/");
        iphone.atualizarPagina();
    }
}
