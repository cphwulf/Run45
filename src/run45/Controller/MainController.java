/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package run45.Controller;

import run45.Model.EmployeeList;
import run45.View.LoginMenu;
import run45.Util.UI;

/**
 *
 * @author thor
 */
public class MainController {
	private final UI ui;
	private final LoginHandler loginHandler;
	private EmployeeList employeeList;
	
	public MainController(UI ui) {
		employeeList = new EmployeeList();
		this.ui = ui;
		loginHandler = new LoginHandler();
		employeeList = new EmployeeList();
	}
	
	public void runProgram() {
		int inputValue = 0;
		boolean ok = false;
		while(!ok) {
			ok = loginHandler.userLogin(ui);
		}
		
	}
	
	
}
