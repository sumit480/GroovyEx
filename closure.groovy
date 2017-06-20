def closure={
println("Hello World: $it")
def i=10
def h="hello"
println i.getclass()
println h.getclass()
println new Date()
}
for(i in 1..3){
closure()
sleep(1000)
}
println("\n")
(1..3).each({
closure()
sleep(1000)
})
<<<<<<< HEAD
=======

//this is groovy closure program.
>>>>>>> 82c713877ade5b28dca268d30008c86074135c48
