package mycompany2;


public class NumberService {
    public int countDigit(Number numbers[]){
     int acco= 0;
        for (Number number: numbers){
      if(number.isDigit()){
      acco++;}      
     }
        return acco;
    }    
    public int notDigit(Number numbers[]){
     int acco= 0;
        for (Number number: numbers){
      if(!number.isDigit()){
      acco++;}      
     }
        return acco;
    }
    public int Even(Number numbers[]){
    int acco= 0;
     for (Number number: numbers){
      if(number.getValueNumber()%2==0){
      acco++;}
     }
      return acco;
      }
 
        
}
