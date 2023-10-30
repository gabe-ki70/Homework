public class MadLib {


    public static void main(String[] args) {
       new MadLib();
    }

    public MadLib(){
        System.out.println("hello world");
        String classmate = "Teddy";
        String city = "New York";
        String noun = "phone";
        String adjective = "cold";
        String pluralNoun = "apples";
        String pluralAnimal = "tigers";
        boolean trueOrFalse = true;
        double decimalBiggerThan1 = 2.5;
        int number1 = 8;
        int number2 = 15;
        int wholeNumberBetween1And4 = 2;
        String miltonTeacher = "Mx. Bradford";
        String miltonDean = "Mr. Ruiz";
        char letterGrade = 'A';
        String season = "winter";

        //define a string called story for mad lib
        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class.";

//now print story to the dos window
        System.out.println(story);

    }
}
