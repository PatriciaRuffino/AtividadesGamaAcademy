package replace;



public class Replace {


    public static void main(String[] args) {
        // str for "BOB loves-coding", seu programa deve retornar bobLovesCoding
        String s = "bOB loves-coding";
        s =s.toLowerCase();
        s = s.replace("-", " ");


        System.out.println(s);
        int n=s.length();
        char ch[] = s.toCharArray();
        int ctr = 0;
        int c = 0;




        for ( int i =0; i < n; i ++){

            if (i==0)
                ch[i] = Character.toLowerCase(ch[i]);

                if(ch[i] == ' ' ){
                    ctr++;

                    ch[i+1]= Character.toUpperCase(ch[i+1]);
                    continue;
                }else{
                    ch[c++] = ch[i];
                }
           s = String.valueOf(ch, 0, n-ctr);


            }


        System.out.println(s);
        }


}

