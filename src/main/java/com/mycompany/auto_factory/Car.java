
package com.mycompany.auto_factory;


public class Car {
    
    private String model;
    private int bulidYear;
    private String color;
    private int maxSpeed;
    private int ccm;
    private int consumption;
    
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String customModel) {
        this.model = customModel;
    }

    public int getBulidYear() {
        return bulidYear;
    }

    public void setBulidYear(int bulidYear) {
        this.bulidYear = bulidYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCcm() {
        return ccm;
    }

    public void setCcm(int ccm) {
        this.ccm = ccm;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
    
    public void printAttributes(){
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje: " + this.getBulidYear());
        System.out.println("Ccm: " + this.getCcm());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Potrosnja: " + this.getConsumption());
        System.out.println();
    }
    
}
