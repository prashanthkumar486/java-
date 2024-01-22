class Ticket_counter
{
    int no_of_tickets;

    void ViewAvailableTickets()
    {
        System.out.println("number of available tickets :  "+no_of_tickets);

    }
    void BuyTickets(int n)
    {
        System.out.println("Buying : " +n+ "  tickets");
        if(n<no_of_tickets){
            no_of_tickets=no_of_tickets-n;
            System.out.println("buying sucessfull");
        }
        else{
            System.out.println("failed: due to insufficient available tickets");
        }
    }
    void CancelTickets(int n){
        System.out.println("cancelling : "+n+"  tickets");
        no_of_tickets=no_of_tickets+n;

    
    }
}
 
class MainClass32
{
    public static void main(String[] args) {
        
        System.out.println("main method started");
        Ticket_counter tc1=new Ticket_counter();
        tc1.no_of_tickets=100;
        tc1.ViewAvailableTickets();
        tc1.BuyTickets(20);
        tc1.ViewAvailableTickets();
        tc1.CancelTickets(10);
        tc1.ViewAvailableTickets();
        System.out.println("main method ended");
    }
}
