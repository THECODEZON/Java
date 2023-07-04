public class OOPS {
    public static void main(String args[]){
      Pen p1 = new Pen();
      p1.setColor("Blue");
      p1.setTip(1);
      p1.color = "yellow";
      System.out.println(p1.color);  
      System.out.println(p1.tip);  
      BankAccount myAccount = new BankAccount();
      myAccount.username = "deepadas";
      myAccount.setPassword("DHBJBJDHBCHBDJB");
      System.out.println(myAccount.username);
      

    }

}
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class BankAccount{
     private String Password;
     public String username; 

      void setPassword(String newPassword) {
         Password = newPassword;
     }
     
}