//USE: groovy -Dgroovy.attach.runtime.groovydoc=true -cp Test.groovy groovydoc.groovy

def method = Test.methods.find{ it.name=='method' }
def methodDoc = method.groovydoc

println methodDoc.properties
assert methodDoc
assert methodDoc.present
assert methodDoc.content

println Test.groovydoc
println methodDoc

assert methodDoc.content == '/**@My metadata */'
assert Test.groovydoc.content == '/**@Test */'

