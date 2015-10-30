
BLOCK: { // this is how you define a block of code.
    // this is so I can reuse variable names.
}
INTRO: {
    // references

    String hello = "Hello World!";
    println(hello)
    
    String gold = "Au"; // this is a comment
    String a = gold; // a is now "Au"
    String b = a; // b is now "Au"
    b = "Br"; 
    
    println("gold=$gold  a=$a  b=$b")
    /* b is now "Br".
       this is still a comment */
       
    // MATH
    def zombies = 0
    
    zombies = zombies + 1;
    zombies += 1;
    zombies++;
    zombies--;
    println(zombies + " zombies")
    
    int legs = zombies * 2;
    int halfZombies = zombies / 2;
    float oneThirdZombies = zombies / 3.0f;
    double nextYearEstimate = Math.pow(zombies, 2.0d);
    
    println("legs=$legs  half=$halfZombies  oneThirdZombies=${oneThirdZombies}")
    println("nextYearEstimate = $nextYearEstimate")
    
    
    int roll = (int) (Math.random() * 6);
    Random randy = new Random();
    int roll6 = randy.nextInt(6) + 1; // 1 to 6
    int roll12 = randy.nextInt(12) + 1; // 1 to 12
    
    println("roll6=$roll6  roll12=$roll12")
    
    int[] vampireAges = new int[10]; // ten vampires
    vampireAges[0] = 1565; // first vampire
    vampireAges[9] = 442; // last vampire
    
    println("vampireAges=$vampireAges")
    
    int year = new Date().year+1900; // current year?
    int firstVampBornYear = year - vampireAges[0];

    println("year=$year firstVampBornYear=$firstVampBornYear")
}