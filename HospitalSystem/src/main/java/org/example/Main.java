package org.example;

import models.Hospital;
import models.HospitalBedInfo;
import models.Patient;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.plaf.nimbus.State;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/assignmentdb";
        String name = "root";
        String password = "$$SSlove2016";

        Connection connection = null;
        Statement stmt = null;
        ResultSet resultSet1 = null;
        ResultSet resultSet2 = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, name, password);
            System.out.println("connection established....");
            stmt = connection.createStatement();


//            //creating hospital_bed_information table inside assignmentdb database
//            String createHospitalBedInfoTableQuery = "create table hospitalBedInfo (bed_id int primary key, bed_type varchar(30) not null, bed_charge_rate int not null)";
//            stmt.execute(createHospitalBedInfoTableQuery);
//            System.out.println("hospital bed info table created...");


//            //creating patient table
//            String createPatientTableQuery= "create table patient( patient_id int not null, patient_name varchar(30) not null,patient_type varchar(10),number_of_days_in_hospital int not null)";
//            stmt.execute(createPatientTableQuery);
//            System.out.println("patient table created...");


//            //creating hospital table
//            String createHospitalTableQuery= "create table hospital(hospital_id int not null, hospital_name varchar(20))";
//            stmt.execute(createHospitalTableQuery);
//            System.out.println("hospital table created...");


//            //make primary key for hospital_id in hospital table and patient_id in patient table
//            String makeHospitalIDPKQuery = "alter table hospital add primary key(hospital_id)";
//          PreparedStatement pstmt3= connection.prepareStatement(makeHospitalIDPKQuery);
//           pstmt3.execute();
//            System.out.println("hospital id is now a primary key...");
//            String makePatiendIDPKQuery = "alter table patient add primary key(patient_id)";
//
//           PreparedStatement pstmt4 = connection.prepareStatement(makePatiendIDPKQuery);
//           pstmt4.execute();
//        System.out.println("patient id is now a primary key...");
//

            // // make foreign key hospitalid in hospitalbedinfotable and patient_id in hospital table
//            String addPatientidOnHospitalTableQuery="alter table hospital add column patient_id int";
//
//            String addhospitalidOnHospitalBedInfoTableQuery= "alter table hospitalBedInfo add column hospital_id int";
//            stmt.execute(addhospitalidOnHospitalBedInfoTableQuery);
//            stmt.execute(addPatientidOnHospitalTableQuery);
//            String patient_idFKOnHospitalTableQuery = "alter table hospital add foreign key(patient_id) references patient(patient_id)";
//           PreparedStatement pstmt5= connection.prepareStatement(patient_idFKOnHospitalTableQuery);
//           pstmt5.execute();

            //  //samething using statement
//            stmt.execute(patient_idFKOnHospitalTableQuery);
//            System.out.println("patientid is now foreign key on hospital table");
//
//            String hospitalidForeignkeyOnHospitalBedTableQuery = "alter table hospitalBedInfo add foreign key(hospital_id) references hospital(hospital_id)";
//            PreparedStatement pstmt6 = connection.prepareStatement(hospitalidForeignkeyOnHospitalBedTableQuery);
//            pstmt6.execute();

////same thing using statement
//            stmt.execute(hospitalidForeignkeyOnHospitalBedTableQuery);
//            System.out.println("hospitalid is is now foreign key on hospitalbedinfo table");


            //create hospital, hospital bed info and patiend using factory class
            //  Factory factoryObj = new Factory();


//            //insert into patient table using preparedstatement
            //     String insertToPatientQuery= "insert into patient (patient_id,patient_name,patient_type,number_of_days_in_hospital) values(?,?,?,?)";
//            PreparedStatement pstmt = connection.prepareStatement(insertToPatientQuery);
//            Patient patient = factoryObj.createPatient();


//            pstmt.setInt(1,patient.getPatientId());
//            pstmt.setString(2,patient.getPatientName());
//            pstmt.setString(3,patient.getPatientType());
//            pstmt.setInt(4,patient.getNumberOfDaysInHospital());
//            pstmt.execute();
//            System.out.println("patient data inserted to patient table using PreparedStatement");

            //insert into patient table using Statement

//
//            int totalStaysDays=12;
//            int ratePerDay=30;
//            float totalBedCharge= getTotalBedCharge(totalStaysDays,ratePerDay);
            // Patient patient = factoryObj.createPatient(totalBedCharge);
//            String insertToPatientQuery= "insert into patient (patient_id,patient_name,patient_type,number_of_days_in_hospital, total_bed_charge) values("+patient.getPatientId()+",'"+patient.getPatientName()+"','"+patient.getPatientType()+"',"+patient.getNumberOfDaysInHospital()+","+patient.getTotalBedCharge()+")";
//            stmt.execute(insertToPatientQuery);
//            System.out.println("patient data inserted to patient table using Statement");
//

//            // insert into hospital table using statement
//            Hospital hospital =factoryObj.createHospital();
//            String insertToHospitalQuery= "insert into hospital(hospital_id,hospital_name,patient_id) values("+hospital.getHospitalId()+","+"'"+hospital.getHospitalName()+"'," +hospital.getPatientId()+")";
//            stmt.execute(insertToHospitalQuery);
//            System.out.println("data inserted to hospital table....");
//


            //taking input and create hospitalbedinfo object
            ////  HospitalBedInfo bedinfo = factoryObj.createHospitalBedInfo();

//            //insert into hospitalbedinfo using preparedStatement
            //  String insertHospitalBedInfoQuery = "insert into hospitalBedInfo values(?,?,?,?)";
            //  PreparedStatement pstmt = connection.prepareStatement(insertHospitalBedInfoQuery);
//            pstmt.setInt(1, bedinfo.getBedId());
//            pstmt.setString(2, bedinfo.getBedType());
//            pstmt.setInt(3, bedinfo.getBedChargeRate());
            //  pstmt.setInt(4,bedinfo.getHospitalId());
//            pstmt.execute();
//
            //  insert into hospitalbedinfo using Statement
//            String insertHospitalBedQuery =  "INSERT INTO hospitalBedInfo (bed_id, bed_type, bed_charge_rate,hospital_id) VALUES ("+bedinfo.getBedId() + "," +"'"+ bedinfo.getBedType() + "'," + bedinfo.getBedChargeRate()+","+bedinfo.getHospitalId()+")";
//            stmt.execute(insertHospitalBedQuery);
//            System.out.println("hospital bed info data inserted...");


//            //adding total bed charge column on patient table
//            String addTotalBedChargeColumnOnPatientTableQuery= "alter table patient add column total_bed_charge int";
//            stmt.execute(addTotalBedChargeColumnOnPatientTableQuery);
//            System.out.println("total bed charge column added");


            //calculating total bed charge rate
            // and inserting that result to total_bed_charge on patient table

            //step 1: get the patient_id and patient_type and numberofDays in hospital from patient table
            //and get the bed_type from hospital bed info table;
//            String query1 = "select p.patient_id, p.patient_type,p.number_of_days_in_hospital,h.hospital_id from patient p join hospital h on p.patient_id=h.patient_id";
//            resultSet1 = stmt.executeQuery(query1);
//            while (resultSet1.next()) {
//                int patientId = resultSet1.getInt("patient_id");
//                String patientType = resultSet1.getString("patient_type");
//                int noOfDaysInHospital = resultSet1.getInt("number_of_days_in_hospital");
//                int hospitalId = resultSet1.getInt("hospital_id");
//                //step 1.2 get the bed_type from hospitalBedInfo table
//                String query2 = "select bed_type from hospitalBedInfo where hospital_id=" + hospitalId;
//                resultSet2 = stmt.executeQuery(query2);
//                if (resultSet2.next()) {
//                    String bedType = resultSet2.getString("bed_type");
//                    //calculate total bed charge based on bed_type
//                    int ratePerDay = "normal".equalsIgnoreCase(bedType) ? 30 : 50;
//                    int totalBedCharge = calculateTotalBedCharge(noOfDaysInHospital, ratePerDay);
//                    //update total_bed_charge in patient table
//                    String query3 = "update patient set total_bed_charge=" + totalBedCharge + " where patient_id=" + patientId;
//                    int executecount = stmt.executeUpdate(query3);
//                    System.out.println("rows affected" + executecount);
//                }
//            }

//
////Read data from database tables
//            String getSelectedDataFromDatabaseQuery = "select hospital_name,patient_name,patient_type,bed_type,number_of_days_in_hospital,total_bed_charge from\n" +
//                    "  patient join hospital on patient.patient_id=hospital.patient_id  join hospitalBedInfo on hospital.hospital_id=hospitalBedInfo.hospital_id;\n";
//            ResultSet resultSet3 = stmt.executeQuery(getSelectedDataFromDatabaseQuery);
//
//
//            //  //write all data to excel file
//            //header row
//            String filepath = "/home/som/Desktop/java training/sql/assignments/assignment4/HospitalSystem/src/main/resources/hospitalPatientBed.xlsx";
//            FileInputStream fis = new FileInputStream(filepath);
//            XSSFWorkbook workbook = new XSSFWorkbook();
//
//            Sheet sheet = workbook.getSheetAt(0);
//            Row headerRow = sheet.createRow(0);
//            int columnCount = resultSet3.getMetaData().getColumnCount();
//            for (int i = 1; i <= columnCount; i++) {
//                Cell cell = headerRow.createCell(i - 1);
//                cell.setCellValue(resultSet3.getMetaData().getColumnName(i));
//            }
//            while (resultSet3.next()) {
//                String hospitalName = resultSet3.getString("hospital_name");
//                String PatientName = resultSet3.getString("patient_name");
//                String patientType = resultSet3.getString("patient_type");
//                String bedType = resultSet3.getString("bed_type");
//                int noOfDaysInHospital = resultSet3.getInt("number_of_days_in_hospital");
//                int totalBedCharge = resultSet3.getInt("total_bed_charge");
//
//               //create data row
//                int rowNum = 1;
//                while (resultSet3.next()) {
//                    Row row = sheet.createRow(rowNum++);
//                    for (int i = 1; i <= columnCount; i++) {
//                        Cell cell = row.createCell(i - 1);
//                        cell.setCellValue(resultSet3.getString(i));
//                    }
//                }
//            }
//           workbook.write(fis);

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (resultSet2 != null) {
                    resultSet2.close();
                }
                if (resultSet1 != null) {
                    resultSet1.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static int calculateTotalBedCharge(int numberOfDaysInHospital, int ratePerDay) {
        int totalBedCharge = numberOfDaysInHospital * ratePerDay;
        return totalBedCharge;
    }
}

