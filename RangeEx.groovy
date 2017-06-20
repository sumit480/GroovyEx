<<<<<<< HEAD
load D:/GroovyEx-master/ListEx.groovy

=======
>>>>>>> 82c713877ade5b28dca268d30008c86074135c48
class RangeEx{
static void main(String[] args){
def rint=1..10;
println(rint);

println(rint.contains(2));
println(rint.contains(18));

println(rint.get(2));
println(rint.get(4));

println("The lower value: "+rint.getFrom());

println("The Upper value: "+rint.getTo())

println("The size of the range: "+rint.size())

println("The sublist is: "+rint.subList(2,6));
}
}