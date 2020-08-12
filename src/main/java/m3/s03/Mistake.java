package m3.s03;

public class NoExc {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        try {
            System.out.println(increment(Integer.MAX_VALUE));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        int y = 3;
        
        // ...
        
        try {
            y = increment(Integer.MAX_VALUE);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // ...
        
        System.out.println(y);
    }

    /**
     * 
     * @param x
     * @return
     */
    static int increment(int x) throws Exception {
        if(x == Integer.MAX_VALUE) {
            throw new Exception();
        }
        return x + 1;
    }
}
