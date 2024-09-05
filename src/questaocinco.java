import java.util.HashMap;
import java.util.Map;

public class questaocinco {
    public static void main(String[] args) {

        Map<String, Boolean> lampadas = new HashMap<>();
        lampadas.put("Lâmpada 1", false);
        lampadas.put("Lâmpada 2", false);
        lampadas.put("Lâmpada 3", false);

        ligarInterruptor("Interruptor A");
        aguardar(5);
        desligarInterruptor("Interruptor A");
        ligarInterruptor("Interruptor B");
        aguardar(1);
        verificarLampadas(lampadas);
        exibirResultados();
    }

    private static void ligarInterruptor(String interruptor) {
        System.out.println(interruptor + " está ligado.");
    }

    private static void desligarInterruptor(String interruptor) {
        System.out.println(interruptor + " está desligado.");
    }

    private static void aguardar(int minutos) {
        System.out.println("Aguardando por " + minutos + " minutos...");
        try {
            Thread.sleep(minutos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void verificarLampadas(Map<String, Boolean> lampadas) {

        lampadas.put("Lâmpada 1", false);
        lampadas.put("Lâmpada 2", true);
        lampadas.put("Lâmpada 3", false);

        System.out.println("Verificação das lâmpadas concluída.");
    }

    private static void exibirResultados() {
        System.out.println("Interruptores e lâmpadas identificados:");
        System.out.println("Interruptor A - Lâmpada Desligada e Quente");
        System.out.println("Interruptor B - Lâmpada Acesa");
        System.out.println("Interruptor C - Lâmpada Desligada e Fria");
    }
}
