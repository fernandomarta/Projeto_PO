import java.util.ArrayList;

public class Album {
    ArrayList<ImagemComEtiqueta> asMinhasImagens = new ArrayList<ImagemComEtiqueta>();

    //ManipuladorDeImagens manipuladorDeImagens;
    //ImagemComEtiqueta imagem1reduzida = (ImagemComEtiqueta) ManipuladorDeImagens.reduzImagem(imagem1, 2);


    public void adicionaImagem(ImagemComEtiqueta imagem) {
        asMinhasImagens.add(imagem);
    }


    public void dadosImagem (){
     String  nome = imagem1.obterNomeImagem();
     System.out.println(nome);
    }



}
