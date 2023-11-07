public class Conditionals {
    public static void main(String[] args){
        new Conditionals();
    }

    public Conditionals(){

        String question = "Do you like pizza?";
        System.out.println(question);
        int randomInt = (int)(Math.random() * 11);

        if (randomInt == 1){
            System.out.println("It is certain");
        }
        else if (randomInt == 2){
            System.out.println("Without a doubt");
        }
        else if (randomInt == 3){
            System.out.println("My reply is no");
        }
        else if (randomInt == 4){
            System.out.println("My sources say no");
        }
        else if (randomInt == 5){
            System.out.println("Very doubtful");
        }
        else if (randomInt == 6){
            System.out.println("As I see it, yes");
        }
        else{
            System.out.println("Better not tell you now");
        }
    }
}
