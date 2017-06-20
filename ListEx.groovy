<<<<<<< HEAD
/*I'm doing some changes to this file*/
=======
>>>>>>> 82c713877ade5b28dca268d30008c86074135c48
class ListEx{
static void main(String[] args){
//this is the list program to include all operation of list available in groovy
def lst=[12,33,98,55,67,54,78];
def newlst=[];
def newlst2=[];
println(lst);

//add operation
lst.add(45);
println(lst);
lst.add(76);
println(lst);

//contains() will display whether the data is in the list- true/false
println(lst.contains(33));
println(lst.contains(100));

//get() will give the element on specified position
println(lst.get(2));
println(lst.get(8));
println(lst);

//isEmpty() will check if list is empty
println(lst.isEmpty());

//minus() will intersect the element from the list and then print a new list. 
newlst=lst.minus([12,33,98,55]);
println("The Minus operation will remove the data from that list and print a new list.")
println(newlst);

//plus will add collection of data in the list
newlst2=newlst.plus([39,31,87,92]);
println("The Plus operation in List will add data:"+newlst2);

//the pop() will delete the last element from the list
println("The pop operation removes last item from the list");
println(lst.pop());
println(lst);
println(newlst.pop());
println(newlst);
println(newlst2.pop());
println(newlst2+"\n");

//remove() will remove the element from specified position from the list.
println("Remove() will remove the element from specified poition in the\nlist and print that element.");
println(lst.remove(2));
println(lst+"\n");

//reverse() will reverse the entire list and then print the reversed list.
println("The Reverse()will reverse the list and print it.\nIf you want to print that in new list you can pass it in another list.");
println(lst.reverse());

//the size() will the size of list in integer.
println("The size() will print the size of the List");
println(" "+lst.size()+"\n");

//the sort() will print the sorted list in ascending order.
println("The sort() method will sort the list in ascending order.");
println(lst.sort());
}
}