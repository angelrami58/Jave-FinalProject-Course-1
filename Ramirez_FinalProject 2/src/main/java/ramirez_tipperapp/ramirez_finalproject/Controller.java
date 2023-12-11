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
public class Controller {
       private Model model;
       private View view;
       private Scanner scanner;

 public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }
      
 public void run() {
    boolean running = true;
    view.printWelcomeMessage();
    while (running) {
        
        view.updateModel();
        view.printNetIncome();
        view.printRunAgainPrompt();
        String answer = scanner.nextLine();

        if (!answer.equalsIgnoreCase("yes")) {
            running = false;
        }
    }
 }   
}