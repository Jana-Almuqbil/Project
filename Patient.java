
package pkg251_project;

public class Patient {
   String First_Name;
   String Last_Name;
   int ID;
   int birthYear;
   int Age;
   String Skin_Typ;
   boolean food_Allergy;
   boolean Appointment;
   int Patinet_Number;
           

    public Patient(String First_Name, String Last_Name, int ID, int birthYear, String Skin_Typ, boolean food_Allergy, boolean Appointment) {
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.ID = ID;
        this.birthYear =birthYear;
        this.Skin_Typ = Skin_Typ;
        this.food_Allergy = food_Allergy;
        this.Appointment = Appointment;
        Patinet_Number++;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getSkin_Typ() {
        return Skin_Typ;
    }

    public void setSkin_Typ(String Skin_Typ) {
        this.Skin_Typ = Skin_Typ;
    }

    public boolean isFood_Allergy() {
        return food_Allergy;
    }

    public void setFood_Allergy(boolean food_Allergy) {
        this.food_Allergy = food_Allergy;
    }

    public boolean isAppointment() {
        return Appointment;
    }

    public void setAppointment(boolean Appointment) {
        this.Appointment = Appointment;
    }

    public int getPatinet_Number() {
        return Patinet_Number;
    }

@Override
    public String toString() {
        return "------------------------------------------------\n"
                +"Patient profile number "+Patinet_Number
                +"\n Name: " + First_Name +" "+ Last_Name 
                +"\n ID: " + ID 
                + "\n Age: " + calculateAge()
                + "\n Skin typ: " + Skin_Typ ;
    }
    
     public int calculateAge() {
        this.Age = 2023 - this.birthYear;
        return this.Age;
    }
}
               
  