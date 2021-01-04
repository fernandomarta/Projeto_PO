public class MDIDecorator extends ManipuladorDeImagens {

    private ManipuladorDeImagens manipulador;

    public MDIDecorator (ManipuladorDeImagens manipulador) {
        this.manipulador = manipulador;
    }

    public void transforma() {
        ManipuladorDeImagens.transforma();
    }

}
