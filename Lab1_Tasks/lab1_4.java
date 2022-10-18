//Create a program in which user is asked for marks in a respected way  (Matriculation , Intermediate and Test Result ) Where Output would be the CPN.

import java.util.Scanner;

class lab1_4{
    public static void main(String[] args) {
        // float intermediatePercentage, metriculationPercentage, testResult;

        Scanner marks1 = new Scanner(System.in);

        System.out.print("Enter Metriculation Percentage Accurate = ");
        float metriculationPercentage = marks1.nextFloat();

        System.out.print("Enter Intermediate Percentage Accurate = ");
        float intermediatePercentage = marks1.nextFloat();

        System.out.print("Enter Test Score = ");
        int testResult = marks1.nextInt();

        double CPN = metriculationPercentage * 0.1 + intermediatePercentage * 0.3 + testResult * 0.6;

        System.out.println("Your CPN would be = " + CPN);
    }
}