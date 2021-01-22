
public class ImagemComEtiqueta extends ImagemACores {
    private String nomeImagem;
    private int alturaImagem, larguraImagem;
    private String ficheiro;

    ImagemComEtiqueta(String ficheiro, String nomeImagem) {
        super(ficheiro);
        this.ficheiro = ficheiro;
        this.nomeImagem = nomeImagem;
        this.alturaImagem = obterAltura();
        this.larguraImagem = obterLargura();
    }

    public String getFicheiro() {
        return ficheiro;
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
