
public class ImagemComEtiqueta extends ImagemACores {
    private String nomeImagem;
    private int alturaImagem, larguraImagem;
    private String ficheiro;
    private int [][] dados;


    ImagemComEtiqueta(String ficheiro, String nomeImagem) {
        super(ficheiro);
        this.ficheiro = ficheiro;
        this.nomeImagem = nomeImagem;
        this.alturaImagem = obterAltura();
        this.larguraImagem = obterLargura();
        this.dados = obterDados();
    }


    public int getAlturaImagem() {
        return obterAltura();
    }

    public int getLarguraImagem() {
        return obterLargura();
    }

    public String getNomeImagem() { return nomeImagem; }

    public int[][] getDados() { return dados; }

    public void setDados(int[][] dados) {
        this.dados = dados;
    }
}
