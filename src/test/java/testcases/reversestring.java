package testcases;

public class reversestring {
    public static void main(String[] args) {
        String s="hello";
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        if(s1.equals(s))
        {
            System.out.println("It is palindrome "+s1);
        }
        else{
            System.out.println("It is not palindrome "+s1);
        }
    }
}
