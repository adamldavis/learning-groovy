class Test {
  def methodMissing(String name, args) {
      println "$name $args"
      args.each { println "${it.getClass().name}" }
  }}
  
def test = new Test()

test.foo()
test.foo('param')
test.foo(1, 2)
test.myTask(type: Test)
