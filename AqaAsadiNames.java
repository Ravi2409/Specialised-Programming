//
//  File Name: AqaAsadiNames.java
//  Program: Masters of Computer Science
//  Course: Specalised Programming
//  Problem URL: https://community.topcoder.com/stat?c=problem_statement&pm=16195&rd=17994
//  Test Case URL: https://community.topcoder.com/tc?module=ProblemDetail&rd=17994&pm=16195
//  Test Cases Passes: 20 / 20
//
//  Created by Ravi Trivedi on 12/8/2022.
//
/*
Problem Statement for AqaAsadiNames


Problem Statement

This problem is about a traditional way of naming the second child in a family. Aqa Asadi wants to name his second child this way.

All people in this problem have exactly two names, e.g., ?Yasaman Sadat? or ?Mohammad Reza?. In this problem, we will assume that the people whose first name starts with a vowel are female and all other people are male. Note that in this problem the letter Y is considered a vowel (so the vowels are A, E, I, O, U, and Y).

You are given the Strings Dad, Mom and FirstChild: the names of a dad, a mom, and their first child. You are also given the String Gender: the gender of their second child (either "Boy" or "Girl"). Your task is to determine and return the name for the second child according to the rules given below.

If the gender of the first child differs from the second child, the second child will use both names of their parent with the same gender, in reversed order.
If both children have the same gender, the second child will get its first name from the parent with the same gender as itself (i.e., girls from their mom, boys from their dad) and its second name from its older sibling.

Definition

Class:	AqaAsadiNames
Method:	getName
Parameters:	String, String, String, String
Returns:	String
Method signature:	String getName(String Dad, String Mom, String FirstChild, String Gender)
(be sure your method is public)


Notes
-	You should always follow the rules in the problem statement, even if the name they produce does not match the child's gender (see Example #1) or produces the same name as the first child had (see Example #4).

Constraints
-	Each name (Dad, Mom, FirstChild) will contain at most 20 characters.
-	Each name will have the form "First Second", with exactly one space and with exactly the first letter of each name in uppercase.
-	Each name will only consist of uppercase and lowercase English letters (A-Z, a-z), and the single space between the two names.
-	Dad will start with a consonant and Mom will start with a vowel (AEIOUY).
-	Gender will be either "Boy" or "Girl".

Examples
0)

"Mohammad Reza"
"Yasaman Sadat"
"Baqer Ali"
"Boy"
Returns: "Mohammad Ali"
Both children are boys, so the second child gets his first name ("Mohammad") from his father and his second name ("Ali") from his brother.
1)

"Mohammad Reza"
"Yasaman Sadat"
"Baqer Ali"
"Girl"
Returns: "Sadat Yasaman"
The children have different genders. Thus, the second child's name is obtained by swapping her mother's two names.

Note that the returned name is not a proper name for a girl, but that's what the rules produced, so that's what you should return.

2)

"Mohammad Reza"
"Yasaman Sadat"
"Umi Kulsum"
"Girl"
Returns: "Yasaman Kulsum"
A case similar to Example #0, but this time the child gets her name by combining the names of her mother and her sister.
3)

"Mohammad Reza"
"Yasaman Sadat"
"Umi Kulsum"
"Boy"
Returns: "Reza Mohammad"
4)

"Mohammad Ali"
"Yasaman Sadat"
"Mohammad Reza"
"Boy"
Returns: "Mohammad Reza"
5)

"Dhikrullah Ali"
"Umi Kulsum"
"Reza Hosseinzadeh"
"Boy"
Returns: "Dhikrullah Hosseinzadeh"
Note that the second child's name can sometimes have more than 20 characters.

Note that the second child's name can sometimes have more than 20 characters.
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2010, TopCoder, Inc. All rights reserved.

This problem was used for:
       Single Round Match 787 Round 1 - Division II, Level One

 ----------------------------------------------------
 Output

 Result of 00th test: Passed
 Result of 01th test: Passed
 Result of 02th test: Passed
 Result of 03th test: Passed
 Result of 04th test: Passed
 Result of 05th test: Passed
 Result of 06th test: Passed
 Result of 07th test: Passed
 Result of 08th test: Passed
 Result of 09th test: Passed
 Result of 10th test: Passed
 Result of 11th test: Passed
 Result of 12th test: Passed
 Result of 13th test: Passed
 Result of 14th test: Passed
 Result of 15th test: Passed
 Result of 16th test: Passed
 Result of 17th test: Passed
 Result of 18th test: Passed
 Result of 19th test: Passed
 Total Failed Test Cases: 0
 Program ended with exit code: 0

 */

import java.util.List;

public class AqaAsadiNames
{
    public static String getName(String dad, String mom, String First_child, String Gender)
    {
        String firstname="",secondname="";
        char t = First_child.charAt(0);
        boolean flag = (t == 'A' || t == 'E' || t == 'I' || t=='O'|| t=='U' || t=='Y' );
        if(Gender.equalsIgnoreCase("boy"))
        {
            if (flag)
            {
                firstname=(dad.split(" ", 2)[1]);
                secondname=(dad.split(" ", 2)[0]);
            }
            else
            {
                firstname=(dad.split(" ", 2)[0]);
                secondname=(First_child.split(" ",2)[1]);
            }
        } else
        {
            if(flag)
            {
                firstname=(mom.split(" ",2)[0]);
                secondname=(First_child.split(" ",2)[1]) ;
            }
            else
            {
                firstname=(mom.split(" ",2)[1]);
                secondname=(mom.split(" ",2)[0]) ;
            }
        }
        return firstname+" "+secondname;
    }

    public static void main(String[] args) {
        List<List<String>> testCase = List.of(
                List.of("Mohammad Reza", "Yasaman Sadat", "Baqer Ali", "Boy", "Mohammad Ali"),
                List.of("Mohammad Reza", "Yasaman Sadat", "Baqer Ali", "Girl", "Sadat Yasaman"),
                List.of("Mohammad Reza", "Yasaman Sadat", "Umi Kulsum", "Girl", "Yasaman Kulsum"),
                List.of("Mohammad Reza", "Yasaman Sadat", "Umi Kulsum", "Boy", "Reza Mohammad"),
                List.of("X Y", "Y X", "P T", "Girl", "X Y"),
                List.of("Mohammad Ali", "Yasaman Sadat", "Mohammad Reza", "Boy", "Mohammad Reza"),
                List.of("Dhikrullah Ali", "Umi Kulsum", "Reza Hosseinzadeh", "Boy", "Dhikrullah Hosseinzadeh"),
                List.of("Safar Ali", "O B", "Safar Ali", "Boy", "Safar Ali"),
                List.of("Safar Ali", "O B", "Safar Ali", "Girl", "B O"),
                List.of("B O", "O B", "B B", "Boy", "B B"),
                List.of("B O", "O B", "B B", "Girl", "B O"),
                List.of("Tz Ts", "Agciotaepr Xbrfqueds", "Owjclyhwk Nrmeguvn", "Boy", "Ts Tz"),
                List.of("Snu Dggmy", "Yhrbmf T", "Zb Hgojdtfnzxjkayjl", "Girl", "T Yhrbmf"),
                List.of("R Z", "Opkdmelxiyj Ro", "Ikpmmvaxqcpti Wt", "Boy", "Z R"),
                List.of("Wmybi Q", "Aoxkyvgdiup Dyamxty", "Q Gogfkgghvubr", "Girl", "Dyamxty Aoxkyvgdiup"),
                List.of("Lyymvhdtbqyax B", "Iaykusy Vdgccw", "Orckf Fn", "Boy", "B Lyymvhdtbqyax"),
                List.of("Mkbxiahaosfy Clumgn", "Oljumpl Xknibx", "Ef Hkygdkqosshpeg", "Girl", "Oljumpl Hkygdkqosshpeg"),
                List.of("Xychyqng Atnv", "A Quom", "Ps Twkmmodbdno", "Girl", "Quom A"),
                List.of("Vkfulhr Nottvnhrn", "Y Hewgregyqkgqxc", "Jasx Xyvpbtldzm", "Girl", "Hewgregyqkgqxc Y"),
                List.of("N X", "Iucts Rdbed", "Zptpno Hlwdu", "Girl", "Rdbed Iucts"));
        int count = 0;
        for (int i = 0; i < testCase.size(); i++) {
            String answer = getName(testCase.get(i).get(0), testCase.get(i).get(1), testCase.get(i).get(2), testCase.get(i).get(3));
            if (answer.equalsIgnoreCase(testCase.get(i).get(4)))
                System.out.println("Result of " + i + "th testcase:Passed");
            else {
                System.out.println("Failed");
                count = 0;
                System.out.println("Input: " + testCase.get(i).get(0) + ", " + testCase.get(i).get(1) + ", " + testCase.get(i).get(2) + ", " + testCase.get(i).get(3) + ", " + testCase.get(i).get(4));
                System.out.println("answer: " + answer);
                count++;
            }
        }
        System.out.println("Number of failed taste cases:" + count);
    }
}
