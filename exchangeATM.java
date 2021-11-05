
import java.util.Scanner;
// version 4.0
public class Main{
      static final double ROUBLES_PER_DOLLAR = 72.12; // курс покупки
      public static void main (String[] args){
        // конвертаци долларов в рубли
        final double ROUBLES_PER_DOLLAR = 72.12; // курс покупки
        int dollars; // сумма денег в американских долларах
        double roubles; // сумма денег в российских рублях
        int digit; // последняя цифра dollars
        int i;
        int n;
        insructions();
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Введите корректное кол-во конвертаций");
            n = input.nextInt();
        } while (n<=0);
        
        for (i=0; i<n; ++i){
            System.out.println("Введите внесенную сумму в долларах: ");
            dollars = input.nextInt();
            roubles = findRoubles(dollars);
            digit = dollars % 10;
        
            if (digit == 1) 
                System.out.println(dollars + " американский доллар равен " + (int)(roubles * 100) / 100.0 + " рублей");
            else if (digit >= 2 && digit <= 4)
                System.out.println(dollars + " американских доллара равны " + (int)(roubles * 100) / 100.0 + " рублей");
            else
                System.out.println(dollars + " американских долларов равны " + (int)(roubles * 100) / 100.0 + " рублей");
        }
    
    }
    
    public static void insructions(){
        System.out.println("Инструкции. Необходимо ввести положительное количество\n" + 
                        "конвертаций и для каждой указать сумму. Конвертация по курсу 1 доллар = 72.12 рублей");    
    }
    
    public static double findRoubles(int dollars){
        return ROUBLES_PER_DOLLAR * dollars;
    }
}
