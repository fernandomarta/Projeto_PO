
public class Main {

    public static void main(String[] args) {


/*
        // Parte I: Métodos Úteis para a Manipulação de Imagens *********************************************************************

        // Carregar Imagens:
        ImagemACores bugsBunny = new ImagemACores("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\bugsBunny.png");
        ImagemACores tomEJerry = new ImagemACores("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\tomjerry.png");
        ImagemACores beepbeep = new ImagemACores("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\beepbeep.jpg");
        ImagemACores mickey = new ImagemACores("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\jerry.png");

        // Testar a Redução:
        ImagemACores mickeyReduz = ManipuladorDeImagens.reduzImagem(mickey, 4);

        // Testar a Pixelização:
        ImagemACores mickeyPix = ManipuladorDeImagens.pixelizaImagem(mickey, 3);

        // Testar o Aumento da Imagem:
        ImagemACores mickeyAumenta = ManipuladorDeImagens.aumentaImagem(mickey);

        //Habilitar o método escerverParaDisco, na Classe ManipuladorDeImagens, para se verificar o resultado das manipulações nas fotos!
*/


        // Parte II: A Classe Álbum  ***************************************************************************************************

        // ********  atenção: primeiro metodo a correr deverá ser Adicionar Imagem - adicionarImagem()

        Album album = new Album();

        album.adicionarImagem("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\jerry.png", "rato");
        album.adicionarImagem("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\tomjerry.png", "gatoErato");
        album.adicionarImagem("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\bugsbunny.png", "coelho");
        album.adicionarImagem("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\beepbeep.jpg", "runner");


        System.out.println("---------------------- Imagem em Exibição: ");
        album.obterImagemExibicao();
        System.out.println("---------------------- mudar imagem seguinte! ");
        album.mudarImagemSeguinte ();
        System.out.println("---------------------- Imagem em Exibição: ");
        album.obterImagemExibicao();
        System.out.println("---------------------- mudar imagem seguinte! ");
        album.mudarImagemSeguinte ();
        System.out.println("---------------------- Imagem em Exibição: ");
        album.obterImagemExibicao();
        System.out.println("---------------------- mudar imagem seguinte! ");
        album.mudarImagemSeguinte ();
        System.out.println("---------------------- Imagem em Exibição: ");
        album.obterImagemExibicao();

        System.out.println("---------------------- mudar para imagem anterior! ");
        album.mudarImagemAnterior ();
        System.out.println("---------------------- Imagem em Exibição: ");
        album.obterImagemExibicao();

        System.out.println("---------------------- ImagemReduzidaSeguinte ");
        album.obterImagemReduzidaSeguinte();
        System.out.println("---------------------- ImagemReduzidaAnterior ");
        album.obterImagemReduzidaAnterior();

        System.out.println(" ");
        System.out.println("---------------------- Ampliar Imagem ");
        album.ampliarImagem();
        System.out.println(" ");
        System.out.println("---------------------- Imagem em Exibição: ");
        album.obterImagemExibicao();

        System.out.println("---------------------- Pixelizar Imagem ");
        album.pixelarImagem();
        System.out.println("---------------------- Imagem em Exibição: ");
        album.obterImagemExibicao();

        System.out.println(" ");
        album.mostrarTodoAlbum ();

    }
}
