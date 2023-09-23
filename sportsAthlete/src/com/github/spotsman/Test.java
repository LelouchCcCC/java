package com.github.spotsman;

public class Test {
    public static void main(String[] args) {
        PingpangAthelete pa = new PingpangAthelete("zhf",13);
        BasketballAthlete ba = new BasketballAthlete("fnei",43);
        PingpangCoach pc = new PingpangCoach("zlx",42);
        BasketballCoach bc = new BasketballCoach("zod", 93);
        pa.speaking();
        pa.learning();
        ba.learning();
        pc.teaching();
        pc.speaking();
        bc.teaching();
    }
}
