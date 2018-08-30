package warmup1;

public class App {

    public static void main(String[] args) {

        //instantiates
        Imp imp = new Imp();

      //******https://codingbat.com/java/Warmup-1******first column

        //sleepIn
        imp.sleepIn(false, false); //true
        imp.sleepIn(true, false); // false
        imp.sleepIn(false, true); // true
        imp.sleepIn(true, true); //true

        //diff21
        imp.diff21(2); //2
        imp.diff21(11); //11
        imp.diff21(0); //0
        imp.diff21(2); //2
        imp.diff21(8); //8
        imp.diff21(18); //18
        imp.diff21(21); //21
        imp.diff21(20); //20
        imp.diff21(19); //19
        imp.diff21(22); //22
        imp.diff21(23); //23
        imp.diff21(58); //58

        //nearHundred
        imp.nearHundred(93); //true
        imp.nearHundred(90); //true
        imp.nearHundred(89); //false
        imp.nearHundred(110); //true
        imp.nearHundred(111); //false
        imp.nearHundred(121); //false
        imp.nearHundred(-101); //false
        imp.nearHundred(-209); //false
        imp.nearHundred(190); //true
        imp.nearHundred(209); //true
        imp.nearHundred(0); //false
        imp.nearHundred(5); //false
        imp.nearHundred(-50); //false
        imp.nearHundred(191); //true
        imp.nearHundred(189); //false
        imp.nearHundred(200); //true
        imp.nearHundred(210); //true
        imp.nearHundred(211); //false
        imp.nearHundred(290); //false

        //missingChar
        imp.missingChar("kitten", 1); //ktten
        imp.missingChar("kitten", 0); //itten
        imp.missingChar("kitten", 4); //kittn
        imp.missingChar("Hi", 0); //i
        imp.missingChar("Hi", 1); //H
        imp.missingChar("code",0); //ode
        imp.missingChar("code", 1); //cde
        imp.missingChar("code", 2); //coe
        imp.missingChar("code", 3); //cod
        imp.missingChar("chocolate", 8); //chocolat

        //backAround
        imp.backAround("cat"); //tcatt
        imp.backAround("Hello"); //oHelloo
        imp.backAround("a"); //aaa
        imp.backAround("abc"); //cabcc
        imp.backAround("read"); //dreadd
        imp.backAround("boo"); //obooo

        //startHi
        imp.startHi("hi there"); //true
        imp.startHi("hi"); //true
        imp.startHi("hello hi"); //false
        imp.startHi("he"); //false
        imp.startHi("h"); //false
        imp.startHi(""); //false
        imp.startHi("ho hi"); //false
        imp.startHi("hi ho"); //true

        //hasTeen
        imp.hasTeen(13, 20, 10); //true
        imp.hasTeen(20, 19, 10); //true
        imp.hasTeen(20, 10, 13); //true
        imp.hasTeen(1, 20, 12); //false
        imp.hasTeen(19, 20, 12); //true
        imp.hasTeen(12, 20, 19); //true
        imp.hasTeen(12, 9, 20); //false
        imp.hasTeen(12, 18, 20); //true
        imp.hasTeen(14, 2, 20); //true
        imp.hasTeen(4, 2, 20); //false
        imp.hasTeen(11, 22, 22); //false

        //mixStart
        imp.mixStart("mix snacks"); //true
        imp.mixStart("pix snacks"); //true
        imp.mixStart("piz snacks"); //false
        imp.mixStart("nix"); //true
        imp.mixStart("ni"); //false
        imp.mixStart("n"); //false
        imp.mixStart(""); //false

        //close10
        imp.close10(8, 13); //8
        imp.close10(13, 8); //8
        imp.close10(13, 7); //0
        imp.close10(7, 13); //0
        imp.close10(9, 13); //9
        imp.close10(13, 8); //8
        imp.close10(10, 12); //10
        imp.close10(11, 10); //10
        imp.close10(5, 21); //5
        imp.close10(0, 20); //0
        imp.close10(10, 10); //0

        //stringE
        imp.stringE("Hello"); //true
        imp.stringE("Heelle"); //true
        imp.stringE("Heelele"); //false
        imp.stringE("Hll"); //false
        imp.stringE("e"); //true
        imp.stringE(""); //false

        //everyNth
        imp.everyNth("Miracle", 2); //Mrce
        imp.everyNth("abcdefg", 2); //aceg
        imp.everyNth("abcdefg", 3); //adg
        imp.everyNth("Chocolate", 3); //Cca
        imp.everyNth("Chocolates", 3); //Ccas
        imp.everyNth("Chocolates", 4); //Coe
        imp.everyNth("Chocolates", 100); //C


      //******https://codingbat.com/java/Warmup-1******second column

        //monkeyTrouble
        imp.monkeyTrouble(true, true); //true
        imp.monkeyTrouble(false, false); //false
        imp.monkeyTrouble(true, false); //false
        imp.monkeyTrouble(false, true); //false

        //parrotTrouble
        imp.parrotTrouble(true, 6); //true
        imp.parrotTrouble(true, 7); //false
        imp.parrotTrouble(false, 6); //false
        imp.parrotTrouble(true, 21); //true
        imp.parrotTrouble(false, 21); //false
        imp.parrotTrouble(false, 20); //false
        imp.parrotTrouble(true, 23); //true
        imp.parrotTrouble(false, 23); //false
        imp.parrotTrouble(true, 20); //false
        imp.parrotTrouble(false, 12); //false

        //posNeg
        imp.posNeg(1, -1, false); //true
        imp.posNeg(-1, 1, false); //true
        imp.posNeg(-4, -5, true); //true
        imp.posNeg(-4, -5, false); //false
        imp.posNeg(-4, 5, false); //true
        imp.posNeg(-4, 5, true); //false
        imp.posNeg(1, 1, false); //false
        imp.posNeg(-1, -1, false); //false
        imp.posNeg(1, -1, true); //false
        imp.posNeg(-1, 1, true); //false
        imp.posNeg(1, 1, true); //false
        imp.posNeg(-1, -1, true); //true
        imp.posNeg(5, -5, false); //true
        imp.posNeg(-6, 6, false); //true
        imp.posNeg(-5, -6, false); //false
        imp.posNeg(-2, -1, false); //false
        imp.posNeg(1, 2, false); //false
        imp.posNeg(-5, 6, true); //false
        imp.posNeg(-5, -5, true); //true

        //frontBack
        imp.frontBack("code"); //eodc
        imp.frontBack("a"); //a
        imp.frontBack("ab"); //ba
        imp.frontBack("abc"); //cba
        imp.frontBack(""); //""
        imp.frontBack("Chocolate"); //ehocolatC
        imp.frontBack("aavJ"); //Java
        imp.frontBack("hello"); //oellh

        //or35
        imp.or35(3); //true
        imp.or35(10); //true
        imp.or35(8); //false
        imp.or35(15); //true
        imp.or35(5); //true
        imp.or35(9); //true
        imp.or35(4); //false
        imp.or35(7); //false
        imp.or35(6); //false
        imp.or35(17); //false
        imp.or35(18); //true
        imp.or35(29); //false
        imp.or35(20); //true
        imp.or35(21); //true
        imp.or35(22); //false
        imp.or35(45); //true
        imp.or35(99); //true
        imp.or35(100); //true
        imp.or35(101); //false
        imp.or35(121); //false
        imp.or35(122); //false
        imp.or35(123); //true

        //icyHot
        imp.icyHot(120, -1); //true
        imp.icyHot(-1, 120); //true
        imp.icyHot(2, 120); //false
        imp.icyHot(-1, 100); //false
        imp.icyHot(-2, -2); //false
        imp.icyHot(120, 120); //false

        //loneTeen
        imp.loneTeen(13, 99); //true
        imp.loneTeen(21, 19); //true
        imp.loneTeen(13, 13); //false
        imp.loneTeen(14, 20); //true
        imp.loneTeen(20, 15); //true
        imp.loneTeen(16, 17); //false
        imp.loneTeen(16, 9); //true
        imp.loneTeen(16, 18); //false
        imp.loneTeen(13, 19); //false
        imp.loneTeen(13, 20); //true
        imp.loneTeen(6, 18); //true
        imp.loneTeen(99, 13); //true
        imp.loneTeen(99, 99); //false

        //startOz
        imp.startOz("ozymandias"); //oz
        imp.startOz("bzoo"); //z
        imp.startOz("oxx"); //o
        imp.startOz("oz"); //oz
        imp.startOz("ounce"); //o
        imp.startOz("o"); //o
        imp.startOz("abc"); //""
        imp.startOz(""); //""
        imp.startOz("zoo"); //""
        imp.startOz("aztec"); //z
        imp.startOz("zzzz"); //z
        imp.startOz("oznic"); //oz

        //in3050
        imp.in3050(30, 31); //true
        imp.in3050(30, 41); //false
        imp.in3050(40, 50); //true
        imp.in3050(40, 51); //false
        imp.in3050(39, 50); //false
        imp.in3050(50, 39); //false
        imp.in3050(40, 39); //true
        imp.in3050(49, 48); //true
        imp.in3050(50, 40); //true
        imp.in3050(50, 51); //false
        imp.in3050(35, 36); //true
        imp.in3050(35, 45); //false

        //lastDigit
        imp.lastDigit(7, 17); //true
        imp.lastDigit(6, 17); //false
        imp.lastDigit(3, 113); //true
        imp.lastDigit(114, 113); //false
        imp.lastDigit(114, 4); //true
        imp.lastDigit(10, 0); //true
        imp.lastDigit(11, 0); //false


      //******https://codingbat.com/java/Warmup-1******third column

        //sumDouble
        imp.sumDouble(1, 2); //3
        imp.sumDouble(3, 2); //5
        imp.sumDouble(2, 2); //8
        imp.sumDouble(-1, 0); //-1
        imp.sumDouble(3, 3); //12
        imp.sumDouble(0, 0); //0
        imp.sumDouble(0, 1); //1
        imp.sumDouble(3, 4); //7

        //makes10
        imp.makes10(9, 10); //true
        imp.makes10(9, 9); //false
        imp.makes10(1, 9); //true
        imp.makes10(10, 1); //true
        imp.makes10(10, 10); //true
        imp.makes10(8, 2); //true
        imp.makes10(8, 3); //false
        imp.makes10(10, 42); //true
        imp.makes10(12, -2); //true

        //notString
        imp.notString("candy"); //not candy
        imp.notString("x"); //not x
        imp.notString("not bad"); //not bad
        imp.notString("bad"); //not bad
        imp.notString("not"); //not
        imp.notString("is not"); //not is not
        imp.notString("no"); //not no

        //front3
        imp.front3("Java"); //JavJavJav
        imp.front3("Chocolate"); //ChoChoCho
        imp.front3("abc"); //abcabcabc
        imp.front3("abcXYZ"); //abcabcabc
        imp.front3("ab"); //ababab
        imp.front3("a"); //aaa
        imp.front3(""); //""

        //front22
        imp.front22("kitten"); //kikittenki
        imp.front22("Ha"); //HaHaHa
        imp.front22("abc"); //ababcab
        imp.front22("ab"); //ababab
        imp.front22("a"); //aaa
        imp.front22(""); //""
        imp.front22("Logic"); //LoLogicLo

        //in1020
        imp.in1020(12, 99); //true
        imp.in1020(21, 12); //true
        imp.in1020(8, 99); //false
        imp.in1020(99, 10); //true
        imp.in1020(20, 20); //true
        imp.in1020(21, 21); //false
        imp.in1020(9, 9); //false


        //delDel
        imp.delDel("adelbc"); //abc
        imp.delDel("adelHello"); //aHello
        imp.delDel("adedbc"); //adedbc
        imp.delDel("abcdel"); //abcdel
        imp.delDel("add"); //add
        imp.delDel("ad"); //ad
        imp.delDel("a"); //a
        imp.delDel(""); //""
        imp.delDel("del"); //del
        imp.delDel("adel"); //a
        imp.delDel("aadelbb"); //aadelbb

        //intMax
        imp.intMax(1, 2, 3); //3
        imp.intMax(1, 3, 2); //3
        imp.intMax(3, 2, 1); //3
        imp.intMax(9, 3, 3); //9
        imp.intMax(3, 9, 3); //9
        imp.intMax(3, 3, 9); //9
        imp.intMax(8, 2, 3); //8
        imp.intMax(-3, -1, -2); //-1
        imp.intMax(6, 2, 5); //6
        imp.intMax(5, 6, 2); //6
        imp.intMax(5, 2, 6); //6

        //max1020
        imp.max1020(11, 19); //19
        imp.max1020(19, 11); //19
        imp.max1020(11, 9); //11
        imp.max1020(9, 21); //0
        imp.max1020(10, 21); //10
        imp.max1020(21, 10); //10
        imp.max1020(9, 11); //11
        imp.max1020(23, 10); //23
        imp.max1020(20, 10); //20
        imp.max1020(7, 20); //20
        imp.max1020(17, 16); //17

        //endUp
        imp.endUp("Hello"); //HeLLO
        imp.endUp("hi there"); //hi thERE
        imp.endUp("hi"); //HI
        imp.endUp("woo hoo"); //woo HOO
        imp.endUp("xyz12"); //xyZ12
        imp.endUp("x"); //X
        imp.endUp(""); //""

    }
}
