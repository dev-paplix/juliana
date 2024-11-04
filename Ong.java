public class Ong {
    public static void main(String[] args){
        double math = 90.5;
        double science = 80;
        double literature = 78.30;

        boolean exemption = false;

        double average = (math + science + literature) / 3;
        String sentence = "average : ";
            if (average >= 80 || exemption == true){
                System.out.println(sentence + average + " And You Are Passed");
                
            }
            else {
                System.out.println(sentence + average + " You Fail");
        }


    }
}
