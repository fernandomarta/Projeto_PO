import java.util.ArrayList;
import java.util.SortedMap;

public class Album {

    ArrayList<ImagemComEtiqueta> albumImagens = new ArrayList<>();
    ImagemComEtiqueta imagemEmExibicao;


    // (1º metodo) Adicionar Imagem:
    public void adicionarImagem(String novaImagem, String novoNome) {
        ImagemComEtiqueta image = new ImagemComEtiqueta(novaImagem, novoNome);
        albumImagens.add(image);
        imagemEmExibicao = albumImagens.get(0);

    }

    // (2º metodo) Obter Imagem em Exibição acompanhada das imagenslaterais reduzidas:
    public void obterImagemExibicao() {
        obterImagemReduzidaAnterior ();
        System.out.print("||" + (albumImagens.indexOf(imagemEmExibicao)+1) + ": " + imagemEmExibicao.obterNomeImagem()
                + " - [" + imagemEmExibicao.obterLargura() + " x " + imagemEmExibicao.obterAltura() + "] (E) ||");
        obterImagemReduzidaSeguinte ();
    }


    // (3º metodo) Obter Imagem reduzida anterior:
    public void obterImagemReduzidaAnterior () {
        if (verificarposicao('a') != 0 ) {
            ImagemComEtiqueta imagem = albumImagens.get(albumImagens.indexOf(imagemEmExibicao) - 1);
            ImagemACores imagemCor = ManipuladorDeImagens.reduzImagem(imagem, 2);

            System.out.print("||" + (albumImagens.indexOf(imagem)+1) + ": " + imagem.obterNomeImagem()
                    + " - [" + imagemCor.obterLargura() + " x " + imagemCor.obterAltura() + "] ||");

        }
    }

    // (4º metodo) Obter Imagem reduzida seguinte:
    public void obterImagemReduzidaSeguinte () {
        if (verificarposicao('s') != 1 ) {
            ImagemComEtiqueta imagem = albumImagens.get(albumImagens.indexOf(imagemEmExibicao) + 1);
            ImagemACores imagemCor = ManipuladorDeImagens.reduzImagem(imagem, 2);
             //int larggg = ManipuladorDeImagens.reduzImagem(imagem, 2).obterLargura(); outra forma  de obter as dimensões da imagem

            System.out.print("||" + (albumImagens.indexOf(imagem)+1) + ": " + imagem.obterNomeImagem()
                    + " - [" + imagemCor.obterLargura() + " x " + imagemCor.obterAltura() + "] ||");

        }
    }

    // (5º método) Mudar para a Imagem seguinte:
    public void mudarImagemSeguinte () {
        if (verificarposicao('s') != 1) {
            imagemEmExibicao = albumImagens.get(albumImagens.indexOf(imagemEmExibicao) + 1);
            System.out.println("index da img em exib: " + albumImagens.indexOf(imagemEmExibicao));
        }
    }

    // (6º método) Mudar para a Imagem anterior:
    public void mudarImagemAnterior () {
        if (verificarposicao('a') != 0) {
            imagemEmExibicao = albumImagens.get(albumImagens.indexOf(imagemEmExibicao) - 1);
        }
    }

    // (7ºmétodo) Obter Imagem ampliada da imagem em Exibição, sem modificar:     ****** Atenção Overloading !!! *********
    public void ampliarImagem (){

        ImagemACores imagemAmpliada = ManipuladorDeImagens.aumentaImagem(imagemEmExibicao);
        System.out.print("||" + (albumImagens.indexOf(imagemEmExibicao)+1) + ": " + imagemEmExibicao.obterNomeImagem()
                + " - [" + imagemAmpliada.obterLargura() + " x " + imagemAmpliada.obterAltura() + "] (E) ||");
    }


    // (8º método) Pixelizar Imagem em Exibição:
    public void pixelarImagem () {

    ImagemACores imagempixel = ManipuladorDeImagens.pixelizaImagem(imagemEmExibicao, 2);
     //imagemEmExibicao= imagempixel;
    }

    // (9º método) Mostrar o conteúdo do Album:
    public void mostrarTodoAlbum () {
        for (ImagemComEtiqueta img : albumImagens) {
            if (img.equals(imagemEmExibicao)) {
                System.out.println("||" + (albumImagens.indexOf(imagemEmExibicao)+1) + ": " + imagemEmExibicao.obterNomeImagem()
                        + " - [" + imagemEmExibicao.obterLargura() + " x " + imagemEmExibicao.obterAltura() + "] (E) ||");
            }
            else {
                System.out.println("||" + (albumImagens.indexOf(img) + 1) + ": " + img.obterNomeImagem()
                        + " - [" + img.obterLargura() + " x " + img.obterAltura() + "] ");
            }
        }
    }


    // método para verificar posição no array e impedir que saia fora do range:
        public int verificarposicao (char verificar) {
            if (verificar=='s') {
                if (albumImagens.indexOf(imagemEmExibicao)+1 == albumImagens.size()) {
                    System.out.println("Não existem imagens a seguir");
                    return 1;
                }
            }

            if (verificar=='a') {
                if (albumImagens.indexOf(imagemEmExibicao) == 0) {
                    System.out.print("Não existem imagens anteriores");
                    return 0;
                }
            }
            return 2;
        }


}

