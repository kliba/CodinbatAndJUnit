package string2;

public class App {

    public static void main(String[] args) {

        String2 myString2 = new String2();

        //******https://codingbat.com/java/String-1******first column

        //doubleChar
        myString2.doubleChar("The");
        myString2.doubleChar("AAbb");
        myString2.doubleChar("Hi-There");
        myString2.doubleChar("Word!");
        myString2.doubleChar("!!");
        myString2.doubleChar("");
        myString2.doubleChar("a");
        myString2.doubleChar(".");
        myString2.doubleChar("aa");

        //countCode
        myString2.countCode("aaacodebbb");
        myString2.countCode("codexxcode");
        myString2.countCode("cozexxcope");
        myString2.countCode("cozfxxcope");
        myString2.countCode("xxcozeyycop");
        myString2.countCode("cozcop");
        myString2.countCode("abcxyz");
        myString2.countCode("code");
        myString2.countCode("ode");
        myString2.countCode("c");
        myString2.countCode("");
        myString2.countCode("AAcodeBBcoleCCccoreDD");
        myString2.countCode("AAcodeBBcoleCCccorfDD");
        myString2.countCode("coAcodeBcoleccoreDD");

        //bobThere
        myString2.bobThere("abcbob");
        myString2.bobThere("b9b");
        myString2.bobThere("bac");
        myString2.bobThere("bbb");
        myString2.bobThere("abcdefb");
        myString2.bobThere("123abcbcdbabxyz");
        myString2.bobThere("b12");
        myString2.bobThere("b1b");
        myString2.bobThere("b12b1b");
        myString2.bobThere("bbc");
        myString2.bobThere("bbb");
        myString2.bobThere("bb");
        myString2.bobThere("b");

        //repeatEnd
        myString2.repeatEnd("Hello", 3);
        myString2.repeatEnd("Hello", 2);
        myString2.repeatEnd("Hello", 1);
        myString2.repeatEnd("Hello", 0);
        myString2.repeatEnd("abc", 3);
        myString2.repeatEnd("1234", 2);
        myString2.repeatEnd("1234", 3);
        myString2.repeatEnd("", 0);

        //prefixAgain
        myString2.prefixAgain("abXYabc", 1);
        myString2.prefixAgain("abXYabc", 2);
        myString2.prefixAgain("abXYabc", 3);
        myString2.prefixAgain("xyzxyxyxy", 2);
        myString2.prefixAgain("xyzxyxyxy", 3);
        myString2.prefixAgain("Hi12345Hi6789Hi10", 1);
        myString2.prefixAgain("Hi12345Hi6789Hi10", 2);
        myString2.prefixAgain("Hi12345Hi6789Hi10", 3);
        myString2.prefixAgain("Hi12345Hi6789Hi10", 4);
        myString2.prefixAgain("a", 1);
        myString2.prefixAgain("aa", 1);
        myString2.prefixAgain("ab", 1);

        //sameStarChar
        myString2.sameStarChar("xy*yzz");
        myString2.sameStarChar("xy*zzz");
        myString2.sameStarChar("*xa*az");
        myString2.sameStarChar("*xa*bz");
        myString2.sameStarChar("*xa*a*");
        myString2.sameStarChar("");
        myString2.sameStarChar("*xa*a*a");
        myString2.sameStarChar("*xa*a*b");
        myString2.sameStarChar("*12*2*2");
        myString2.sameStarChar("12*2*3*");
        myString2.sameStarChar("abcDEF");
        myString2.sameStarChar("XY*YYYY*Z*");
        myString2.sameStarChar("XY*YYYY*Y*");
        myString2.sameStarChar("12*2*3*");
        myString2.sameStarChar("*");
        myString2.sameStarChar("**");

        //starOut
        myString2.starOut("ab*cd");
        myString2.starOut("ab**cd");
        myString2.starOut("sm*eilly");
        myString2.starOut("sm*eil*ly");
        myString2.starOut("sm**eil*ly");
        myString2.starOut("sm***eil*ly");
        myString2.starOut("stringy*");
        myString2.starOut("*stringy");
        myString2.starOut("*str*in*gy");
        myString2.starOut("abc");
        myString2.starOut("a*bc");
        myString2.starOut("ab");
        myString2.starOut("a*b");
        myString2.starOut("a");
        myString2.starOut("a*");
        myString2.starOut("*a");
        myString2.starOut("*");
        myString2.starOut("");


        //******https://codingbat.com/java/String-1******second column

        //countHi
        myString2.countHi("abc hi ho");
        myString2.countHi("ABChi hi");
        myString2.countHi("hihi");
        myString2.countHi("hiHIhi");
        myString2.countHi("");
        myString2.countHi("h");
        myString2.countHi("hi");
        myString2.countHi("Hi is no HI on ahI");
        myString2.countHi("hiho not HOHIhi");

        //endOther
        myString2.endOther("Hiabc", "abc");
        myString2.endOther("AbC", "HiaBc");
        myString2.endOther("abc", "abXabc");
        myString2.endOther("Hiabc", "abcd");
        myString2.endOther("Hiabc", "bc");
        myString2.endOther("Hiabcx", "bc");
        myString2.endOther("abc", "abc");
        myString2.endOther("xyz", "12xyz");
        myString2.endOther("yz", "12xz");
        myString2.endOther("Z", "12xz");
        myString2.endOther("12", "12");
        myString2.endOther("abcXYZ", "abcDEF");
        myString2.endOther("ab", "ab12");
        myString2.endOther("ab", "12ab");

        //xyBalance
        myString2.xyBalance("aaxbby");
        myString2.xyBalance("aaxbb");
        myString2.xyBalance("yaaxbb");
        myString2.xyBalance("yaaxbby");
        myString2.xyBalance("xaxxbby");
        myString2.xyBalance("xaxxbbyx");
        myString2.xyBalance("xxbxy");
        myString2.xyBalance("xxbx");
        myString2.xyBalance("bbb");
        myString2.xyBalance("bxbb");
        myString2.xyBalance("bxyb");
        myString2.xyBalance("xy");
        myString2.xyBalance("y");
        myString2.xyBalance("x");
        myString2.xyBalance("");
        myString2.xyBalance("yxyxyxyx");
        myString2.xyBalance("yxyxyxyxy");
        myString2.xyBalance("12xabxxydxyxyzz");

        //repeatFront
        myString2.repeatEnd("Chocolate", 4);
        myString2.repeatEnd("Chocolate", 3);
        myString2.repeatEnd("Ice Cream", 2);
        myString2.repeatEnd("Ice Cream", 1);
        myString2.repeatEnd("Ice Cream", 0);
        myString2.repeatEnd("xyz", 3);
        myString2.repeatEnd("", 0);
        myString2.repeatEnd("Java", 4);
        myString2.repeatEnd("Java", 1);

        //xyzMiddle
        myString2.xyzMiddle("AAxyzBB");
        myString2.xyzMiddle("AxyzBB");
        myString2.xyzMiddle("AxyzBBB");
        myString2.xyzMiddle("AxyzBBBB");
        myString2.xyzMiddle("AAAxyzB");
        myString2.xyzMiddle("AAAxyzBB");
        myString2.xyzMiddle("AAAAxyzBB");
        myString2.xyzMiddle("AAAAAxyzBBB");
        myString2.xyzMiddle("1x345xyz12x4");
        myString2.xyzMiddle("xyzAxyzBBB");
        myString2.xyzMiddle("xyzAxyzBxyz");
        myString2.xyzMiddle("xyzxyzAxyzBxyzxyz");
        myString2.xyzMiddle("xyzxyzxyzBxyzxyz");
        myString2.xyzMiddle("xyzxyzAxyzxyzxyz");
        myString2.xyzMiddle("xyzxyzAxyzxyzxy");
        myString2.xyzMiddle("AxyzxyzBB");
        myString2.xyzMiddle("");
        myString2.xyzMiddle("x");
        myString2.xyzMiddle("xy");
        myString2.xyzMiddle("xyz");
        myString2.xyzMiddle("xyzz");

        //oneTwo
        myString2.oneTwo("abc");
        myString2.oneTwo("tca");
        myString2.oneTwo("tcagdo");
        myString2.oneTwo("chocolate");
        myString2.oneTwo("1234567890");
        myString2.oneTwo("xabxabxabxabxabxabxab");
        myString2.oneTwo("abcdefx");
        myString2.oneTwo("abcdefxy");
        myString2.oneTwo("abcdefxyz");
        myString2.oneTwo("");
        myString2.oneTwo("x");
        myString2.oneTwo("xy");
        myString2.oneTwo("yxz");
        myString2.oneTwo("abcdefghijklkmnopqrstuvwxyz1234567890");
        myString2.oneTwo("abcdefghijklkmnopqrstuvwxyz123456789");
        myString2.oneTwo("abcdefghijklkmnopqrstuvwxyz12345678");

    }
}
