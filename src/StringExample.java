public class StringExample {
    public static void main(String args[]){
        String s1="java";//creating string by Java string literal
        char ch[]={'s','t','r','i','n','g','s'};
        String s2=new String(ch);//converting char array to string
        String s3=new String("example");//creating Java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // iteration in String

        String s4 = "java";

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            System.out.println(c);
        }

        for (char c : s1.toCharArray()) {
            System.out.println(c);
        }

        s1.chars().forEach(ch -> System.out.println((char) ch));
        
    }
}
