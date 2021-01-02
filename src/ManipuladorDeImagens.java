import java.util.Scanner;

public class ManipuladorDeImagens {

    ImagemACores imagem = new ImagemACores(20, 20);

// REDUZ ***********************************************************************************************************************

    public static ImagemACores reduzImagem(ImagemACores imagemAAlterar, int escala) {

        int larguraDaImagemAAlterar = imagemAAlterar.obterLargura();
        int alturaDaImagemAAlterar = imagemAAlterar.obterAltura();
        int larguraMax = ((int)larguraDaImagemAAlterar/escala)*escala;
        int alturaMax = ((int)alturaDaImagemAAlterar/escala)*escala;

        int valorEscala;
        Scanner scanner = new Scanner(System.in);
        System.out.println("indique a escala ");
        valorEscala = scanner.nextInt();

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

        for(int xQuadradoFora = 0; xQuadradoFora < larguraMax; xQuadradoFora+=escala) {
            for(int yQuadradoFora = 0; yQuadradoFora < alturaMax; yQuadradoFora+=escala) {

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
        imagemNova.escreverParaDisco("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto\\images\\bugsbunny_reduz.png", "png");

        return imagemNova;
    }

// AUMENTA ***************************************************************************************************************************

    public static ImagemACores aumentaImagem(ImagemACores imagemAAumentar) {

        int larguraDaImagemAAlterar = imagemAAumentar.obterLargura();
        int alturaDaImagemAAlterar = imagemAAumentar.obterAltura();


        ImagemACores imagemMaior = new ImagemACores(larguraDaImagemAAlterar * 3, alturaDaImagemAAlterar * 3);

        int acumulaR ;
        int acumulaG ;
        int acumulaB ;

        for (int xQuadradoVerdadeiro = 1; xQuadradoVerdadeiro < larguraDaImagemAAlterar-1; xQuadradoVerdadeiro+=1) {
            for (int yQuadradoVerdadeiro = 1; yQuadradoVerdadeiro < alturaDaImagemAAlterar-1; yQuadradoVerdadeiro+=1) {

                acumulaR=0;
                acumulaG=0;
                acumulaB=0;


                for (int xQuadradoGrande = xQuadradoVerdadeiro - 1; xQuadradoGrande <= xQuadradoVerdadeiro + 1; xQuadradoGrande++) {
                    for (int yQuadradoGrande = yQuadradoVerdadeiro - 1; yQuadradoGrande <= yQuadradoVerdadeiro + 1; yQuadradoGrande++) {

                        Cor corDoPixel = imagemAAumentar.obterCor(xQuadradoGrande, yQuadradoGrande);

                        int r = corDoPixel.obterR();
                        int g = corDoPixel.obterG();
                        int b = corDoPixel.obterB();

                        acumulaR += r;
                        acumulaG += g;
                        acumulaB += b;
                    }
                }
                            int mediaR = acumulaR / 9;
                            int mediaG = acumulaG / 9;
                            int mediaB = acumulaB / 9;


                            Cor corNova = new Cor(mediaR, mediaG, mediaB);

                            for (int x = (xQuadradoVerdadeiro + (2*xQuadradoVerdadeiro)); x <= (xQuadradoVerdadeiro + (2*xQuadradoVerdadeiro)) + 2; x+=1)
                                for (int y = (yQuadradoVerdadeiro + (2 * yQuadradoVerdadeiro)); y <= (yQuadradoVerdadeiro + (2 * yQuadradoVerdadeiro)) + 2; y+=1)

                                    imagemMaior.mudaCor(x, y, corNova);


            }

        }
        imagemMaior.escreverParaDisco("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto\\images\\bugsbunny_aumenta.png","png");
        return imagemMaior;
    }

// PIXELIZA *************************************************************************************************************************
    public static ImagemACores pixelizaImagem(ImagemACores imagemAPixelizar, int escala) {
        int largura = imagemAPixelizar.obterLargura();
        int altura = imagemAPixelizar.obterAltura();
        int larguraMax= ((int)largura/escala)*escala;
        int alturaMax= ((int)altura/escala)*escala;

        ImagemACores imagemNova = new ImagemACores(largura, altura);

        for(int xQuadradoFora = 0; xQuadradoFora < larguraMax; xQuadradoFora+=escala) {
            for (int yQuadradoFora = 0; yQuadradoFora < alturaMax; yQuadradoFora += escala) {

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

        imagemNova.escreverParaDisco("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto\\images\\bugsbunny_pixel.png", "png");

        return imagemNova;
    }
}
