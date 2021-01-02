
public class ImagemComEtiqueta extends ImagemACores {
    private String nomeImagem;
    private int alturaImagem, larguraImagem;
    private String ficheiro;
    private int Exibicao = 0;

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

   // public void mostrarDados(ImagemComEtiqueta imagemComEtiqueta){
   //     System.out.println("nome: " + nomeImagem);
   //     System.out.println("largura: " + alturaImagem + " altura: " + larguraImagem);
   //     System.out.println("caminho: " + ficheiro);
   // }

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
