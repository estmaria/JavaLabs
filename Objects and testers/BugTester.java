public class BugTester 
{
    public static void main(String[] args)
    {
        Bug ladyBird = new Bug();
        ladyBird.moveOneUnit();
        ladyBird.moveOneUnit();
        ladyBird.moveOneUnit();
        ladyBird.turnRight();
        ladyBird.moveOneUnit();
        ladyBird.moveOneUnit();

        ladyBird.getRow();
        ladyBird.getColumn();

    }
}
