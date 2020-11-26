package Module2.Homework2;

public class Bug {

    String bugDescription;
    String userEmail;
    int priorityNumber;
    boolean isBugStatusOpen;

    Bug(String bugDescription, String userEmail, int priorityNumber) {
        this.bugDescription = bugDescription;
        this.userEmail = userEmail;
        this.priorityNumber = priorityNumber;
        isBugStatusOpen = true;
    }

    String getBugStatusText() {
        if (isBugStatusOpen) {
            return "Opened";
        } else {
            return "Closed";
        }
    }

    void displayAllInfo() {
        System.out.println("Bug description: " + bugDescription + "\n" + "Reported by: " + userEmail + "\n" +
                "Priority: " + getPriorityText() + "\n" + "Status of bug: " + getBugStatusText());
    }

    void displayReportingUser() {
        System.out.println("Bug reported by user: " + userEmail);
    }

    void displayBugStatusText() {
        System.out.println("Bug status: " + getBugStatusText());
    }

    String getPriorityText() {
        String priorityText;
        switch (priorityNumber) {
            case 1:
                priorityText = "Blocker";
                break;
            case 2:
                priorityText = "Critical";
                break;
            case 3:
                priorityText = "Major";
                break;
            case 4:
                priorityText = "Normal";
                break;
            case 5:
                priorityText = "Minor";
                break;
            default:
                priorityText = "There is no such priority";
        }
        return priorityText;
    }
}
