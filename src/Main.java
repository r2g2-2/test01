import java.util.*;
class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //לבקש תעודת זהות לקופץ 1
        System.out.println("pleas enter id first jumper");
        int id1 = input.nextInt();
        //ליצור אובייקט קופץ 1
        Jumper jumper1= new Jumper(id1);
        //מצא את הקפיצה הגבוהה של קופץ 1
        jumper1.findBestJump();
        //לבקש תעודת זהות לקופץ 2
        System.out.println("pleas enter id second jumper");
        int id2 = input.nextInt();
        //ליצור אובייקט קופץ 2
        Jumper jumper2= new Jumper(id2);
        //מצא את הקפיצה הגבוהה של קופץ 2
        jumper2.findBestJump();
        //משווים בין הקפיצות הגבוהות
        //הצבה במשתנה את תעודת הזהות של הקפיצה הגבוהה יותר
        int winnerId = jumper1.compareBestJump(jumper2);
        //הדפסת תעודת הזהות של המנצח
        System.out.println(winnerId);
        //קלוט גובה עובר
        System.out.println("pleas enter min height");
        double height = input.nextDouble();
        //לבדוק אם 2 הקופצים עברו את הגובה

        boolean passJumper1=jumper1.passHeight(height);
        boolean passJumper2=jumper2.passHeight(height);
        if (passJumper2&&passJumper1)
        {
            //הדפס אמת אם 2 הקופציפ עברו
            System.out.println("PASS");
        }



    }
}