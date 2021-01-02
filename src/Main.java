

public class Main {

    public static void main(String[] args) {
	// write your code here

        ManipuladorDeImagens manipuladorDeImagens;

        ImagemACores tomEJerry = new ImagemACores("C:\\Users\\joaos\\IdeaProjects\\ProjectoPO\\imagens\\tomjerrypng.png");
        ImagemACores bugsBunny = new ImagemACores("C:\\Users\\joaos\\IdeaProjects\\ProjectoPO\\imagens\\bugsbunny.png");

        ImagemACores tomEJerryReduzido = ManipuladorDeImagens.reduzImagem(tomEJerry, 2);
        ImagemACores bugsBunnyReduzido = ManipuladorDeImagens.reduzImagem(bugsBunny, 2);
        ImagemACores bugsBunnyPixel = ManipuladorDeImagens.pixelizaImagem(bugsBunny, 3);
        ImagemACores tomEJerryPixel = ManipuladorDeImagens.pixelizaImagem(tomEJerry, 2);
    }
}
