/**
 * Representa uma cor RGB.
 * Os valores RGB são guardados num array com 3 posições:
 * rgb[0] - Red
 * rgb[1] - Green
 * rgb[2] - Blue
 */
class Cor {
    private final int[] rgb; // @aCor
    // Cria uma cor RGB, dado que os valores estejam entre o intervalo de [0, 255]
    Cor(int r, int g, int b) {
        if(!valido(r) || !valido(g) || !valido(b))
            throw new IllegalArgumentException("Valores RGB inválidos: " + r + ", " + g + ", " + b);
        
        this.rgb = new int[] {r, g, b};
    }
    // Vermelho [0, 255]
    int obterR() {
        return rgb[0];
    }
    // Verde [0, 255]
    int obterG() {
        return rgb[1];
    }
    // Azul [0, 255]
    int obterB() {
        return rgb[2];
    }
    // Luminusidade [0, 255]
    int obterLuminusidade() {
        return (int) Math.round(rgb[0]*.21 + rgb[1]*.71 + rgb[2]*.08);
    }
    static boolean valido(int valor) {
        return valor >= 0 && valor <= 255;
    }
}
