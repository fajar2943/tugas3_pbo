public class Ac implements AcInterface{

    public void acSwitch(boolean status){
        if(status){
            System.out.println("AC Hidup");
        }else{
            System.out.println("AC Mati");
        }
    }
}