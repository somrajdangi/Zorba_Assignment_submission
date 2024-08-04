package org.example;

import models.*;

import java.util.Scanner;

public class Factory {
    Scanner scanner = new Scanner(System.in);

    public  Hospital createHospital() {
        System.out.println("pleas enter hospital id");
        int hospitalId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("please enter hospital name");
        String hospitalName = scanner.nextLine();
        System.out.println("please enter patient id");
        int patientId= scanner.nextInt();
        scanner.nextLine();
        return new Hospital(hospitalName, hospitalId,patientId);
    }

    public HospitalBedInfo createHospitalBedInfo() {
        System.out.println("please enter bedId");
        int bedId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("please enter bed type");
        String bedType = scanner.nextLine();
        System.out.println("please enter bed Charge Rate");
        int bedChargeRate = scanner.nextInt();
        System.out.println("please enter hospital id");
        int hospitalId= scanner.nextInt();
        scanner.nextLine();
        return new HospitalBedInfo(bedId, bedType, bedChargeRate,hospitalId);
    }

    public Patient createPatient(float totalBedCharge) {
        System.out.println("please enter patient id");
        int patientId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("please enter patient name");
        String patientName = scanner.nextLine();
        System.out.println("please enter patient type: critical or normal?");
        String patientType = scanner.nextLine();
        System.out.println("please enter number of days in hospital");
        int numberOfDaysInHospital = scanner.nextInt();
        scanner.nextLine();

        return new Patient(patientName,patientType,patientId,numberOfDaysInHospital,totalBedCharge);
    }
}
