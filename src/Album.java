

import java.util.List;

public class Album {
    List<ImagemComEtiqueta> asMinhasImagens;
    ManipuladorDeImagens manipuladorDeImagens;

    ImagemComEtiqueta imagem1 = new ImagemComEtiqueta("donald_trump.jpg");

    ImagemComEtiqueta imagem1reduzida = (ImagemComEtiqueta) ManipuladorDeImagens.reduzImagem(imagem1, 2);
}
