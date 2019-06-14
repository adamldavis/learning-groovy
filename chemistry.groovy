
// Represents a chemical Element
class Element  {
    String symbol
    Element(s) { symbol = s }
    double getWeight() {symbol=='H' ? 1.00794 : 15.9994}
    String toString() { symbol }
}
// Represents a chemical Compound
class Compound {
    final Map elements = [:]

    Compound(String str) {
        def matcher = str =~ /([A-Z][a-z]*)([0-9]+)?/
        while (matcher.find()) add(
            new Element(matcher.group(1)), 
            (matcher.group(2) ?: 1) as Integer)
    }
    void add(Element e, int num) {
        if (elements[e]) elements[e] += num
        else elements[e] = num
    }
    double getWeight() {
        elements.keySet().inject(0d) { sum, key ->
            sum + (key.weight * elements[key]) 
        }
    }
    String toString() { "$elements" }
}
def propertyMissing(String name) {
    def  comp = new  Compound(name)
       (comp.elements.size() == 1 && comp.elements.values()[0]==1) ?
         comp.elements.keySet()[0] : comp
}
def water = H2O
println water
println water.weight

