/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpecialNumbers;

/**
 *
 * @author onurc
 */
public class ArmstrongAndPalindrome {
    
    int[] numbers=new int[10];
    int[] numberOfDigits = new int[10];
    int[] reversedNumberHolderr = new int [10];
    int birler,onlar,yuzler,binler,onBinler,yuzBin,milyon;
    int tempNumberHolder;
    int j,n,d,c,e,f,h,o,l=0;  
    int z;
    int[] resultHolder = new int [10]; 
    
    
    public void ArmstrongAndPalindrome(){
        
   }
  
    public int birler(int tempNumberHolder){
        
         birler =tempNumberHolder%10;
           
        return birler;
    }
    public int onlar(int tempNumberHolder){
        
        onlar=tempNumberHolder%100/10;
         
        return onlar;
    }
    public int milyon(int tempNumberHolder){
        milyon=tempNumberHolder/1000000;
        return milyon;
        
    }
    public int yuzBin(int tempNumberHolder){
        yuzBin=tempNumberHolder%1000000/100000;
        return yuzBin;
    }
    public int onBinler(int tempNumberHolder){
        onBinler=tempNumberHolder%100000/10000;
        return onBinler;
    }
    public int binler(int tempNumberHolder){
        binler=tempNumberHolder%10000/1000;
        return binler;
    }
    public int yuzler(int tempNumberHolder){
        yuzler=tempNumberHolder%1000/100;
        return yuzler;
    }
    
    public void sayiAtama(){
         
 
for (int i = 0; i < 10; i++){
tempNumberHolder = (int) (Math.random() * 1500000+11); 
for (j = 0; j <= i; j++){
if (numbers[j] == tempNumberHolder) {    
tempNumberHolder = (int) (Math.random() * 1500000+11); 
j=0;
}
}
numbers[i] = tempNumberHolder; 

} for ( j = 0; j < 10; j++){
System.out.println(j+1 + ".Sayı : " +numbers[j]+" ");

}



    }
  
          
        
       public void armstrong(){    
       for( z=0;z<numbers.length;z++) {  
             int x=1,y=1;
         
             while(numbers[z]/x>9){
            x=x*10;
            y++;
         this.numberOfDigits[z]=y;  
         
        }                            
           
       n=   (int) Math.pow(milyon(numbers[z]), numberOfDigits[z]); 
       c=    (int) Math.pow(yuzBin(numbers[z]), numberOfDigits[z]);
       d=  (int) Math.pow(onBinler(numbers[z]), numberOfDigits[z]);
       e=   (int) Math.pow(binler(numbers[z]), numberOfDigits[z]);
       f=    (int) Math.pow(yuzler(numbers[z]), numberOfDigits[z]);
       h=    (int) Math.pow(onlar(numbers[z]),numberOfDigits[z]);
       o=    (int) Math.pow(birler(numbers[z]), numberOfDigits[z]);
       int toplam = n + c + d + e + f + h + o;  
       resultHolder[z]=toplam; 
       
       
           
          
         
       }
        
           
        for( z=0;z<numbers.length;z++) {
              if (resultHolder[z] == numbers[z]){ 
                l++;
          System.out.println(z+1+ ".Sırada bulunan ve indeks numarası: "+ z + " olan " +numbers[z]+" Sayısı " +" Armstrong sayisidir");
         
          }
        
        }
        if(l==0){
            System.out.println("Dizide Armstrong sayi yoktur");
        }
        
        
     
           }
    public void palindrome(){
        int t =0;
 for(int i=0;i<numbers.length;i++)  {
    
        tempNumberHolder = numbers[i];  
        int tersi = 0; 
        int yedek=tempNumberHolder; 
          
        
        

        for(;tempNumberHolder != 0; tempNumberHolder /= 10) { 
           
           int basamak = tempNumberHolder % 10;  
            tersi = tersi * 10 + basamak;  
       
        
           }
        reversedNumberHolderr[i]=tersi; 
            if(yedek == reversedNumberHolderr[i]){  
       
               System.out.println(i+1 +".Sırada bulunan ve indeks numarası: "+ i +" olan " + yedek + " sayisi palindrome sayıdır.");
        t++;
           
        }
           
     }
      if(t==0) {
            System.out.println("Palindrome sayı yok.");
     
       
        
       }
       
 }
    
}
