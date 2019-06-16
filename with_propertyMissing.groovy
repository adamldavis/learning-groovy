class CC {
    Map values = [:]
    def propertyMissing(String name) { println "name=$name"; values[name] }
    def propertyMissing(String name, val) { values[name] = val; println "$name := $val" }
}
def c = new CC()
c.with {
    x = 1
    10.times {x++}
}