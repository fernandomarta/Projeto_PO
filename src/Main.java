import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ManipuladorDeImagens manipuladorDeImagens;

        ImagemACores tomEJerry = new ImagemACores("C:\\Users\\joaos\\IdeaProjects\\ProjectoPO\\imagens\\tomjerrypng.png");
        ImagemACores bugsBunny = new ImagemACores("C:\\Users\\joaos\\IdeaProjects\\ProjectoPO\\imagens\\bugsbunny.png");
        //ImagemACores tomEJerry = new ImagemACores("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto\\images\\tomjerrypng.png");
        //ImagemACores bugsBunny = new ImagemACores("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto\\images\\bugsbunny.png");

        Album album = new Album();

        ImagemComEtiqueta imagem1 = new ImagemComEtiqueta("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto\\images\\bugsbunny.png");
        ImagemComEtiqueta.mudarNomeImagem("tomtom");
        System.out.println(album.imagem1.nomeImagem);

        //ImagemACores tomEJerryReduzido = ManipuladorDeImagens.reduzImagem(tomEJerry, valorEscala);
       // ImagemACores bugsBunnyReduzido = ManipuladorDeImagens.reduzImagem(bugsBunny, valorEscala);
       //ImagemACores bugsBunnyPixel = ManipuladorDeImagens.pixelizaImagem(bugsBunny, valorEscala);
        //ImagemACores tomEJerryPixel = ManipuladorDeImagens.pixelizaImagem(tomEJerry, valorEscala);
        //ImagemACores bugsBunnyReduzido = ManipuladorDeImagens.aumentaImagem(tomEJerry);
    }

    }
