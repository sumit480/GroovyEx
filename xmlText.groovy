class xmlTest{
static main(args){
def person=new XmlParser().parse(new File("D:/xml1.xml"))
println("First Name: ${person.firstName.text()}");
println("Last Name: ${person.lastName.text()}");
println("Age: ${person.age.text()}");
println("Age: ${person.age.@accurate.value[0]}");
}
}