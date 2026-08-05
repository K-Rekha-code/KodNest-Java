public class Practise2 {
    public static void main(String[] args) {
        int roundCode = 4;
        int attemptsUsed = 2;
        int maxAttempts = 3;
        
        String roundName;
        
        // Select the round using switch with fall-through for 4 and 5
        switch (roundCode) {
            case 1:
                roundName = "Aptitude Round";
                break;
            case 2:
                roundName = "Technical Round";
                break;
            case 3:
                roundName = "HR Round";
                break;
            case 4:
            case 5:
                roundName = "Final Review";
                break;
            default:
                roundName = "Invalid Round";
                break;
        }

        // Store attempt status using a ternary expression
        String attemptStatus = (attemptsUsed < maxAttempts) ? "Attempt Available" : "Attempt Limit Reached";

        // Print outputs matching exact expected format
        System.out.println("Current Round: " + roundName);
        System.out.println("Attempt Status: " + attemptStatus);
    }
}