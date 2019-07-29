import java.util.*;

class Base64{

     private static Map<Character,Integer> base64codes = new HashMap<>(128);
         
         static{
                     base64codes.put('A',0);base64codes.put('B',1);base64codes.put('C',2);base64codes.put('D',3);base64codes.put('E',4);base64codes.put('F',5);
                             base64codes.put('G',6);base64codes.put('H',7);base64codes.put('I',8);base64codes.put('J',9);base64codes.put('K',10);base64codes.put('L',11);
                                     base64codes.put('M',12);base64codes.put('N',13);base64codes.put('O',14);base64codes.put('P',15);base64codes.put('Q',16);base64codes.put('R',17);
                                             base64codes.put('S',18);base64codes.put('T',19);base64codes.put('U',20);base64codes.put('V',21);base64codes.put('W',22);base64codes.put('X',23);
                                                     base64codes.put('Y',24);base64codes.put('Z',25);base64codes.put('a',26);base64codes.put('b',27);base64codes.put('c',28);base64codes.put('d',29);
                                                             base64codes.put('e',30);base64codes.put('f',31);base64codes.put('g',32);base64codes.put('h',33);base64codes.put('i',34);base64codes.put('j',35);
                                                                     base64codes.put('k',36);base64codes.put('l',37);base64codes.put('m',38);base64codes.put('n',39);base64codes.put('o',40);base64codes.put('p',41);
                                                                             base64codes.put('q',42);base64codes.put('r',43);base64codes.put('s',44);base64codes.put('t',45);base64codes.put('u',46);base64codes.put('v',47);
                                                                                     base64codes.put('w',48);base64codes.put('x',49);base64codes.put('y',50);base64codes.put('z',51);base64codes.put('0',52);base64codes.put('1',53);
                                                                                             base64codes.put('2',54);base64codes.put('3',55);base64codes.put('4',56);base64codes.put('5',57);base64codes.put('6',58);base64codes.put('7',59);
                                                                                                     base64codes.put('8',60);base64codes.put('9',61);base64codes.put('+',62);base64codes.put('/',63);
                                                                                                         }


    public static void main(String... args){
        String s = "QnbeXpLaPebaX";
        char[] arr = s.toCharArray();
        int sum = 0;
        for(char c : arr)
        {
            System.out.println(base64codes.get(c));
            sum += base64codes.get(c);
            if(sum > 63)
               sum = sum^63 + 1;
        }
        System.out.println(sum);
    }
}

