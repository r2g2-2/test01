import java.util.*;
public class Jumper {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private double bestJumpHeight;

    public void findBestJump() {
    // הגדרת משתנה לקפיצה
    double num;
    Scanner input = new Scanner(System.in);
    // פתיחת לולאה שועברת על כל קפיצה
    for (int i=1; i<=5; i++) {
        // קליטת גובה הקפיצה
        System.out.println("enter jump");
        num = input.nextDouble();
        // משווים את הקפיצה למשתה המקסימלי ואם הקפיצה יותר גדולה אז המשתנה הופך לקפיצה
        if (num>this.bestJumpHeight) {
            this.bestJumpHeight = num;
            }
        }
    }

    public int compareBestJump(Jumper jumper2)
    {
        // אם גובה הקפיצה של קופץ 1 יותר גבוה תחזיר את המספר של קופץ 1
        if (this.bestJumpHeight>jumper2.bestJumpHeight)
        {
            return this.id;
        }
        // אם גובה הקפיצה של קופץ 2 יותר גבוה תחזיר את המספר של קופץ 2
        else
        {
            return jumper2.id;
        }
    }
    public Jumper(int id)
    {
        this.id=id;
    }
    // פעולה בוליאנית שמחזירה אמת אם הקופץ הצליח לעבור את הגובה שהוגדר
    public boolean passHeight(double height)
    {
       //בודקים אם הקפיצה הכי גבוהה של הקופץ יותר גבוהה מהגובה שנקלט
       return (this.bestJumpHeight>height);
    }
}
