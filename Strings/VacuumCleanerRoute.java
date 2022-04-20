/* Given a string representing the sequence of moves a robot vacuum makes,
return whether it will return to its original position.
The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively. */
public class VacuumCleanerRoute {
    public static void main(String[] args) {
        // "LR", returns true
        // "URURD", returns false
        // "RUULLDRD", returns true
        System.out.println(vacuumReturnsToStart("RUULLDRD"));
    }

    public static boolean vacuumReturnsToStart(String moves) {
        int UD = 0;
        int LR = 0;
        for (int i = 0; i < moves.length(); i++) {
            char current = moves.charAt(i);
            if (current == 'U') {
                UD++;
            } else if (current == 'D') {
                UD--;
            } else if (current == 'L') {
                LR++;
            } else if (current == 'R') {
                LR--;
            }
        }

        return UD == 0 && LR == 0;
    }
}
