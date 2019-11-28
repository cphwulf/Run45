/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run45.Controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import run45.Model.*;
import run45.Util.*;
import run45.View.*;

/**
 *
 * @author thor
 */
public class RegMemberController {
	int choice =0;

	public void runProgram() {
		HashMap<String,String> memParams = new HashMap<>();
		UI ui = new UI();
		RegisterMemberUI regMember =  new RegisterMemberUI(ui, memParams);
		regMember.getmemberParams();
		Set<String> keys = memberParams.keySet();
		for (String  key: keys) {
			System.out.println(key + " -> " + memberParams.get(key));
		}
		Member member = new member();
		member.setmembername(memberParams.get("Name"));
		member.setBreed(memberParams.get("Breed"));
		member.setColor(memberParams.get("Color"));
		member.setCityOrigin(memberParams.get("CityOfOrigin"));
		member.setAge(Integer.parseInt(memberParams.get("Age")));
		System.out.println("member " + member);

	}
	
}
