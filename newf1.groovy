import java.text.SimpleDateFormat 

static void main(String[] args){
final FileTreeBuilder treeFile=new FileTreeBuilder(new File('tree'))
def today=new Date()
def tomorrow= today.next()
def today1=today.format("dd-MM-yyyy")
def tomorrow1=tomorrow.format("dd-MM-yyyy")
//def dateTime=new Date()
//def date=new SimpleDateFormat("dd-MM-YYYY")
//def currentDate=date.format(dateTime)
if(args[0]==0){
def file= new File("D:\\IMAGE\\CRELEASE\\"+today1)
file.mkdirs()
}else if(args[0]==1){
def file=new File("D:\\IMAGE\\CRELEASE\\"+tomorrow1)
file.mkdirs()
}
}