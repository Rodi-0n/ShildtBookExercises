public class ifTest1 {
        public static void main(String[] args){
            int a, b, c;
            a = 2;
            b = 3;
            if(a < b) System.out.println("a is less than b");
            if(a == b) System.out.println("a equal b");
            System.out.println();
            c = a - b; // c = -1
            System.out.println("c contains -1");
            if (c >= 0) System.out.println("c is positive number");
            if (c < 0) System.out.println("c is negative number");
            System.out.println();
            c = b - a; // c = 1

            System.out.println ("c contains 1") ;
            if (c >= 0) System.out.println("c is positive number");
            if (c < 0) System.out.println("c is negative number");
        }
    }

