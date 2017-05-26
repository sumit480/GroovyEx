class Student3{
int StudID;
def StudName;
int Mark1;
int Mark2;
int Mark3;
int Total(){
return Mark1+Mark2+Mark3;
}
static void main(String[] args){
Student3 st1=new Student3();
Student3 st2=new Student3();
Student3 st3=new Student3();

st1.StudID=1;
st1.StudName="Rohan";
st1.Mark1=20;
st1.Mark2=39
st1.Mark3=45;

st2.StudID=2;
st2.StudName="Rajesh";
st2.Mark1=54;
st2.Mark2=45;
st2.Mark3=34;

st3.StudID=3;
st3.StudName="Sohan";
st3.Mark1=45;
st3.Mark2=34;
st3.Mark3=54

println(st1.StudID+" "+st1.StudName+": "+st1.Total())
println(st2.StudID+" "+st2.StudName+": "+st2.Total())
println(st3.StudID+" "+st3.StudName+": "+st3.Total())
}
}