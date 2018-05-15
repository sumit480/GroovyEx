class Student1OO{

private int StudId;
private String StudName;

void setStudId(int id){
StudId=id;
}

void setStudName(String name){
StudName=name;
}

int getStudId(){
return this.StudId;
}

String getStudname(){
return this.StudName;
}

static void main(String[] args){
Student1OO st=new Student1OO();
st.setStudId(1);
st.setStudName("Suresh");

println(st.getStudId());
println(st.getStudName());

}
}
