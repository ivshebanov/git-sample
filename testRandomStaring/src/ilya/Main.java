package ilya;

public class Main {

    public static void main(String[] args) {
//        String numbers = "0123456789";
//
//        ArrayList<String> alphaNum = new ArrayList<String>();
//
//        for (char c = 'A';c<= 'z';c++){
//            String s = new String();
//            s +=c;
//            alphaNum.add(s);
//            //Исключаем лишние символы ( ],[,...)
//            if (c == 'Z') c = 'a'-1;
//        }
//
//        for (int c = 0;c<10;c++){
//            String s = new String();
//            s +=c;
//            alphaNum.add(s);
//        }
//
//        //Вывод случайного элемента из этого массива
//        System.out.println((int)(Math.random()*alphaNum.size())+10);
//        System.out.println(alphaNum);
        String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randString = new StringBuilder();
        int count = (int) (Math.random() * 30);
        for (int i = 0; i < count; i++)
            randString.append(letters.charAt((int) (Math.random() * letters.length())));

        System.out.println(randString);
    }
}
