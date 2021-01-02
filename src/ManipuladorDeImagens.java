

public class ManipuladorDeImagens {

    ImagemACores imagem = new ImagemACores(20, 20);

    public static ImagemACores reduzImagem(ImagemACores imagemAAlterar, int escala) {

        int larguraDaImagemAAlterar = imagemAAlterar.obterLargura();
        int alturaDaImagemAAlterar = imagemAAlterar.obterAltura();

        // O que é que acontece se a escala for ímpar?
        // O que é que acontece se a imagem não for quadrada?
        // O que é que acontece, se as dimensões da imagem destino não baterem certo com a escala?

        ImagemACores imagemNova = new ImagemACores(larguraDaImagemAAlterar/escala, alturaDaImagemAAlterar/escala);

        // Imagem 4x4
        //   0      1     2     3
        //0: [0, 0][0, 1][0, 2][0, 3]
        //1: [1, 0][1, 1][1, 2][1, 3]
        //2: [2, 0][2, 1][2, 2][2, 3]
        //3: [3, 0][3, 1][3, 2][3, 3]

        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        for(int xQuadradoFora = 0; xQuadradoFora < larguraDaImagemAAlterar; xQuadradoFora+=escala) {
            for(int yQuadradoFora = 0; yQuadradoFora < alturaDaImagemAAlterar; yQuadradoFora+=escala) {

                int acumulaR = 0;
                int acumulaG = 0;
                int acumulaB = 0;

                for(int xQuadradoDentro = xQuadradoFora; xQuadradoDentro < xQuadradoFora + escala ; xQuadradoDentro++) {
                    for(int yQuadradoDentro = yQuadradoFora; yQuadradoDentro < yQuadradoFora + escala ; yQuadradoDentro++) {
                        Cor corDoPixel = imagemAAlterar.obterCor(xQuadradoDentro, yQuadradoDentro);

                        int r = corDoPixel.obterR();
                        int g = corDoPixel.obterG();
                        int b = corDoPixel.obterB();

                        acumulaR += r;
                        acumulaG += g;
                        acumulaB += b;

                        int mediaR = acumulaR / ((int)Math.pow(escala, 2));
                        int mediaG = acumulaG / ((int)Math.pow(escala, 2));
                        int mediaB = acumulaB / ((int)Math.pow(escala, 2));

                        Cor corNova = new Cor(mediaR, mediaG, mediaB);

                        imagemNova.mudaCor(xQuadradoFora/escala, yQuadradoFora/escala, corNova);
                    }
                }
            }
        }

        // Isto não é suposto ficar aqui, é só para testes!
        imagemNova.escreverParaDisco("C:\\Users\\joaos\\IdeaProjects\\ProjectoPO\\imagens\\bugsbunny_reduz.png", "png");

        return imagemNova;
    }

    public static ImagemACores aumentaImagem(ImagemACores imagemAAumentar) {
        ImagemACores imagemMaior = new ImagemACores(0, 0);

        // aumentar a imagem (imagemAAumentar)

        return imagemMaior;
    }

    public static ImagemACores pixelizaImagem(ImagemACores imagemAPixelizar, int escala) {
        int largura = imagemAPixelizar.obterLargura();
        int altura = imagemAPixelizar.obterAltura();

        ImagemACores imagemNova = new ImagemACores(largura, altura);

        for(int xQuadradoFora = 0; xQuadradoFora < largura; xQuadradoFora+=escala) {
            for (int yQuadradoFora = 0; yQuadradoFora < altura; yQuadradoFora += escala) {

                int acumulaR = 0;
                int acumulaG = 0;
                int acumulaB = 0;

                for (int xQuadradoDentro = xQuadradoFora; xQuadradoDentro < xQuadradoFora + escala; xQuadradoDentro++) {
                    for (int yQuadradoDentro = yQuadradoFora; yQuadradoDentro < yQuadradoFora + escala; yQuadradoDentro++) {
                        Cor corDoPixel = imagemAPixelizar.obterCor(xQuadradoDentro, yQuadradoDentro);

                        int r = corDoPixel.obterR();
                        int g = corDoPixel.obterG();
                        int b = corDoPixel.obterB();

                        acumulaR += r;
                        acumulaG += g;
                        acumulaB += b;

                        int mediaR = acumulaR / ((int)Math.pow(escala, 2));
                        int mediaG = acumulaG / ((int)Math.pow(escala, 2));
                        int mediaB = acumulaB / ((int)Math.pow(escala, 2));

                        Cor corNova = new Cor(mediaR, mediaG, mediaB);

                        imagemNova.mudaCor(xQuadradoDentro, yQuadradoDentro, corNova);
                    }
                }
            }
        }

        imagemNova.escreverParaDisco("C:\\Users\\joaos\\IdeaProjects\\ProjectoPO\\imagens\\bugsbunny_pixel.png", "png");

        return imagemNova;
    }
}
