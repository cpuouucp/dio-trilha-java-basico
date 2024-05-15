import papeis.browser.NavegadorNaInternet;
import papeis.ipod.ReprodutorMusical;
import papeis.telephone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet{
    // Papel do Reprodutor Musical
    public void pausarMusica() {
        System.out.println("Música do Iphone sendo pausada.");
    }
    public void selecionarMusica() {
        System.out.println("Música do Iphone sendo selecionada.");
    }
    public void tocarMusica() {
        System.out.println("Música do Iphone sendo reproduzida.");
    }

    // Papel do Telefone
    public void atenderChamadaTelefonica() {
        System.out.println("Chamada telefonica do Iphone sendo atendida");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz do Iphone sendo iniciado");        
    }
    public void ligarParaTelefone() {
        System.out.println("Ligação telefonica do Iphone sendo iniciada");
    }

    // Papel do Navegador de Internet
    public void adicionarNovaAba() {
        System.out.println("Navegador de Internet do Iphone adicionando nova aba");
    }
    public void atualizarPagina() {
        System.out.println("Navegador de Internet do Iphone atualizando página");
    }
    public void exibirPagina() {
        System.out.println("Navegador de Internet do Iphone exibindo página"); 
    }
}
