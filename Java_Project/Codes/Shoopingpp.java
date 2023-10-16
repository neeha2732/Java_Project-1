
package com.gqt.shoppingapplication.project;
import java.util.Scanner;
public class Shoopingpp {
	public static void changes() {
		Scanner sc=new Scanner(System.in);
		String key=sc.next();
		if(key.equalsIgnoreCase("yes")) {
			main(null);
		}
		else {

			System.out.println("Do you want to continue...");
			String key6=sc.next();
			if(key6.equalsIgnoreCase("yes")) {
				recipt();
			}
			else {

				System.out.println("do you want to change the product");
				String key7=sc.next();
				if(key7.equalsIgnoreCase("yes")) {
					main(null);
				}
				else {
					System.out.println("Do you want to exit");
					String key8=sc.next();
					if(key8.equalsIgnoreCase("yes")) {
						System.out.println("Thanks for visiting ....");
						System.exit(0);
					}
					else {
						main(null);
					}
				}
			}
		}
	}

	public static void recipt() {
		Scanner sc=new Scanner(System.in);
		System.out.println("OK....Do you want to proceed with the payment....!!!");
		String key=sc.next();
		if(key.equalsIgnoreCase("yes")) {
			System.out.println("The bill recipt for this Product ......\n");
		}
		else {
			System.out.println("Do you want to purchase another product....");
			String key2=sc.next();
			if(key2.equalsIgnoreCase("yes")) {
				main(null);
			}
			else {
				System.out.println("Thank you for visiting ");
				System.exit(0);
			}
		}
	}
	public static void recipt3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to purchase another product");
		String yes=sc.next();
		if(yes.equalsIgnoreCase("yes")) {
			main(null);
		}	
		else {
			System.out.println("Thank you for visiting");
			System.exit(0);
		}
	}
	public static void collectinput1() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("Do you want to see the specifications for this product \n");
		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t sofa");	
				System.out.println();
				System.out.println("2.quantity\t: \t 1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name  \t Color \t Quantity\t Price \n");
			System.out.println("Sofa  \t Black \t  1\t \t5000 \n");
			System.out.println("*************************  **************");
			System.out.println("Total amount is:                "+5000);
			System.out.println("************************  ***************");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t chair");	
				System.out.println();
				System.out.println("2.quantity\t: \t 1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("name  \t  color \tQuantity\t  price\n");
			System.out.println("chairs  \t  White \t 1\t 500 \n");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+500);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput2() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");

		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t comforter blanket");	
				System.out.println();
				System.out.println("2.quantity\t: \t  1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Type  \t  Color \t Quantity \t Price");
			System.out.println();
			System.out.println("Comforter blanket\t Multi colored \t 1 \t 150");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+150);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Duvet blanket");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Type  \t  color \t Quantity\t price");
			System.out.println();
			System.out.println("Duvet blanket  \t  black \t 1\t 250");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+250);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput3() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this item.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");

		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Nylon carpet");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Type  \t  Color \tQuantity \t Price");
			System.out.println();
			System.out.println("Nylon carpet \t  Multi colored \t 1\t 300");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+300);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Plush carpet");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Type  \t color \t Quantity\t price");
			System.out.println();
			System.out.println("plush carpet \t black \t 1\t 250 ");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+250);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput4() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");


		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t kettle");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \t Company \tQuantity \t Price");
			System.out.println();
			System.out.println("Kettle  \t pigeon \t 1 \t 900");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+900);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Plate");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \t Type \t Quantity\t price");
			System.out.println();
			System.out.println("Plate  \t steel\t1 \t 150 ");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+150);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}

	public static void collectinput5() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");


		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Oppo mobile");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name  \t Color \t RAM \tQuantity \t Price");
			System.out.println();
			System.out.println("Oppo  \t multi colored \t 8GB \t 1\t 19,000");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+19000);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Redmi mobile");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name  \t color \t RAM \t Quantity\t price");
			System.out.println();
			System.out.println("Redmi \t blue \t 6GB \t 1 \t 17,000 ");
			System.out.println("**************************  ***********");
			System.out.println("the total amount is              "+17000);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput6() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");


		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Boat earphones");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name  \t Quantity\t  Price");
			System.out.println();
			System.out.println("Boat headset  \t 1 \t 1500");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+1500);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Realme Headset");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name  \t Quantity\t price");
			System.out.println();
			System.out.println("Realme headset \t 1\t 1900 ");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+1900);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput7() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");


		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t HP Laptop \t price");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \t \t 45,000");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name  \t Color\t Quantity\t Price");
			System.out.println();
			System.out.println("HP \t grey \t 1\t 30,000");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+45000);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Lenevo laptop");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name  \t color \tQuantity \t price");
			System.out.println();
			System.out.println("Lenevo \t white \t1 \t 25,000");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+65000);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput8() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");

		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t One Plus");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name  \t Company \t Quantity\t Price");
			System.out.println();
			System.out.println("Tab  \t One Plus \t1 \t 35,000");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+70000);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Apple ");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name  \t Company \tQuantity \t price");
			System.out.println();
			System.out.println(" Tab \t  Apple \t 1\t 50,000");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+50000);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput9() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");

		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Ring");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name  \t type \tQuantity \t Price");
			System.out.println();
			System.out.println("Rings  \t Diamond \t 1\t 1500");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+1500);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Bracelite");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name  \t color \tQuantity \t price");
			System.out.println();
			System.out.println("Bracelites \t Silver \t 1\t 25,000");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+25000);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput10() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");

		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Sleeveless Top");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name  \t Color \t type \t Quantity\t Price");
			System.out.println();
			System.out.println("Tops  \t white \t western top \t1 \t 300");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+300);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Ankle fit Black Jeans");	
				System.out.println();
				System.out.println("2.quantity\t: \t      1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name  \t color \t type\t Quantity\t price");
			System.out.println();
			System.out.println("Jeans  \tblack\t Ankle fit \t1\t 1000");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+1000);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput11() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");


		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Collar T-Shirt");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Type of shirt  \t Color \tQuantity \t Price");
			System.out.println();
			System.out.println("Collar \t grey \t 1\t 700");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+700);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Sleeveless Shirt");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Type of shirt \t color \tQuantity \t price");
			System.out.println();
			System.out.println("sleeve less  \t white \t1 \t 300");
			System.out.println("************************  *************");
			System.out.println("Total amount is:                "+300);
			System.out.println("************************  *************");
			recipt3();
		}
		}
	}
	public static void collectinput12() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");


		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Puma shoes");	
				System.out.println();
				System.out.println("2.quantity\t: \t  1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("brand  \t Color \t Quantity\t Price");
			System.out.println();
			System.out.println("puma  \t Red \t 1\t 3000");
			System.out.println("***************************  ***********");
			System.out.println("Total amount is:               "+3000);
			System.out.println("**************************  ************");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Nike,white shoes");	
				System.out.println();
				System.out.println("2.quantity\t: \t    1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Brand \t color \tQuantity \t price ");
			System.out.println();
			System.out.println("Nike  \twhite \t 1\t 2000");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+2000);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput13() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");


		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Apple fruits");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \t Quantity \tQuantity \t Price");
			System.out.println();
			System.out.println("Apple \t 1 Kg \t1 \t 150");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+150);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Oranges");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \t \t Quantity \t Quantity\t Price");
			System.out.println();
			System.out.println("Orange \t \t 2 Kg \t 1\t 120 ");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+120);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput14() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");


		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Tomatos");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \t \t Quantity \t \t Price");
			System.out.println();
			System.out.println("Tomato \t \t 1kg \t \t 60");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+60);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Brinjal");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \t \t Quantity \t \t Price");
			System.out.println();
			System.out.println("Brinjal \t \t 1/2 kg \t \t 30 ");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+30);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput15() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");

		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Mango Juice");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \t Quantity\t Price  ");
			System.out.println();
			System.out.println("Mango Juice \t 1\t 80 ");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+80);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Pine Apple Juice");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \tQuantity \t price");
			System.out.println();
			System.out.println("Pine Apple Juice \t 1\t 90 ");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+90);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput16() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");


		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Badam");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \t \t Quantity \t \t Price");
			System.out.println();
			System.out.println("Badam \t \t 1 kg \t \t 250");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+250);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Pista");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \t \t Quantity \t \t Price");
			System.out.println();
			System.out.println("Pista \t \t 500gm \t \t 300 ");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+300);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput17() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");


		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Cricket Bat");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name  \t Quantity\t Price");
			System.out.println();
			System.out.println("Bat \t 1\t 1000 ");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+1000);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Cricket ball");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \t Quantity\t Price");
			System.out.println();
			System.out.println("Ball \t 1\t 200 ");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+200);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput18() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");

		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Carrom board");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \tQuantity \t Price");
			System.out.println();
			System.out.println("Carrom Board \t 1\t 700");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+700);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Carrom coins");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \tQuantity \t Price");
			System.out.println();
			System.out.println("Coins \t 1\t 300 ");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+300);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput19() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");


		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Chess board");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \t Quantity\t  Price");
			System.out.println();
			System.out.println("Chess Board \t 1\t 250");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+250);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Chess pieces");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \tQuantity \t  Price");
			System.out.println();
			System.out.println("Chess Pieces \t 1 \t 100 ");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+100);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void collectinput20() {
		Scanner sc=new Scanner (System.in);
		int choice=sc.nextInt();
		System.out.println("Do you want to purchase this Product.... ");
		String key5=sc.next();
		System.out.println("do you want to see the specifications for this product \n");

		switch(choice) {
		case 1:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Foot ball");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \t Quantity\t Price");
			System.out.println();
			System.out.println("Foot Ball \t 1\t  750");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+750);
			System.out.println("**************************  ***********");
			recipt3();
		}
		case 2:{
			String key3=sc.next();
			if(key3.equalsIgnoreCase("yes")) { 
				System.out.println("1. Name \t :\t Net");	
				System.out.println();
				System.out.println("2.quantity\t: \t1 \n \n");
				System.out.println("Do you require changes in the requirements...");
				changes();
			}
			System.out.println("Name \tQuantity \t  Price");
			System.out.println();
			System.out.println("Net \t 1\t 600 ");
			System.out.println("**************************  ***********");
			System.out.println("Total amount is:                "+600);
			System.out.println("**************************  ***********");
			recipt3();
		}
		}
	}
	public static void CollectInput1() {
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) 
		{
		case 1:{
			System.out.println("\t \t \t!...Welcome to furniture Section.....!\n \n !..Please select what you want...!\n \n"
					+ "1.Sofas \n"
					+"2.Chairs \n");
			collectinput1();
		}
		case 2:{
			System.out.println("\t \t \t...Welcome to blanket Section.....\n \n ..Please select what you want....\n \n"
					+ "1.Comforter \n"
					+"2.Duvet \n");
			collectinput2();
		}
		case 3:{
			System.out.println("\t \t \t...Welcome to Carpet Section.....\n \n ..Please select what you want....\n \n"
					+ "1.Nylon \n" 
					+"2.Plush \n");
			collectinput3();
		}
		case 4:{
			System.out.println("\t \t \t...Welcome to Kitchen decors Section.....\n \n ..Please select what you want....\n \n"
					+ "1.kettle \n"
					+"2.Plate \n");
			collectinput4();	
		}
		}
	}
	public static void CollectInput2() {
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("\t \t \t...Welcome to Mobiles Section.....\n \n ..Please select what you want....\n \n"
					+"1.Oppo \n"
					+"2.Redmi \n");
			collectinput5();
		}
		case 2:{
			System.out.println("\t \t \t...Welcome to Headphones Section.....\n \n ..Please select what you want....\n \n"
					+ "1.boat \n"
					+"2.Realme \n");
			collectinput6();
		}
		case 3:{
			System.out.println("\t \t \t...Welcome to Laptops Section.....\n \n ..Please select what you want....\n \n"
					+ "1.HP \n"
					+"2.Lenevo");
			collectinput7();

		}
		case 4:{
			System.out.println("\t \t \t...Welcome to Tabs Section.....\n \n ..Please select what you want....\n \n"
					+ "1.One Plus \n"
					+"2.Apple \n");
			collectinput8();
		}
		}
	}
	public static void CollectInput3() {
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("\t \t \t...Welcome to Accessiories Section.....\n \n ..Please select what you want....\n \n"
					+ "1.rings \n"
					+"2.bracelite \n");
			collectinput9();
			System.exit(choice);

		}
		case 2:{
			System.out.println("\t \t \t...Welcome to Weastern Wear Section.....\n \n \n ...Please select what you want....\n \n"
					+ "1.Jeans \n"
					+"2.Tops \n");
			collectinput10();
		}
		case 3:{
			System.out.println("\t \t \t...Welcome to Shirts Section.....\n \n ...Please select what you want....\n \n"
					+ "1.Collar \n"
					+"2. Sleeveless shirts\n");
			collectinput11();

		}
		case 4:{
			System.out.println("\t \t \t...Welcome to Shoes.....\n \n ...Please select what you want....\n \n"
					+ "1.Puma \n"
					+"2.Nike \n");
			collectinput12();
		}
		}
	}
	public static void CollectInput4() {
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("\t \t \t...Welcome to Fruits Section.....\n \n ...Please select what you want....\n \n"
					+ "1.Apple \n"
					+"2.Orange \n");
			collectinput13();
		}
		case 2:{
			System.out.println("\t \t \t...Welcome to Vegetables Section.....\n \n ...Please select what you want....\n \n"
					+ "1.Tomato \n"
					+"2. Brinjal\n");
			collectinput14();
		}
		case 3:{
			System.out.println("\t \t \t...Welcome to Juices Section.....\n \n ...Please select what you want...\n \n."
					+ "1.Mango juice\n"
					+"2.Pine apple juice \n");
			collectinput15();
		}
		case 4:{
			System.out.println("\t \t \t...Welcome to Nuts Section.....\n \n ...Please select what you want....\n \n"
					+ "1.Badam \n"
					+"2.Pista \n");
			collectinput16();
		}

		}
	}
	public static void CollectInput5() {
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("\t \t \t...Welcome to cricket Game Section.....\n \n ...Please select what you want....\n \n"
					+ "1.Bat \n"
					+"2.Ball \n");
			collectinput17();
		}
		case 2:{
			System.out.println("\t \t \t...Welcome to carroms Game Section.....\n \n ...Please select what you want....\n \n"
					+ "1.Carrom Board \n"
					+"2.Coins \n");
			collectinput18();
		}
		case 3:{
			System.out.println("\t \t \t...Welcome to chess Game Section.....\n \n ...Please select what you want....\n \n"
					+ "1.Chess board \n"
					+"2.Chess Pieces \n");
			collectinput19();	
		}
		case 4:{
			System.out.println("\t \t \t...Welcome to football Game Section.....\n \n ...Please select what you want....\n \n"
					+ "1.Foot Ball \n"
					+"2.Net \n");
			collectinput20();
		}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("\t \t....Welcome to the Shopping Application......");
		System.out.println();
		System.out.println("Please select what you want \n"
				+"1.Home Decors \n"
				+"2.Electronics \n"
				+"3.Fashion \n"
				+"4.Instamart \n"
				+"5.Sports \n");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("\t \t \t...welcome to home decors....!\n \n \t \t .....please select what you want...\n \n"
					+"1.Furniture \n"
					+"2.Blanket \n"
					+"3.Carpet \n"
					+"4.Kitchen Decors \n");
			CollectInput1();
		}
		case 2:{
			System.out.println("\t \t \t...welcome to Electronics....\n \n ....please select what you want...\n"
					+"1.Mobile\n"
					+"2.Headphones \n"
					+"3.Laptops \n"
					+"4.Tabs \n");
			CollectInput2();
		}
		case 3:{
			System.out.println("\t \t \t...welcome to Fashion....\n \n  \t ... Pease select what you want...\n"
					+"1.Accessiories \n"
					+"2.Weastern Wear \n"
					+"3.Shirts\n"
					+"4.Shoes\n");
			CollectInput3();
		}
		case 4:{
			System.out.println("\t \t \t...welcome to Instamart ....\n \n ....\t ....Please select what you want...\n"
					+"1.Fruits \n"
					+"2.Vegetables \n"
					+"3.Juices \n"
					+"4.Nuts \n");
			CollectInput4();
		}
		case 5:{
			System.out.println("\t \t \t...welcome to Sports Section....\n \n...please select which sport item do you want...\n \n "
					+"1.Cricket \n"
					+"2.Chess \n"
					+"3.Carroms \n"
					+"4.Football \n");
			CollectInput5();
		}
		}
	}
}
