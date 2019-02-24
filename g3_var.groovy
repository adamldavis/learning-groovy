// ONLY WORKS IN GROOVY 3!

// Java 10/11 var!
var v = 1.5*2
println "Using Groovy $v !"

// also Lambdas
var cube = (var x) -> x*x*x

println "cube(2)= ${cube(2)}"

// or in closure syntax
var upgrade = {var x -> x+1}

println "${upgrade 2.0}"
