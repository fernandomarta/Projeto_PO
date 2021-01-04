
for(int xQuadradoReferencia = 0; xQuadradoReferencia < larguraCorrigida; xQuadradoReferencia+=escala) {
        for (int yQuadradoReferencia = 0; yQuadradoReferencia < alturaCorrigida; yQuadradoReferencia += escala) {

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

        int mediaR = acumulaR / ((int)Math.pow(escala, 2));
        int mediaG = acumulaG / ((int)Math.pow(escala, 2));
        int mediaB = acumulaB / ((int)Math.pow(escala, 2));

        Cor corNova = new Cor(mediaR, mediaG, mediaB);
