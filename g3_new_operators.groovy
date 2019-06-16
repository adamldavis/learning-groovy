
// ONLY WORKS IN GROOVY 3!
def section = x -> println("-"*30 + x)
def squares = (1..5).collect{it*it}
// !IN
section('!in')

println "11 not in $squares? ${11 !in squares}"
println "15 not in $squares? ${15 !in squares}"

// !INSTANCEOF
section('!instanceof')

if (1 !instanceof String) println "1 !instanceof String"

// Elvis assign
section('Elvis assignment')

def x = null

x ?= "Elvis waz here"
println x

// Equality
section('===')

def date1 = new Date(0)
def date2 = new Date(0)

assert date1 == date2
assert date1.equals(date2)

assert !(date1 === date2)
assert !(date1.is(date2))
assert date1 !== date2

println "date1==date2 ==> ${date1 == date2}"
println "date1===date2 ==> ${date1 === date2}"

section 'safe indexing'

assert null?[0] == null
def array = ['foo', 'bar']
assert array?[0] == 'foo'
println array?[1]
array = null
println array?[1]

section "end"

