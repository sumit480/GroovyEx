def niceHello={firstName,lastName->"Hello, $firstName $lastName"}
println niceHello('Chris','Bennett')
def bye={->'Bye!'}
println bye()

def hello={"Hello $it!"}
println hello('World')