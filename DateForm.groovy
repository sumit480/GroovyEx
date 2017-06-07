import java.text.*;

def showdate(args){
    def cli=new CliBuilder(usage: 'showdate.groovy -[chflm] [date] [prefix]')
    
    cli.with{
    h longOpt: 'help','Show usage infornmation'
    c longOpt: 'format-custom', args:1,argName:'format','Format date with custom format defined by "format"'
    f longOpt: 'format-full','Use DateFormat#FULL format'
    l longOpt: 'format-long','Use DateFormat#LONG format'
    m longOpt: 'format-medium','Use DateFormat#MEDIUM format(default)'
    s longOpt: 'format-short','Use DateFormat#SHORT format' 
    }
    def options=cli.parse(args)
    if(!options){
    return
    }
    if(options.h){
    cli.usage()
    return
    }
    def df= DateFormat.getDateInstance(DateFormat.MEDIUM)
    if(options.f){
    df=DateFormat.getDateInstance(DateFormat.FULL)
    }else if(options.'format-long'){
    df=DateFormat.getDateInstance(DateFormat.LONG)
    }else if(options.s){
    df=DateFormat.getDateInstance(DateFormat.SHORT)
    }else if(options.'format-medium'){
    df=DateFormat.getDateInstance(DateFormat.MEDIUM)
    }else if(options.'format-custom'){
    df=new SimpleDateFormat(options.c)
    }
    def prefix=''
    def date=new Date();
    def extraArgs= options.arguments()
    
    if(extraArgs){
    date=new Date().parse(extraArgs[0])
    
        if(extraArgs.size()>1){
        prefix=extraArgs[1..-1].join(' ')
        }
    }
    "$prefix${df.format(date)}"
}

println showdate(args)