package string3;

public class App {

    public static void main(String[] args) {

        String3 myString3 = new String3();

        //******https://codingbat.com/java/String-3******first column

        //countXZ
        myString3.countYZ("fez day");
        myString3.countYZ("day fez");
        myString3.countYZ("day fyyyz");
        myString3.countYZ("day yak");
        myString3.countYZ("day:yak");
        myString3.countYZ("!!day--yaz!!");
        myString3.countYZ("yak zak");
        myString3.countYZ("DAY abc XYZ");
        myString3.countYZ("aaz yyz my");
        myString3.countYZ("y2bz");
        myString3.countYZ("zxyx");

        //gHappy
        myString3.gHappy("xxggxx");
        myString3.gHappy("xxgxx");
        myString3.gHappy("xxggyygxx");
        myString3.gHappy("g");
        myString3.gHappy("gg");
        myString3.gHappy("");
        myString3.gHappy("xxgggxyz");
        myString3.gHappy("xxgggxyg");
        myString3.gHappy("xxgggxygg");
        myString3.gHappy("mgm");
        myString3.gHappy("mggm");
        myString3.gHappy("yyygggxyy");

        //sameEnds
        myString3.sameEnds("abXYab");
        myString3.sameEnds("xx");
        myString3.sameEnds("xxx");
        myString3.sameEnds("xxxx");
        myString3.sameEnds("javaXYZjava");
        myString3.sameEnds("javajava");
        myString3.sameEnds("xavaXYZjava");
        myString3.sameEnds("Hello! and Hello!");
        myString3.sameEnds("x");
        myString3.sameEnds("");
        myString3.sameEnds("abcb");
        myString3.sameEnds("mymmy");

        //sumNumbers
        myString3.sumNumbers("abc123xyz");
        myString3.sumNumbers("aa11b33");
        myString3.sumNumbers("7 11");
        myString3.sumNumbers("Chocolate");
        myString3.sumNumbers("5hoco1a1e");
        myString3.sumNumbers("5$$1;;1!!");
        myString3.sumNumbers("a1234bb11");
        myString3.sumNumbers("");
        myString3.sumNumbers("a22bbb3");

        //******https://codingbat.com/java/String-3******second column

        //withoutString
        myString3.withoutString("Hello there", "llo");
        myString3.withoutString("Hello there", "e");
        myString3.withoutString("Hello there", "x");
        myString3.withoutString("This is a FISH", "IS");
        myString3.withoutString("THIS is a FISH", "is");
        myString3.withoutString("THIS is a FISH", "iS");
        myString3.withoutString("abxxxxab", "xx");
        myString3.withoutString("abxxxab", "xx");
        myString3.withoutString("abxxxab", "x");
        myString3.withoutString("xxx", "x");
        myString3.withoutString("xxx", "xx");
        myString3.withoutString("xyzzy", "y");
        myString3.withoutString("", "x");
        myString3.withoutString("abcabc", "b");
        myString3.withoutString("AA22bb", "2");
        myString3.withoutString("1111", "1");
        myString3.withoutString("1111", "11");
        myString3.withoutString("MkjtMkx", "Mk");
        myString3.withoutString("Hi HoHo", "Ho");

        //countTriple
        myString3.countTriple("abcXXXabc");
        myString3.countTriple("xxxabyyyycd");
        myString3.countTriple("a");
        myString3.countTriple("");
        myString3.countTriple("XXXabc");
        myString3.countTriple("XXXXabc");
        myString3.countTriple("XXXXXabc");
        myString3.countTriple("222abyyycdXXX");
        myString3.countTriple("abYYYabXXXXXab");
        myString3.countTriple("abYYXabXXYXXab");
        myString3.countTriple("abYYXabXXYXXab");
        myString3.countTriple("122abhhh2");

        //mirrorEnds
        myString3.mirrorEnds("abXYZba");
        myString3.mirrorEnds("abca");
        myString3.mirrorEnds("aba");
        myString3.mirrorEnds("abab");
        myString3.mirrorEnds("xxx");
        myString3.mirrorEnds("xxYxx");
        myString3.mirrorEnds("Hi and iH");
        myString3.mirrorEnds("x");
        myString3.mirrorEnds("");
        myString3.mirrorEnds("123and then 321");
        myString3.mirrorEnds("band andab");

        //notReplace
        myString3.notReplace("is test");
        myString3.notReplace("is-is");
        myString3.notReplace("This is right");
        myString3.notReplace("This is isabell");
        myString3.notReplace("");
        myString3.notReplace("is");
        myString3.notReplace("isis");
        myString3.notReplace("Dis is bliss is");
        myString3.notReplace("is his");
        myString3.notReplace("xis yis");
        myString3.notReplace("AAAis is");

        //******https://codingbat.com/java/String-3******third column

        //equalIsNot
        myString3.equalIsNot("This is not");
        myString3.equalIsNot("This is notnot");
        myString3.equalIsNot("noisxxnotyynotxisi");
        myString3.equalIsNot("noisxxnotyynotxsi");
        myString3.equalIsNot("xxxyyyzzzintint");
        myString3.equalIsNot("");
        myString3.equalIsNot("isisnotnot");
        myString3.equalIsNot("isisnotno7Not");
        myString3.equalIsNot("isnotis");
        myString3.equalIsNot("mis3notpotbotis");

        //sumDigits
        myString3.sumDigits("aa1bc2d3");
        myString3.sumDigits("aa11b33");
        myString3.sumDigits("Chocolate");
        myString3.sumDigits("5hoco1a1e");
        myString3.sumDigits("123abc123");
        myString3.sumDigits("");
        myString3.sumDigits("Hello");
        myString3.sumDigits("X1z9b2");
        myString3.sumDigits("5432a");

        //maxBlock
        myString3.maxBlock("hoopla");
        myString3.maxBlock("abbCCCddBBBxx");
        myString3.maxBlock("");
        myString3.maxBlock("xyz");
        myString3.maxBlock("xxyz");
        myString3.maxBlock("xyzz");
        myString3.maxBlock("abbbcbbbxbbbx");
        myString3.maxBlock("XXBBBbbxx");
        myString3.maxBlock("XXBBBBbbxx");
        myString3.maxBlock("XXBBBbbxxXXXX");
        myString3.maxBlock("XX2222BBBbbXX2222");
    }
}
