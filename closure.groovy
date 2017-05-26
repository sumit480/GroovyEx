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
