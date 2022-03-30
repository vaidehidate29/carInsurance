package com.nagarro.insurancecal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CarInsurance
{

        public static void main(String[] args) throws IOException {


            Scanner obj = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            char yesOrNo;
            float tax = 0;
            int count = 1;
            int[]  listquantity = new int[500];
            String[] listname = new String[500];
            float[] listprice = new float[500];
            int quantity = 0;
            String name = null;

            float price = 0.0f;
            System.out.print("Enter details of item (Name, Price, Quantity, Type):   ");
            try {
                System.out.print("-name  ");
                name = br.readLine();
            } catch (Exception myException) {
                System.out.println("pls enter valid string");
            }

            try {
                System.out.print("-price  ");
                price = obj.nextFloat();
            } catch (Exception myException) {
                System.out.println("Enter valid float value");
            }

            try {
                System.out.print("-quantity  ");
                quantity = obj.nextInt();

            } catch (Exception myException) {
                System.out.println("Enter valid integer value");
            }

            try {
                System.out.print("-type  ");
                String type = obj.next();
            } catch (Exception myException) {
                System.out.println("Enter valid String");
            }

            try {
                System.out.print("-sell Tax  ");
                tax = obj.nextFloat();
            } catch (Exception myException) {
                System.out.println("pls enter valid float value");
            }

            listname[--count] = name;
            listquantity[count]= quantity;
            listprice[count] = price;

            System.out.print("Do you want to enter details of any other items (y/n) ");
            yesOrNo = obj.next().trim().charAt(0);

            if (yesOrNo == 'y') {
                repeat( yesOrNo, count,name, price,quantity,listname,listquantity, listprice, tax);
            } else {
                printTheReuslt(count, listname, listquantity, listprice, tax);
            }

        }

        static void repeat(char yesOrNo, int count, String name, float price, int quantity, String[] listname, int[] listquantity, float[] listprice , float tax) {

            Scanner obj = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try {
                System.out.print("-name  ");
                name = br.readLine();
            } catch (Exception myException) {
                System.out.println("pls enter valid string");
            }

            try {
                System.out.print("-price  ");
                price = obj.nextFloat();
            } catch (Exception myException) {
                System.out.println("Enter valid float value");
            }

            try {
                System.out.print("-quantity  ");
                quantity = obj.nextInt();

            } catch (Exception myException) {
                System.out.println("Enter valid integer value");
            }

            try {
                System.out.print("-type  ");
                String type = obj.next();
            } catch (Exception myException) {
                System.out.println("Enter valid String");
            }
            ++count;
            listname[count] = name;
            listquantity[count]= quantity;
            listprice[count] = price;
            System.out.print("Do you want to enter details of any other items (y/n) ");
            yesOrNo = obj.next().trim().charAt(0);
            if (yesOrNo == 'y') {
                reRepeat(yesOrNo, count, name, price, quantity, listname, listquantity, listprice , tax);
            } else {
                printTheReuslt(count, listname, listquantity, listprice, tax);
            }
        }

        private static void reRepeat(char yesOrNo, int count, String name, float price, int quantity, String[] listname, int[] listquantity, float[] listprice, float tax) {
            Scanner obj = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.print("-name  ");
                name = br.readLine();
            } catch (Exception myException) {
                System.out.println("pls enter valid string");
            }

            try {
                System.out.print("-price  ");
                price = obj.nextFloat();
            } catch (Exception myException) {
                System.out.println("Enter valid float value");
            }


            try {
                System.out.print("-quantity  ");
                quantity = obj.nextInt();

            } catch (Exception myException) {
                System.out.println("Enter valid integer value");
            }


            try {
                System.out.print("-type  ");
                String type = obj.next();
            } catch (Exception myException) {
                System.out.println("Enter valid String");
            }

            ++count;
            listname[count] = name;
            listquantity[count]= quantity;
            listprice[count] = price;


            System.out.print("Do you want to enter details of any other items (y/n) ");
            yesOrNo = obj.next().trim().charAt(0);
            check(yesOrNo, count, name, price, quantity, listname, listquantity, listprice, tax);
        }

        private static void check(char yesOrNo, int count, String name, float price, int quantity, String[] listname, int[] listquantity, float[] listprice, float tax) {
            if (yesOrNo == 'y'){
                repeat(yesOrNo,count, name, price, quantity, listname, listquantity, listprice, tax);
            }else {
                printTheReuslt(count, listname, listquantity, listprice, tax);
            }
        }


        static void printTheReuslt(int count,  String[] listname, int[] listquantity, float[] listprice, float tax) {
            printCarInfo();
            float Price;
            //float secondCalTax;
            float Premium;
            float ActualPremium;
                for (int i = 0; i <= count; i++) {
                    Price = ((listprice[i])  * tax) / 100;
                    //secondCalTax = ((firstCalTax)  * tax) / 100;
                   Premium =  Price; 
                   ActualPremium = Premium + (Premium*20)/100;
                    //+ secondCalTax;
                    System.out.println("." + listname[i] + "        |" + listprice[i] + "       |" + listquantity[i] + "           |" +tax+"                    |" +Premium+  "               |"+ActualPremium+  "                 |" +(int)ActualPremium+"                .");
                    
                    System.out.println(".-----------------------------------------------------------------------------------------------------------------------.");
                    //}
                }

            //   System.out.println(".---------------------------------------------------------------------------------------------.");
            }

        public static void printCarInfo () {
            //horizental
            for (int i = 0; i < 120; i++) {
                System.out.print(".");
            }
            System.out.println();

            //vertical dot
            for (int i = 0; i < 1; i++) {
                System.out.print(".");
                for (int j = 0; j < 109; j++) {

                    if (j == 51){
                        System.out.print("Item List");
                    }
System.out.print(" ");
                    if (j == 108) {
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
//horizetal line of item
            for (int i = 0; i < 120; i++) {
                System.out.print(".");
            }
            System.out.println();
            carSpecification();
        }

        public static void carSpecification() {
            System.out.print(".");
            System.out.print("Names    ");
            System.out.print("   |Price    ");
            System.out.print(" |Quantity    ");
            System.out.print("  |Sell tax per item");
            System.out.print("      |Premium    ");
            System.out.print("       |ActualPremium    ");
            System.out.print("       |Round-off Premium");

            for (int i = 0; i < 37; i++) {
                System.out.print(" ");
                if (i == 35){
                    System.out.print(".");
                }
            }System.out.println();

            //Below horizental line of name row
            for (int i = 0; i < 120; i++) {

                if (i == 0 || i == 119) {
                    System.out.print(".");
                }
                if (i > 0 && i < 119) {
                    System.out.print("-");
                }
            }System.out.println();
        }

    }