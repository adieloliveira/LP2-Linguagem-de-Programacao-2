// Adiel da Silva de Oliveira CB300726X

import java.util.Scanner;



public class TestStaff {

	public static void main(String[] args) {
		Staff staff = new Staff("stefany","emailauthor@author", "school", 100.0);

        System.out.println(staff.toString());

        staff.setAdress();
        staff.setSchool();
        staff.setPay();

        System.out.println(staff.getName());
        System.out.println(staff.getAdress());
        System.out.println(staff.getSchool());
        System.out.println(staff.getPay());
        
	}

}