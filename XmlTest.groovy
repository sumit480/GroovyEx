def txt='''
        <list>
            <technology>
                <name>Groovy</name>
            </technology>
         </list>
      '''
def list=new XmlParser().parseText(txt)

println list instanceof groovy.util.Node

println list.technology.name.text()
