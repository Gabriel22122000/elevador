package elevador;

public class Configuracao {
    private static final int maxPessoas = 17;
    private static final int entradaPessoas = 1;
    private static final int saidaPessoas = 1;
    private static final int totaAndar = 10;
    private static final int upDown = 1;

    public static int getMaxPessoas() {
        return maxPessoas;
    }
    public static int getEntradaPessoas() {
        return entradaPessoas;
    }
    public static int getSaidaPessoas() {
        return saidaPessoas;
    }
    public static int getTotaAndar() {
        return totaAndar;
    }
    public static int getUpDown() {
        return upDown;
    }
}
