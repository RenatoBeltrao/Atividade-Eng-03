package padroes.projeto.factory;

public class Main {
    public static void main(String[] args) {
        // Escolha da fábrica de acordo com o sistema operacional
        FactoryUI factoryUI;

       String sistemaOperacional = "Mac"; // Pode ser "macOS"
       if (sistemaOperacional.equals("Windows")) {
           factoryUI = new FactoryUIWindows();
       } else {
           factoryUI = new FactoryUIMac();
        }

        // Criar botão e caixa de diálogo usando a fábrica selecionada
        Botao botao = factoryUI.criarBotao();
        CaixaDialogo caixaDialogo = factoryUI.criarCaixaDialogo();

        // Usar os objetos criados
        botao.clicar();
        caixaDialogo.renderizar();
    }
}
