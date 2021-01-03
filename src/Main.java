
public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("Working Directory = " + System.getProperty("user.dir"));


        ManipuladorDeImagens manipuladorDeImagens;

        // Manipulador Imagens testes

        //ImagemACores tomEJerry = new ImagemACores("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\tomjerrypng.png");
        ImagemACores bugsBunny = new ImagemACores("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\bugsbunny.png");
        //ImagemACores Jerry = new ImagemACores("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\jerry.png");

        //ImagemACores tomEJerryReduzido = ManipuladorDeImagens.reduzImagem(tomEJerry, 2);
        ImagemACores bugsBunnyReduzido = ManipuladorDeImagens.reduzImagem(bugsBunny, 3);
       //ImagemACores bugsBunnyPixel = ManipuladorDeImagens.pixelizaImagem(bugsBunny, 2);
        //ImagemACores tomEJerryPixel = ManipuladorDeImagens.pixelizaImagem(tomEJerry, 2);
        //ImagemACores JerryAumentado = ManipuladorDeImagens.aumentaImagem(Jerry);

        // ImagemComEtiqueta testes

        ImagemComEtiqueta imagemEtiqueta = new ImagemComEtiqueta("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\jerry.png", "rato");
        ImagemComEtiqueta imagemEtiqueta2 = new ImagemComEtiqueta("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\tomjerrypng.png", "gato e rato");
        ImagemComEtiqueta imagemEtiqueta3 = new ImagemComEtiqueta("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\bugsbunny.png", "coelho");
        //imagemEtiqueta.mostrarDados(imagemEtiqueta);
/*
        Album album = new Album();

        album.adicionaImagem(imagemEtiqueta);
        //album.mostrarDados(imagemEtiqueta);
        album.adicionaImagem(imagemEtiqueta2);
        //album.mostrarDados(imagemEtiqueta2);
        album.adicionaImagem(imagemEtiqueta3);
        //album.pixelizarImagemExibicao();
        album.imagemExibicao();
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
        album.pixelizarImagemExibicao();
    */
    }

}
