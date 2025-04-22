public enum Estacoes{
    VERAO(new int[]{12, 1, 2}),
    OUTONO(new int[]{3, 4, 5}),
    INVERNO(new int[]{6, 7, 8}),
    PRIMAVERA(new int[]{9, 10, 11});

    private int[] meses;

    private Estacoes(int[] meses) {
        this.meses = meses;
    }

    public boolean contMes(int mes){
        for (int m : meses) {
            if (m == mes) {
                return true;
            }
        }
        return false;
    }

    public int[] getMeses() {
        return meses;
    }

    public void setMeses(int[] meses) {
        this.meses = meses;
    }
    
}

