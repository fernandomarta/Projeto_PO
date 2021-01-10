
public class Main {

    public static void main(String[] args) {

	// ATENÇÃO: priemiro metodo a correr deverá ser Adicionar Imagem - adicionarImagem()

        ManipuladorDeImagens manipuladorDeImagens;

        // Manipulador Imagens testes

        //ImagemACores tomEJerry = new ImagemACores("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\tomjerrypng.png");
        //ImagemACores bugsBunny = new ImagemACores("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\bugsBunny.png");
        //ImagemACores Jerry = new ImagemACores("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\jerry.png");

        //ImagemACores tomEJerryReduzido = ManipuladorDeImagens.reduzImagem(tomEJerry, 2);
        //ImagemACores bugsBunnyReduzido = ManipuladorDeImagens.reduzImagem(bugsBunny, 4);
        //ImagemACores bugsBunnyPixel = ManipuladorDeImagens.pixelizaImagem(bugsBunny, 3);
        //ImagemACores tomEJerryPixel = ManipuladorDeImagens.pixelizaImagem(tomEJerry, 2);
        //ImagemACores JerryAumentado = ManipuladorDeImagens.aumentaImagem(Jerry);

        // ImagemComEtiqueta testes

       // ImagemComEtiqueta imagemEtiqueta = new ImagemComEtiqueta("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\jerry.png", "rato");
        //ImagemComEtiqueta imagemEtiqueta2 = new ImagemComEtiqueta("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\tomjerrypng.png", "gato e rato");
        //ImagemComEtiqueta imagemEtiqueta3 = new ImagemComEtiqueta("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\bugsbunny.png", "coelho");
        //imagemEtiqueta.mostrarDados(imagemEtiqueta);

        Album album = new Album();

        album.adicionarImagem("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\jerry.png", "rato");
        //album.mostrarDados(imagemEtiqueta);
        album.adicionarImagem("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\tomjerrypng.png", "gato e rato");
        //album.mostrarDados(imagemEtiqueta2);
        album.adicionarImagem("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\bugsbunny.png", "coelho");
        album.adicionarImagem("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\supermario.png", "mario");

        //album.pixelizarImagemExibicao();
       /* album.imagemExibicao();
        album.imagemSeguinte();
        System.out.println("-------------------------------------------------");
        album.imagemExibicao();
        album.imagemSeguinte();
        System.out.println("-------------------------------------------------");
        album.imagemExibicao();
        System.out.println("-------------------------------------------------");
        album.imagemAnterior();
        album.imagemExibicao();
        System.out.println("-------------------------------------------------");
        album.aumentarImagemExibicao();
        System.out.println("-------------------------------------------------");
        album.pixelizarImagemExibicao();*/
        //album.getImagens();
        //album.obterImagemReduzidaAnterior();
        album.obterImagemExibicao();
        System.out.println("-------------------------------------------------");
         album.obterImagemReduzidaSeguinte();
        //System.out.println("-------------------------------------------------");
        album.mudarImagemSeguinte ();
        System.out.println("-------------------------------------------------");
        album.obterImagemExibicao();
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        // album.mudarImagemSeguinte ();
        //album.obterImagemExibicao();
        //album.mudarImagemSeguinte ();
        //album.obterImagemExibicao();
        //album.mostrarTodoAlbum ();

    }
}
