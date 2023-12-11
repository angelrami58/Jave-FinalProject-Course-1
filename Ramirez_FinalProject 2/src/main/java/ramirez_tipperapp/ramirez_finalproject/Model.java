/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramirez_tipperapp.ramirez_finalproject;
/**
 * Two strings are done in models in another location it is printed out
 * @author angelramirez-rivera
 */
public class Model {
    private double grossIncome;
    private double deductions;
    private double rent;
    private double carpayment;
    private double carinsurance;
    private double healthinsurance;
    private double medicalbills;
    private double gasoline;
    private double groceries;
    private double misc;
    
    private double netIncome;

    public Model(double grossIncome, double deductions) {
        this.grossIncome = grossIncome;
        this.deductions = rent + carpayment + carinsurance + healthinsurance + medicalbills + gasoline + groceries + misc;
        this.netIncome = grossIncome - deductions;
    }

    public double getGrossIncome() {
        return grossIncome;
    }
 
    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

  
    public void calculateDeductions(double deductions) {
        this.deductions = Double.sum(rent,carpayment+carinsurance+healthinsurance+medicalbills+gasoline+groceries+misc);
    }
    
    public void getRent(){
        
    }
    
     public void setRent(double rent){
        this.rent = rent;
    }
     
     public void getCarpayment(){
       
    }
     
     public void setCarpayment(double carpayment){
        this.carpayment = carpayment;
    }
     
     public void getCarinsurance(){
        
    }
     
     public void setCarinsurance(double carinsurance){
        this.carinsurance = carinsurance;
    }
     
     public void getMedicalBills(){
        
    }
     
     public void setMedicalBills(double medicalbills){
        this.medicalbills = medicalbills;
    }
     
     public void getHealthInsurance(){
        
    }
     public void setHealthInsurance(double healthinsurance){
        this.healthinsurance = healthinsurance; 
    }
     
     public void getGasoline(){
        
    } 
     
     public void setGasoline(double gasoline){
        this.gasoline = gasoline;
    } 
     
     public void getGroceries(){
        
    } 
     
     public void setGroceries(double groceries){
        this.groceries = groceries;
    }
     
     public void getMisc(){
        
    }
    
     public void setMisc(double misc){
        this.misc = misc;
    }
        
    public double getNetIncome() {
        return netIncome;
    }

    public void calculateNetIncome() {
        this.netIncome = grossIncome - deductions;
    }
}
