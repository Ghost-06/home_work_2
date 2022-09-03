public class Main {
    public static void main(String[] args) {
        System.out.println(program(27 , -12));
        System.out.println(program(45 , 0));
        System.out.println(program(65 , -20));
        System.out.println(program(2 , -18));
        System.out.println(program(20 , -1));
        System.out.println(program(generateRandomAge(),20));
    }
    public static String program(int age , int temp){
        String home="Можно иди гулять";
        String home1="Остовайтесь дома";
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 35){
            return home;
        }
        else if (age < 20 && temp >= 0 && temp <= 28){
            return home;
        }
        else if (age > 45 && temp >= -10 && temp <= 25){
            return home1;
        }
        else {
            return home1;
        }
    }
    public static int generateRandomAge(){
        int age=0+(int)(Math.random()*100);
        return age;
    }
}