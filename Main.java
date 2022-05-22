
class bank{
  int acnum;
  String name;
  double amt;
  int years;
  String date;
  double intr;
  double rate;

  bank(int acnum,String name,double amt,int years,String date,double rate){
    this.acnum=acnum;
    this.name=name;
    this.amt=amt;
    this.years=years;
    this.date=date;
    this.rate=rate;
  }
  void intrest(){
   this.intr=amt*years*rate/100; 
  }
  void display(){
    System.out.println("Account number: "+acnum);
    System.out.println("Account holder name: "+name);
    System.out.println("Account balance: "+amt);
    System.out.println("Amount intrest: "+intr);
    System.out.println("Amount period: "+years);
    System.out.println("Intrest rate: "+rate);
    System.out.println("Activated day: "+date);
    
    
  }
}
class Main{
  public static void main(String[] args){
   // Scanner in =new Scanner(System.in);
    bank b1= new bank(4302,"jk",5000,8,"dec2018",8.5);
    b1.intrest();
    b1.display();
    
  }
}