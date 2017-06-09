import groovy.lang.*;

def inputF=new File("D:\\GroovyEx-master\\Employee.xml")

if(!inputF.exists()){
alert.showInfoMessage("The file 'Employee.xml' does not exists")
}else{
def inputXml=new XmlParser().parseText(inputF.text)
def inputRow=inputXml.Employee.findAll{
 it.Age.text().toInteger()>19;
}
inputRow.each{

println it.Name.text()
}

}