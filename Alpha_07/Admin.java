/********************************************
* Project Team:	
* Students: 
* Course: OOP 2015 Sem 1, HDIT
*
* Admin.java:
********************************************/

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Admin extends User{

// Declare data members
	public static int totalNoOfAdmin = 0;  // class data member

// Constructors
	Admin(int uid, String name, String pw) {
		super(uid, name, pw, 2);	//call superclass constructor
	}

// Methods
	// Print Admin information
	public void printUserInfo() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		System.out.println("-----------------------------------------------------");	
		System.out.println("-   \t\t" + getUserType() + " Information\t\t   -");
		System.out.println("-----------------------------------------------------");	
		System.out.println("User ID: \t  " + getUserID());
		System.out.println("User Name: \t  " + getUserName());
		System.out.println("User Email: \t  " + getUserEmail());
		System.out.println("User Phone: \t  " + getUserPhone());
		System.out.println("Date of register: " + sdf.format(dateOfRegister));
		System.out.println("Date of Birth: \t  " + sdf.format(dateOfBirth));
		System.out.println("-----------------------------------------------------");	
		System.out.println("End of Personal Infomation.\n");
	}
}