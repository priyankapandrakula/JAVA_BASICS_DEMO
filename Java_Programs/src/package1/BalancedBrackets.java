package package1;

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        int t=0,i;
        Stack <Character> stk=new Stack <Character>();
        for( i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('|| s.charAt(i)=='{'|| s.charAt(i)=='[')
            {
                stk.push(s.charAt(i));
            }
            else if(stk.empty())
            {
                t=1;
                    break;
            }
            else
            {
                Character a1=new Character(stk.pop());
                //System.out.println(a1);
                if(a1=='(' && s.charAt(i)==')')
                continue;
                else if(a1=='{' && s.charAt(i)=='}')
                continue;
                else if(a1=='[' && s.charAt(i)==']')
                continue;
                
                else
                {
                    t=1;
                    break;
                }
            }
        }
        if(t==0 && stk.empty())
            return true;
        else
            return false;
        
    }
}
public class BalancedBrackets
{
	public static void main(String[] args) {
		String a="[()]";
		Solution s=new Solution();
		System.out.println(s.isValid(a));
	}
}