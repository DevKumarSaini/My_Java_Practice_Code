package Classes_And_Objects;

import org.w3c.dom.ls.LSOutput;

public class Test
{
    public int aMethod()
    {
         int i = 0;
        i++;
        return i;
    }
    public static void main(String args[])
    {
        Test test = new Test();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);

int counter=0;
//        for (int x = 6; x>counter; x--, ++counter) /* Line 14 */
//        {
//            System.out.print(" " + counter);
//        }

        for (int i = 0; i < 4; i += 2)
        {
            System.out.println(i + " ");
        }

        interface goodu{ // interface in the class
            void haldi();
            void chandan();
        }

        int x= 0;
        int y= 0;
        for (int z = 0; z < 5; z++)
        {
            if (( ++x > 2 ) && (++y > 2))
            {
                x++;
            }
            System.out.println("iterate ->"+z+" "+x + " " + y);
        }

    }
}
