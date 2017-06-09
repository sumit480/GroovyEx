class Example{
static void main(String[] args){
try{
def arr=new int[3];
arr[5]=5;
}catch(ArrayIndexOutOfBoundsException IE){
println("Catching the array exception.");
println(IE.toString());
println(IE.getMessage());
println(IE.getStackTrace());
} catch(Exception Ex){
println("Checking exception.");
}finally{
println("This is the finally block");
}
println("MOve on");
}
}

//hello world