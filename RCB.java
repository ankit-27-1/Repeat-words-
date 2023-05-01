import java.io.*;
public class ques1{
    public static void main(String[] args)
    {
        String os="R";
        String ps="C";
        String ts="B";

        for(int i=0;i<4;i++)
        {

            System.out.print(os.repeat(i));
            System.out.print(ps.repeat(i));
            System.out.print(ts.repeat(i));
            System.out.println();
        }
    }
}
