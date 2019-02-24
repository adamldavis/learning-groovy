
// ONLY WORKS IN GROOVY 3!

// LAMBDAS

def lambda = (x,date2) -> {x + date2}
def section = x -> println("-"*30 + x)

def square = x -> x*x

section "Lambdas"
println "2^2 = ${square(2)}"

// METHOD REF

section "Method Refs"
def sq(x) { x*x }

def squares = (1..12).collect( this::sq )

println "squares=$squares"

// Constructor REF
section "Constructor Refs"
def newDate = Date::new
def dates = squares.collect(newDate)

println "dates.size=${dates.size}"
