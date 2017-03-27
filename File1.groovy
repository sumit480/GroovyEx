import java.io.File
class File1{
static void main(String[] args){
new File("D:/textfile.txt").eachLine{
line->println"line:$line";
}
}
}