class DateT{
static void main(String[] args){
Date date=new Date(100);
println(date.toString());
Date olddate=new Date("06/11/1992");
Date newdate=new Date("03/01/1993");
Date latestdate=new Date();
println(latestdate.toString());
println(olddate.after(newdate));
println(latestdate.after(newdate));
//println(latestdate.getTime);
//println(olddate.getTime());
//println(newdate.getTime());
olddate.setTime(30000);
println(olddate.toString());

}
}