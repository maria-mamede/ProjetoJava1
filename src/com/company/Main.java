package com.company;

public class Main {

    public static void main(String[] args) {
        int tempMaisAlta, tempMaisBaixa, i, indexMax = 0, indexMin = 0;

        String[] cidades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo",
                "Lima", "Santiago de Chile", "Lisboa", "Tokio"};

        int[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39},
                {-7, 26}, {-1, 31}, {-10, 35}};

        tempMaisAlta = temperaturas[0][1];
        tempMaisBaixa = temperaturas[0][0];

        for(i=0; i<temperaturas.length; i++) {
            if(temperaturas[i][1] > tempMaisAlta) {
                tempMaisAlta = temperaturas[i][1];
                indexMax = i;
            }
        }

        System.out.println("A cidade com a temperatura mais alta foi " + cidades[indexMax] + " com " + tempMaisAlta + "ºC.");

        for(i=0; i< temperaturas.length; i++) {
            if(temperaturas[i][0] < tempMaisBaixa) {
                tempMaisBaixa = temperaturas[i][0];
                indexMin = i;
            }
        }

        System.out.println("A cidade com a temperatura mais alta foi " + cidades[indexMin] + " com " + tempMaisBaixa + "ºC.");
    }

}
