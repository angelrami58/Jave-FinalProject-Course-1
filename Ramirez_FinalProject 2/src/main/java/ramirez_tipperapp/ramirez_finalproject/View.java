/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ramirez_tipperapp.ramirez_finalproject;
import java.util.Scanner;
/**
 *
 * @author angelramirez-rivera
 */
public class View {
    
    private Model model;
    private Scanner scanner;

    public View(Model model) {
        this.model = model;
        this.scanner = new Scanner(System.in);
    }

    public void printWelcomeMessage() {
        System.out.println("Welcome to Monthly Budgeting! It is a small helpful budgeting program to help with your monthly expensives.");
    }

    public void printGrossIncomePrompt() {
        System.out.println("Please enter your gross income: $");
    }
    
    public void printRentPrompt(){
        System.out.println("Enter the amount you pay for rent: $");
    }
    
    public void printCarpaymentPrompt(){
        System.out.println("Enter the amount you pay for your car: $" );
    }
    
    public void printCarinsurancePrompt(){
        System.out.println("Enter the amount you pay for car insurance: $");
    }
    
    public void printMedicalBillsPrompt(){
        System.out.println("Enter the amount you pay for any medical bills: $");
    }
    
    public void printHealthInsurancePrompt(){
        System.out.println("Enter the amount you pay for health insurance: $");
    }
    
    public void printGasolinePrompt(){
        System.out.println("Enter the amount you pay for gasoline for you car: $");
    }
    
    public void printGrociesPrompt(){
        System.out.println("Enter the amount you pay for groceries: $");
    }
    
    public void printMiscPrompt(){
        System.out.println("Enter the amount you pay for anything that can be under misc: $");
    }
     public void printDeductionsPrompt() {
        System.out.println("Total of your deductions is ");
    }

    public void printNetIncome() {
        System.out.println("Your net income is: $" + model.getNetIncome());
    }

    public void printRunAgainPrompt() {
        System.out.print("Would you like to  again? (yes or no): ");
    }
    
    public void updateModel() {
        
        printGrossIncomePrompt();
           double grossIncome = scanner.nextDouble();
              model.setGrossIncome(grossIncome);
           
           
        printRentPrompt();
         double rent = scanner.nextDouble();
            model.setRent(rent);
        
        printCarpaymentPrompt();
            double carPayment = scanner.nextDouble();
                model.setCarpayment(carPayment);
        
        printCarinsurancePrompt();
            double carInsurance = scanner.nextDouble();
                model.setCarinsurance(carInsurance);
        
        printMedicalBillsPrompt();
            double medicalBills = scanner.nextDouble();
                model.setMedicalBills(medicalBills);
        
        printHealthInsurancePrompt();
            double healthInsurance = scanner.nextDouble();
                model.setHealthInsurance(healthInsurance);
        
        printGasolinePrompt();
            double gasoline = scanner.nextDouble();
                model.setGasoline(gasoline);
        
        printGrociesPrompt();
            double grocies = scanner.nextDouble();
                model.setGroceries(grocies);
        
        printMiscPrompt();
          double misc = scanner.nextDouble();
            model.setMisc(misc);
        
        model.calculateNetIncome();
        
    }
}
