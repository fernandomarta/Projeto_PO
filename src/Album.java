import java.util.ArrayList;

public class Album {

    ArrayList<ImagemComEtiqueta> albumImagens = new ArrayList<>();
    ImagemComEtiqueta imagemEmExibicao;


    // (1º metodo) Adicionar Imagem:
    public void adicionarImagem(String novaImagem, String novoNome) {
        ImagemComEtiqueta image = new ImagemComEtiqueta(novaImagem, novoNome);
        albumImagens.add(image);
        imagemEmExibicao = albumImagens.get(0);

    }

    // (2º metodo) Obter Imagem em Exibição:
    public void obterImagemExibicao() {
        imprimirImagem(imagemEmExibicao,1);
    }
    // (3º metodo) Obter Imagem reduzida anterior:
    public void obterImagemReduzidaAnterior () {
        if (verificarposicao() != 0 ) {
            ImagemComEtiqueta imagem = albumImagens.get(albumImagens.indexOf(imagemEmExibicao) - 1);
            ImagemACores imagemCor = ManipuladorDeImagens.reduzImagem(albumImagens.get(albumImagens.indexOf(imagemEmExibicao) - 1), 2);
            imprimirImagem (imagem, -1);
        }
    }

    // (3º metodo) Obter Imagem reduzida seguinte:
    public void obterImagemReduzidaSeguinte () {
        if (verificarposicao() != 1 ) {
            ImagemComEtiqueta imagem = albumImagens.get(albumImagens.indexOf(imagemEmExibicao) + 1);
            ImagemACores imagemCor = ManipuladorDeImagens.reduzImagem(albumImagens.get(albumImagens.indexOf(imagemEmExibicao) + 1), 2);
            imprimirImagem(imagem, 1);
        }
    }


    public void imprimirImagem ( ImagemComEtiqueta imagem, int varIndex) {
        System.out.print("||" + (albumImagens.indexOf(imagem)+1) + ": " + imagem.obterNomeImagem()
                + " - [" + imagem.obterLargura() + " x " + imagem.obterAltura() + "] (E) ||");
    }


    public int verificarposicao() {
        if(albumImagens.indexOf(imagemEmExibicao) == albumImagens.size()){
            System.out.println("Está na última imagem!");
            return 1;
        }
        else  if(albumImagens.indexOf(imagemEmExibicao) == 0) {
            System.out.print("Está na primeira imagem!");
            return 0;
        }
        return 2;
    }

}
