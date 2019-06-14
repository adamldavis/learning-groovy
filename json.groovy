import groovy.json.*

def slurper = new JsonSlurper()
def builder = new JsonBuilder()

builder.person {
    name 'Adam'
    age 37
    conferences 'Gr8Conf', 'ÜberConf'
}
println builder

def result = slurper.parseText(builder.toString())

assert result.person.name == "Adam"
assert result.person.age == 37
assert result.person.conferences.size() == 2
assert result.person.conferences[0] == "Gr8Conf"
result