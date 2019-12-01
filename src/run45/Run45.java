/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package run45;

import run45.Controller.MainController;
import run45.Util.UI;

/**
 *
 * @author thor
 */
public class Run45 {
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		UI ui = new UI();
		MainController dc = new MainController(ui);
		dc.runProgram();
	}
	
}