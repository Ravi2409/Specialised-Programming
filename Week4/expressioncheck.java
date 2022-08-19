import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Given a string expression of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators. You may return the answer in any order
public class expressioncheck{
        public static List<Integer> Compute(String exp) {
            List<Integer> list = new ArrayList<>();

            for(int i=0;i<exp.length();i++)
            {
                char ch = exp.charAt(i);
                if(ch == '-' || ch == '+' || ch == '*')
                {
                    List<Integer> left = Compute(exp.substring(0,i));
                    List<Integer> right = Compute(exp.substring(i+1));
                    for(int k : left)
                    {for(int j : right)
                        {
                            if(ch == '+')
                                list.add(k+j);
                            else if(ch == '-')
                                list.add(k-j);
                            else list.add(k*j);}}
                }
            }
            for(int i=0;i< list.size();i++){
                System.out.println(list.get(i));
            }

            if(list.size() == 0)
                list.add(Integer.valueOf(exp));
            return list;
        }
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the input expression");
            //String input= sc.nextLine();
            Compute("2-1-1");
        }
    }

