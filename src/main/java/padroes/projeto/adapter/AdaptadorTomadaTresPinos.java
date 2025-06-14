package padroes.projeto.adapter;

public class AdaptadorTomadaTresPinos implements Tomada{
    private TomadaTresPinos tomada;

    AdaptadorTomadaTresPinos(TomadaTresPinos tomada) {
        this.tomada = tomada;
    }

    @Override
    public void ligarNaTomada() {
        tomada.ligarNaTomadaTresPinos();
    }
}
