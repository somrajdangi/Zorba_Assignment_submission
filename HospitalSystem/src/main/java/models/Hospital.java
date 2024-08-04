package models;

public class Hospital {
    int hospitalId;
    String hospitalName;
    int patientId;
   public Hospital(String hospitalName,int hospitalId,int patientId){
        this.hospitalName=hospitalName;
        this.hospitalId=hospitalId;
        this.patientId=patientId;
    }
    public int getHospitalId(){
        return  hospitalId;
    }
    public String getHospitalName(){
        return hospitalName;
    }
    public  int getPatientId(){return patientId;}
    public String toString(){
        return hospitalId+" "+hospitalName;
    }

}
