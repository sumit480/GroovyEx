import java.io.File
class File1{
static void main(String[] args){
new File("D:/GroovyEx/textfile.txt").eachLine{
line->println"line:$line";
}
new File("D:/GroovyEx/text1.txt").withWriter('utf-8'){
writer->writer.writeLine 'Hello World'
}
}
}