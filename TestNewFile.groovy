import java.text.SimpleDateFormat 

static void main(String[] args){
final FileTreeBuilder treeFile=new FileTreeBuilder(new File('tree'))

//def today=new Date()
//def tomorrow= today.next()
//def today1=today.format("dd-MM-yyyy")
//def tomorrow1=tomorrow.format("dd-MM-yyyy")
def dateTime=new Date()
DateTime dt=new DateTime(dateTime)
if(args[0]==1){
DateTime dtPlus=dt.plusDays(1)
}
def date=new SimpleDateFormat("dd-MM-YYYY")
def currentDate=date.format(dateTime)
def file= new File("D:\\IMAGE\\CRELEASE\\"+currentDate)
file.mkdirs()
}