/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nils_krille_java;

/**
 *
 * @author nils
 */
public class Nils_krille_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x = 100000;
        while (true) {
            System.out.print(x);
            x--;
            if (x % 2 == 0) {
                System.out.print(" <--mod 2");
            }
            if (x % 3 == 0) {
                System.out.print(" <--mod 3");
            }
            System.out.print("\n");
            if (x <= 0) {
                System.out.print("fuck this shit\n");
                System.out.print("fuck this shit\n");
                System.exit(0);
            }
        }
    }

}
