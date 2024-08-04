package models;

public class HospitalBedInfo{
    private int bedId;
   private String bedType;
   private int bedChargeRate;
   int hospitalId;

  public HospitalBedInfo(int bedId,String bedType,int bedChargeRate,int hospitalId){
       this.bedId=bedId;
       this.bedType=bedType;
       this.bedChargeRate=bedChargeRate;
       this.hospitalId=hospitalId;

   }
   public int getBedId(){
       return bedId;
    }
    public  String getBedType(){
       return bedType;
    }
    public int getBedChargeRate(){
       return bedChargeRate;
    }
    public int getHospitalId(){
      return hospitalId;
    }

    public String toString(){
       return bedId+" "+bedType+" "+bedChargeRate;
    }
}
