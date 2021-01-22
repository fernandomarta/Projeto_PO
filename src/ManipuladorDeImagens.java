
public class ManipuladorDeImagens {


// METODO REDUZ IMAGEM ***********************************************************************************************************************

    public static ImagemACores reduzImagem(ImagemACores imagemAAlterar, int escala) {

        int larguraDaImagemAAlterar = imagemAAlterar.obterLargura();
        int alturaDaImagemAAlterar = imagemAAlterar.obterAltura();
        int larguraMax = ((int)(larguraDaImagemAAlterar)/escala)*escala;
        int alturaMax = ((int)(alturaDaImagemAAlterar/escala))*escala;


        ImagemACores imagemNova = new ImagemACores(larguraDaImagemAAlterar/escala, alturaDaImagemAAlterar/escala);



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

        // Habilitar o metodo escreverParaDisco para testar a PARTE I
        // imagemNova.escreverParaDisco("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\imagem_reduzida.png", "png");
        // System.out.println("Working Directory = " + System.getProperty("user.dir"));

        return imagemNova;
    }

// METODO AUMENTA IMAGEM ***************************************************************************************************************************

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
        // Habilitar o metodo escreverParaDisco para testar a PARTE I
        // imagemMaior.escreverParaDisco("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\imagem_aumentada.png","png");

        return imagemMaior;
    }

// METODO PIXELIZA IMAGEM *************************************************************************************************************************

    public static ImagemACores pixelizaImagem(ImagemACores imagemAPixelizar, int escala) {
        int largura = imagemAPixelizar.obterLargura();
        int altura = imagemAPixelizar.obterAltura();
        int larguraMax= ((int)(largura/escala))*escala;
        int alturaMax= ((int)(altura/escala))*escala;

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
        // Habilitar o metodo escreverParaDisco para testar a PARTE I
        // imagemNova.escreverParaDisco("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\imagem_pixelizada.png", "png");

        return imagemNova;
    }


 /*   // metodo para obter a média das cores dos pixeis adjacentes  ********************************************

    public static Cor obterMediaDaCor (ImagemACores imagemAManipular, ImagemACores imagemResultante, int largurafinal, int alturafinal, int escala) {
        Cor corNova;
        for (int xQuadradoReferencia = 0; xQuadradoReferencia < largurafinal; xQuadradoReferencia += escala) {
            for (int yQuadradoReferencia = 0; yQuadradoReferencia < alturafinal; yQuadradoReferencia += escala) {

                int acumulaR = 0;
                int acumulaG = 0;
                int acumulaB = 0;

                for (int xQuadradoAdjacente = xQuadradoReferencia; xQuadradoAdjacente < xQuadradoReferencia + escala; xQuadradoAdjacente++) {
                    for (int yQuadradoAdjacente = yQuadradoReferencia; yQuadradoAdjacente < yQuadradoReferencia + escala; yQuadradoAdjacente++) {
                        Cor corDoPixel = imagemAManipular.obterCor(xQuadradoAdjacente, yQuadradoAdjacente);

                        int r = corDoPixel.obterR();
                        int g = corDoPixel.obterG();
                        int b = corDoPixel.obterB();

                        acumulaR += r;
                        acumulaG += g;
                        acumulaB += b;
                    }
                }

                        int mediaR = acumulaR / ((int) Math.pow(escala, 2));
                        int mediaG = acumulaG / ((int) Math.pow(escala, 2));
                        int mediaB = acumulaB / ((int) Math.pow(escala, 2));

                        Cor corNova = new Cor(mediaR, mediaG, mediaB);

            }
        }
    return corNova;
    }

*/


}
