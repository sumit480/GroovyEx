import groovy.xml.MarkupBuilder
class example{
static void main(String[] args){
def mB=new MarkupBuilder()
mB.collection(shelf:'New Arrivals'){
movie(title:'Enemy Behind')
type('War,Thriller')
format('DVD')
year('2003')
rating('PG')
stars('10')
description('Talk about a US-Japan war')
}
}
}