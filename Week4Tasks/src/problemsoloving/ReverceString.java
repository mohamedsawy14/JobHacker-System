package problemsoloving;

public class ReverceString {

    public static void main(String[] args) {
        {
            String str= "Mohamed", nstr="";
            char ch;


            System.out.println("Mohamed");

            for (int i=0; i<str.length(); i++)
            {
                ch= str.charAt(i);
                nstr= ch+nstr;
            }
            System.out.println("Reversed word: "+ nstr);
        }
    }


}
