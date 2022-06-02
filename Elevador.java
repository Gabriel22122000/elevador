package elevador;

import java.util.Random;
public class Elevador extends Configuracao implements Face {
    public Elevador() {
        Random random = new Random();
        IniciarElevador(random.ints(1, 17).findFirst().getAsInt(), random.ints(1, 25).findFirst().getAsInt(), random.ints(0, 4).findFirst().getAsInt(), random.ints(0,5).findFirst().getAsInt());
    }

    public final void IniciarElevador(int UpDown, int maxPessoas, int entradaPessoas, int saidaPessoas) {
        if (UpDown > getTotaAndar()) {
            System.err.print(" O andar não existe : " + UpDown + " \n");
            return;
        }
        if (maxPessoas > getMaxPessoas()) {
            System.err.print("Máximo de pessoas permitido:" + getMaxPessoas() + " > entrou " + maxPessoas + " \n");
        }
        if (entradaPessoas > getEntradaPessoas()) {
            System.err.print("Máximo permitido de entrada por pessoa : " + getEntradaPessoas() + " > entrou " + entradaPessoas + " \n");
        }
        if (saidaPessoas > getSaidaPessoas()) {
            System.err.print("Máximo de pessoas permitido: " + getSaidaPessoas() + " > saida " + saidaPessoas + " \n");
        }
        System.out.print("------------- INFORMAÇOES -------------\n"
                + "Total de Andar :" + getTotaAndar() + "\n"
                + "Andar :" + UpDown + "\n"
                + "Pessoas :" + maxPessoas + "\n"
                + "Entrada :" + entradaPessoas + "\n"
                + "Saída :" + saidaPessoas + "\n"
                + "");
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Elevador();
        });
    }
}
