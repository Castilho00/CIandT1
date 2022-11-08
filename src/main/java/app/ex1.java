package app;

import java.util.*;

public class ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Double> distPostos = new ArrayList<>();

        System.out.print("quanto litros ha disponivel? ");
        double qtd = input.nextDouble();
        System.out.print("qual o consumo medio do automovel? ");
        double consMedio = input.nextDouble();

        System.out.println("Insira as distancias em km dos postos de gasolina (para cancelar a insercao das distancias, pressione 0:");
        int op = 1;
        int i = 0;
        while (op != 0) {
            i += 1;
            System.out.println("posto #" + i + ": ");
            double posto = input.nextDouble();
            distPostos.add(posto);
            System.out.print("continuar? (1 - sim / 0 - nao): ");
            op = input.nextInt();
        }

        double totalKM = qtd * consMedio;

        System.out.println("\nVoce pode percorrer: " + totalKM + "km\n");

        Collections.sort(distPostos);
        for (int j = 0; j < distPostos.size(); j++) {
            if (distPostos.get(j) > totalKM) {
                if (j == 0) {
                    System.out.println("-1");
                } else {
                    System.out.println("Posto mais longe possivel a se chegar: " + distPostos.get(j - 1) + "km");
                }
                break;
            }
        }
        input.close();
    }
}
