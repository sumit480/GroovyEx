class test{
static stringXml='<person>'+'<firstName>John</firstName><lastName>Michael</lastName><age>23</age>'+
							'<firstName>Ram</firstName><lastName>Singh</lastName><age>11</age>'+
							'<firstName>Suresh</firstName><lastName>Mahana</lastName><age>24</age>'+
							'<firstName>Steve</firstName><lastName>Smith</lastName><age>43</age>'+
							'<firstName>Nalin</firstName><lastName>Kohli</lastName><age>54</age>'+
							'<firstName>Rajesh</firstName><lastName>Asthana</lastName><age>14</age>'+
							'<firstName>Deccan</firstName><lastName>Herald</lastName><age>20</age>'+
							'<firstName>Sohan</firstName><lastName>verma</lastName><age>30</age>'+
					'</person>';
static main(args){
def pep=new XmlParser()
def people=pep.parseText(stringXml);
people.person.findAll{p ->
            p.age[0].text().toInteger() > 20
        }.each { p ->
            println("${p.lastName[0].text()}, ${p.firstName[0].text()} is ${p.age[0].text()} years old.");
			}
}
}