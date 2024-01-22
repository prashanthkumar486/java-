class Gps 
{
    double latitude;
    double longitude;
    void display()
    {
        System.out.println("the cordinates that as been searching for in GPS("+latitude+","+longitude+") ");
    }
    void updateCordinates(double lat,double lng)
    {
        latitude =lat;
        longitude = lng;
        if (lat >=1 && lng>=2)
        {
            System.out.println("this location is banglore");
            if(lat==1.937373 && lng ==2.90900909)
            {
                System.out.println("the location is basvanagudi Jspiders Newbulding");
            }
            else{
                System.out.println("this location is basvanagudi j Spider old Bulding");
            }
        }
        else{
            System.out.println("location not determind");
        }
    }
}
class MainClass33
{
    public static void main(String[] args) 
    {
    Gps g1 = new Gps();
    g1.latitude =1.56789879;
    g1.longitude=2.9868557675;
    g1.display();
    Gps g2 = new Gps();
    g2.latitude =1.987987696;
    g2.longitude=-1.09808723;
    g2.updateCordinates(1.937333,2.90900901); 
    System.out.println("updated coridinates");
    g2.display();     
    }
}
