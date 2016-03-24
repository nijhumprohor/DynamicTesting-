/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruhul...GitHub Testin
 */
public class DynamicTest {
   double income;
   int dependent;
   boolean maritalStatus;

    public DynamicTest() {
       
    }
    
public double Tax(double income, int dependent, boolean maritalStatus){
     
        double result = 0;
  if (maritalStatus == false) {
            switch (dependent) {
                case 1:
                    if (income <= 20) {
                        result = 0.08 * income;
                    } else if (20 < income && income <= 60) {
                        result = 1.6 + 0.10 * (income - 20);
                    } else if (60 < income && income <= 150) {
                        result = 5.6 + 0.15 * (income - 60);
                    } else if (150 < income && income <= 250) {
                        result = 19.1 + 0.20 * (income - 150);
                    } else if (250 < income) {
                        result = 39.1 + 0.25 * (income - 25);
                    }
                    break;
                case 2:
                    if (income <= 20) {
                        result = 0.07 * income;
                    } else if (20 < income && income <= 60) {
                        result = 1.4 + 0.09 * (income - 20);
                    } else if (60 < income && income <= 150) {
                        result = 5.0 + 0.14 * (income - 60);
                    } else if (150 < income && income <= 250) {
                        result = 17.6 + 0.19 * (income - 150);
                    } else if (250 < income) {
                        result = 36.6 + 0.24 * (income - 25);
                    }
                    break;
                default:
                    if (income <= 20) {
                        result = 0.06 * income;
                    } else if (20 < income && income <= 60) {
                        result = 1.2 + 0.08 * (income - 20);
                    } else if (60 < income && income <= 150) {
                        result = 4.4 + 0.13 * (income - 60);
                    } else if (150 < income && income <= 250) {
                        result = 16.1 + 0.18 * (income - 150);
                    } else if (250 < income) {
                        result = 34.1 + 0.23 * (income - 25);
                    }
                    break;
            }
        } else if (maritalStatus == true) {
            switch (dependent) {
                case 1:
                    if (income <= 20) {
                        result = 0.07 * income;
                    } else if (20 < income && income <= 60) {
                        result = 1.4 + 0.09 * (income - 20);
                    } else if (60 < income && income <= 150) {
                        result = 5.0 + 0.14 * (income - 60);
                    } else if (150 < income && income <= 250) {
                        result = 17.6 + 0.19 * (income - 150);
                    } else if (250 < income) {
                        result = 36.6 + 0.24 * (income - 250);
                    }
                    break;
                case 2:
                    if (income <= 20) {
                        result = 0.06 * income;
                    } else if (20 < income && income <= 60) {
                        result = 1.2 + 0.08 * (income - 20);
                    } else if (60 < income && income <= 150) {
                        result = 4.4 + 0.13 * (income - 60);
                    } else if (150 < income && income <= 250) {
                        result = 16.1 + 0.18 * (income - 150);
                    } else if (250 < income) {
                        result = 34.1 + 0.23 * (income - 250);
                    }
                    break;
                case 3:
                    if (income <= 20) {
                        result = 0.05 * income;
                    } else if (20 < income && income <= 60) {
                        result = 1.0 + 0.07 * (income - 20);
                    } else if (60 < income && income <= 150) {
                        result = 3.8 + 0.12 * (income - 60);
                    } else if (150 < income && income <= 250) {
                        result = 14.6 + 0.17 * (income - 150);
                    } else if (250 < income) {
                        result = 31.6 + 0.22 * (income - 250);
                    }
                    break;
                default:
                    if (income <= 20) {
                        result = 0.04 * income;
                    } else if (20 < income && income <= 60) {
                        result = 0.8 + 0.06 * (income - 20);
                    } else if (60 < income && income <= 150) {
                        result = 3.2 + 0.11 * (income - 60);
                    } else if (150 < income && income <= 250) {
                        result = 13.1 + 0.16 * (income - 150);
                    } else if (250 < income) {
                        result = 29.1 + 0.21 * (income - 250);
                    }
                    break;
            }
        }
        return result;
    }
}