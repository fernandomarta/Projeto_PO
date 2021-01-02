public class ImagemComEtiqueta extends ImagemACores {
   String nomeImagem;
   int AlturaImagem, LarguraImagem;

    ImagemComEtiqueta(String ficheiro) {

        super(ficheiro);

    }

    public String obterNomeImagem() {
        return nomeImagem;
    }

    public void mudarNomeImagem(String nomeImagem) {
        this.nomeImagem = nomeImagem;
    }

    public int getAlturaImagem() {
        return obterAltura();
    }

    public int getLarguraImagem() {
        return obterLargura();
    }
}
