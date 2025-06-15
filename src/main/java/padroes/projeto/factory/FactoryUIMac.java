package padroes.projeto.factory;

public class FactoryUIMac implements FactoryUI {
    public Botao criarBotao() {
        return new BotaoMac();
    }

    public CaixaDialogo criarCaixaDialogo() {
        return new CaixaDialogoMac();
    }
}
