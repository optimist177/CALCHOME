
package CALCHOME;

import java.util.Scanner;
public class CalcHome {
    
    boolean nevernoperator(String c){
        boolean x = true;
        switch(c){
            case("+"):x = false;break;
            case("-"):x = false;break;
            case("*"):x = false;break;
            case("/"):x = false;break;
        }
        return x;
    }
    
    int vichislenie(int a,int b,String c){
    int x = 999;
    switch(c){
            case("+"):x = a + b;break;
            case("-"):x = a - b;break;
            case("*"):x = a * b;break;
            case("/"):x = a / b;break;
        }
        return x;
    }
    
     int arab(String a){
        String  x = a;
        int n = -1;
        switch(x){
            case "1" : n = 1;break;
            case "2" : n = 2;break;
            case "3" : n = 3;break;
            case "4" : n = 4;break;
            case "5" : n = 5;break;
            case "6" : n = 6;break;
            case "7" : n = 7;break;
            case "8" : n = 8;break;
            case "9" : n = 9;break;
            case "10" : n = 10;break;
        }  
        return n;    
    }
     
    int rome(String a){
        String  x = a;
        int n = -1;
        switch(x){
            case "I": n = 1;break;  
            case "II": n = 2;break;
            case "III": n = 3;break;
            case "IV": n = 4;break;
            case "V": n = 5;break;
            case "VI": n = 6;break;
            case "VII": n = 7;break;
            case "VIII": n = 8;break;
            case "IX": n = 9;break;
            case "X": n = 10;break;
        }  
        return n;
    }
    
    
    
    public static void main(String[] args) throws ScannerException{
        String [] rommassiv = {"0","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII",
        "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI",
        "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV",
        "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV",
        "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
        "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        
        Scanner s = new Scanner(System.in);             
        System.out.println("введите числа");
        String str1 = s.nextLine();                 
        String [] massivStr = str1.split(" ");
        CalcHome calc = new CalcHome();
        if (massivStr.length < 3){
            throw new ScannerException("строка не является математической операцией");
        }else if(massivStr.length > 3 || calc.nevernoperator(massivStr [1])){
            throw new ScannerException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }else{
            if ((calc.arab(massivStr[0]) != -1) && (calc.arab(massivStr[2]) != -1)){
                System.out.println(calc.vichislenie(calc.arab(massivStr[0]),calc.arab(massivStr[2]),massivStr[1]));
            }else if((calc.rome(massivStr[0]) != -1) && (calc.rome(massivStr[2]) != -1)){
                if(calc.vichislenie(calc.rome(massivStr[0]),calc.rome(massivStr[2]),massivStr[1]) >= 0){
                    System.out.println(rommassiv [(calc.vichislenie(calc.rome(massivStr[0]),calc.rome(massivStr[2]),massivStr[1]))]);
                 }else{
                   throw new ScannerException("в римской системе нет отрицательных чисел"); 
                }
            }else{
                throw new ScannerException("Некорректные ввод: можно используются одновременно только одинаковые системы счисления. Значений должны быть от 1 до 10 или от I до X");
            }
        }
    }
}
