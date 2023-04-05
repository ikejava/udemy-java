package labs;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Money {

    Locale localBrasil = new Locale("pt", "BR");        
        
    final double realEuro = 5.54;//ponha o valor da taxa aq
    final double realDolar = 5.08;//ponha o valor da taxa aq
    //ponha o valor da taxa aq

    
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    double valor = sc2.nextDouble();
    double real = valor*12;
    double dolar = calculaValor(valor, realDolar);
    double euro = calculaValor(valor, realEuro);
    double mensal = valor;

    
    System.out.println("salario mensal em euro: " + NumberFormat.getCurrencyInstance(Locale.GERMANY).format(euro));
    System.out.println("salario anual em reais: " + NumberFormat.getCurrencyInstance(localBrasil).format(real));
    System.out.println("salario mensal em dolar: " + NumberFormat.getCurrencyInstance(Locale.US).format(dolar));
    System.out.println("salario mensal em reais: " + NumberFormat.getCurrencyInstance(localBrasil).format(mensal));
    


    sc.close();
    sc2.close();
        
    

    public static double calculaValorReal(double valor, double taxa ){
    
        double total = 0.00;
        
        total = valor*taxa;


        return total ;
    }

    public static double calculaValor(double valor, double taxa ){
    
        double total = 0.00;
        
        total = valor/taxa;


        return total ;
    }

}