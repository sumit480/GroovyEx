class Student{
def stuid;
def studname;
void setstudid(int pID){
stuid=pID
}
void setstudname(String pName){
studname=pName
}
int getstudid(){
return this.stuid;
}
String getstudname(){
return this.studname
}
static void main(String[] args){
Student st=new Student();
st.setstudid(1);
st.setstudname("Rohan");
println(st.getstudid()+" "+st.getstudname())
}
}