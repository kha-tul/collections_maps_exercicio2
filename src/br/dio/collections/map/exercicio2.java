package br.dio.collections.map;

import java.util.*;

public class exercicio2 {
    public static void main(String[] args) {
        int numeroLancamentos = 100;

        List<Integer> valores = new ArrayList<>();
        Random geradorDeLancamentos = new Random();
        for (int i = 0; i < numeroLancamentos; ++i) {
            int number = geradorDeLancamentos.nextInt(6) + 1;
            valores.add(number);
        }

        Map<Integer, Integer> lancamentos = new HashMap<>();
        for(Integer resultado : valores) {
            if(lancamentos.containsKey(resultado))
                lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
            else lancamentos.put(resultado, 1);
        }

        System.out.println("Jogando");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
                System.out.println(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n Valor " + " Quantidade de vezes");
        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
    }
}
