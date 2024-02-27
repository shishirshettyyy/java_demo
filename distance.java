class distance
{
   int meters;
   int cms;
   public void setdata(int m,int cm)
   {
     meters=m;
     cms=cm;
}
  public void display()
   {
    System.out.println("meters="+meters);
    System.out.println("centimeters="+cms);
   }
}
  class program distance
  {
    public static void main(String args[])
     {
       distance d1=new distance();
       d1.setdata(10,90);
       d1.display();
  }
}