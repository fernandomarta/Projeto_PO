/**
 * Representa uma ImagemACores.
 * Os dados da imagem estão representados numa matriz:
 * - O número de linhas da matriz corresponde à altura da imagem (dados.length)
 * - O tamanho das linhas da matriz corresponde à largura da imagem (dados[*].length) – onde * deverá ser um valor entre 0 e dados.length
 * - A cor do pixel está codificada como um inteiro (ARGB)
 */
class ImagemACores {

    private int[][] dados; // @aImagemACores

    ImagemACores (String ficheiro) {
        this.dados = ImageUtil.readColorImage(ficheiro);
    }

    ImagemACores (int largura, int altura) {
        dados = new int[altura][largura];
    }

    int obterLargura() {
        return dados[0].length;
    }

    int obterAltura() {
        return dados.length;
    }

    int[][] obterDados() { return dados; }

    void mudaCor(int x, int y, Cor c) {
        dados[y][x] = ImageUtil.encodeRgb(c.obterR(), c.obterG(), c.obterB());
    }

    Cor obterCor(int x, int y) {
        int[] rgb = ImageUtil.decodeRgb(dados[y][x]);
        return new Cor(rgb[0], rgb[1], rgb[2]);
    }

    void escreverParaDisco(String caminho, String formato) {
        ImageUtil.writeImage(this.dados, caminho, formato);
    }
}