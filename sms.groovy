class SMS {
    String from, to, body;
    def to(String to) { this.to=to; this}
    def from(String from) { this.from=from; this}
    def body(String body) { this.body=body; this}
    static send(Closure c) {
        def s = new SMS()
        c.delegate = s
        c()
        println "sending $s.from $s.to $s.body"
    }
}
SMS.send {
 from '123' 
     to '432'
        body 'msg'
}
