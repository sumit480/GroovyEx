class ExampleList{
	static void main(String[] args){
		def lst=[11,23,12,54];
		def newlst=[];

		println(lst);
		lst.add(45);

		println(lst);
		lst.add(2,20);

		println(lst);

		println(lst.contains(20));
		println(lst.contains(33));

		println(lst.get(2));

		println(lst.isEmpty());

		newlst=lst.minus([11,12]);
		println(newlst);
		
		println(lst.remove(2));
		println(lst);
}
}