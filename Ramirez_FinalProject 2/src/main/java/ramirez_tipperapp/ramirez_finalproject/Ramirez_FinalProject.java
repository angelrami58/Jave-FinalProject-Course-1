/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ramirez_tipperapp.ramirez_finalproject;

/**
 *
 * @author angelramirez-rivera
 */
public class Ramirez_FinalProject {

    public static void main(String[] args) {
       Model model = new Model(0, 0);
        View view = new View(model);
        Controller controller = new Controller(model, view);

        controller.run();
    }
}
