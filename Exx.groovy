class Exx{
static void main(String[] args){
Student st=new Student();
st.StudID=1;
st.name="Joe";
println(st.name);
}
}
class Person{
public String name;
public Person(){}
}
class Student extends Person{
int StudID;
int Mark1;
public Student(){
super();
}
}