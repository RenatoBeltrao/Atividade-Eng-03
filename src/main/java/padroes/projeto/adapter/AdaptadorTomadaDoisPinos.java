package padroes.projeto.adapter;

public class AdaptadorTomadaDoisPinos implements Tomada {
    private TomadaDoisPinos tomadaDoisPinos;

    AdaptadorTomadaDoisPinos(TomadaDoisPinos tomadaDoisPinos) {
        this.tomadaDoisPinos = tomadaDoisPinos;
    }

    @Override
    public void ligarNaTomada() {

    }
}