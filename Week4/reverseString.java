import java.util.Scanner;

public class reverseString {
           public static void reverseString(char[] s) {
               //base method
            if (s == null || s.length <= 1) {
                return;
            }

            check(s, 0, s.length - 1);
            for(char c:s){
                System.out.println(c);
            }
           }
//swaping character from Array
        public static void check(char[] s, int left, int right) {
            if (left >= right) {
                return;
            }
            //Swapping the character from array
            s[left] = (char) (s[left] ^ s[right]);

            s[right] = (char) (s[left] ^ s[right]);

            s[left] = (char) (s[left] ^ s[right]);

            check(s, left + 1, right - 1);
        }

    public static void  main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Size");
       int n=sc.nextInt();
       char[] inp=new char[n];
        inp=sc.next().toCharArray();
          System.out.println("1");
            reverseString(inp);

    }
}
