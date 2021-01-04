/*
public class ManipuladorDeImagens {

    private static int larguraCorrigida;
    private static int alturaCorrigida;
    private static int escala;

    ImagemACores imagem = new ImagemACores(20, 20);

// REDUZ ***********************************************************************************************************************

    public static ImagemACores reduzImagem(ImagemACores imagemAAlterar, int escala) {



        return cicloPixeis(imagemAAlterar, escala);

        /*
        int larguraDaImagemAAlterar = imagemAAlterar.obterLargura();
        int alturaDaImagemAAlterar = imagemAAlterar.obterAltura();
        int larguraMax = ((int)larguraDaImagemAAlterar/escala)*escala;
        int alturaMax = ((int)alturaDaImagemAAlterar/escala)*escala;

        //int valorEscala;
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("indique a escala ");
        //valorEscala = scanner.nextInt();

        // O que é que acontece se a escala for ímpar?
        // O que é que acontece se a imagem não for quadrada?
        // O que é que acontece, se as dimensões da imagem destino não baterem certo com a escala?

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

        // Isto não é suposto ficar aqui, é só para testes!
        imagemNova.escreverParaDisco("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\bugsbunny_reduz.png", "png");

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
        imagemMaior.escreverParaDisco("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\bugsbunny_aumenta.png","png");
        return imagemMaior;
        }

// PIXELIZA *************************************************************************************************************************
public static  ImagemACores pixelizaImagem(ImagemACores imagemAPixelizar, int escala) {
        //int largura = imagemAPixelizar.obterLargura();
        //int altura = imagemAPixelizar.obterAltura();



        return cicloPixeis(imagemAPixelizar, escala);




        }

//Metodo para ler os pixeis à volta ******************************************************************************

public static ImagemACores cicloPixeis(ImagemACores imagemAManipular, int escala) {
        int largura = imagemAManipular.obterLargura();
        int altura = imagemAManipular.obterAltura();
        //ajustar as medidas para evitar sair dos limites da imagem:
        int larguraCorrigida= ((int)largura/escala)*escala;
        int alturaCorrigida= ((int)altura/escala)*escala;

        ImagemACores imagemResultante = new ImagemACores(larguraCorrigida, alturaCorrigida);

        for(int xQuadradoFora = 0; xQuadradoFora < larguraCorrigida; xQuadradoFora+=escala) {
        for (int yQuadradoFora = 0; yQuadradoFora < alturaCorrigida; yQuadradoFora += escala) {

        int acumulaR = 0;
        int acumulaG = 0;
        int acumulaB = 0;

        for (int xQuadradoDentro = xQuadradoFora; xQuadradoDentro < xQuadradoFora + escala; xQuadradoDentro++) {
        for (int yQuadradoDentro = yQuadradoFora; yQuadradoDentro < yQuadradoFora + escala; yQuadradoDentro++) {
        Cor corDoPixel = imagemAManipular.obterCor(xQuadradoDentro, yQuadradoDentro);

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

        imagemResultante.mudaCor(xQuadradoDentro, yQuadradoDentro, corNova);
        }
        }
        }
        }

        imagemResultante.escreverParaDisco("C:\\Users\\ferna\\IdeaProjects\\Piaget\\Projeto_PO\\images\\bugsbunny_pixel.png", "png");

        return imagemResultante;
        }


        }

 */
