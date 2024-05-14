
package mycompany2;

public class MyCompany2 {

    public static void main(String[] args) {
       Number number = new Number();
       number.setDigit(true);
       number.setValueNumber(1);
       
       Number number2 = new Number();
       number2.setDigit(true);
       number2.setValueNumber(4);
       
       Number numbers[] = {number,number2};
       NumberService numberService = new NumberService();
       
        System.out.println("Son digitos = " + numberService.countDigit(numbers));
        System.out.println("No son digitos = " + numberService.notDigit(numbers));
        System.out.println("Son pares = " + numberService.Even(numbers));
      
    }
    
}
