package Etapa2;

public class C09ex10 {
    public static void main(String[] args) {
        //Raphael Augusto de Paula Freitas
        double num, den, serie = 0, num2, den2, serie2 = 0, num3, den3, serie3 = 0, num4, den4, serie4 = 0, num5, den5, serie5 = 0, num6, den6, serie6 = 0;

        for (int aux = 1; aux <= 100; aux++) {
            num = aux;
            den = Math.sqrt(aux * 2);
            num2 = aux * 2;
            den2 = aux * 3;
            num3 = (aux - 1) * 2 + 1;
            den3 = aux * 2;
            num4 = aux + (aux - 1);
            den4 = Math.pow(aux, 2);
            num5 = aux;
            den5 = 3 * aux * 2;
            num6 = Math.pow(aux, 2);
            den6 = Math.pow(aux * 2, 2);

            serie += num / den;
            serie2 += num2 / den2;
            serie3 += num3 / den3;
            serie4 += num4 / den4;
            serie5 += num5 / den5;
            serie6 += num6 / den6;
        }
        serie2 = 1 + Math.sqrt(serie2);
        serie3 = 1 / 3.0 * Math.pow(serie3, 2);
        System.out.print("Valor da Série = " + serie + "\nValor da Série 2 = " + serie2 + "\nValor da Série 3 = " + serie3 + "\nValor da Série 4 = " + serie4 + "\nValor da Série 5 = " + serie5 + "\nValor da Série 6 = " + serie6);

    }
}
