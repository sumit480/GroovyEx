class Date2{
static void main(String[] args)
{
Date olddate=new Date("06/11/1992");
Date newdate=new Date("03/01/1993");
Date latestdate=new Date();
println(olddate.after(newdate));
println(latestdate.after(newdate));
}
}