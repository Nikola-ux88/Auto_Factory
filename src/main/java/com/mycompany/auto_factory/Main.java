
package com.mycompany.auto_factory;


public class Main {

   
    public static void main(String[] args) {
        System.out.println("Pocetak");
        
        Car AudiA3 = new Car();
        
        AudiA3.setModel("Audi A3");
        AudiA3.setBulidYear(2015);
        AudiA3.setColor("Black");
        AudiA3.setCcm(2000);
        
        AudiA3.printAttributes();
        
        Car FiatPunto = new Car();
        
        FiatPunto.setModel("Fiat Panda");
        FiatPunto.setBulidYear(2002);
        FiatPunto.setColor("Green");
        
        FiatPunto.printAttributes();
        
        Car Lada = new Car();
        
        Lada.setModel("Lada Niva");
        Lada.setMaxSpeed(118);
        
        Lada.printAttributes();
        
        
        
                
        
    

    
}
