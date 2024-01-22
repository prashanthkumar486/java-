class Hosp
{
    long Patient_id;
    String name;
    long patient_phone;
    String  patient_adress;
    String  consulting_doctor;
    String desease;
}

class MainClass16
{
    public static void main(String[] args)
    {
        System.out.println("main method started");

        System.out.println("-----------------------------");

        Hosp d1 = new Hosp();
        d1.Patient_id=123;
        d1.name="Raju";
        d1.patient_phone=9341985926l;
        d1.patient_adress="shimoga";
        d1.consulting_doctor="Dr.Ramesh";
        d1.desease="corona";

        System.out.println("patient id is: "+d1.Patient_id);
        System.out.println("patient  name is: "+d1.name);
        System.out.println("patient phone is: "+d1.patient_phone);
        System.out.println("patient adress is: "+d1.patient_adress);
        System.out.println("consulting doctor is: "+d1.consulting_doctor);
        System.out.println("patient desease is: "+d1.desease);
        System.out.println("main method ended");
    }
}
