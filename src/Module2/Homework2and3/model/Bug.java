package Module2.Homework2and3.model;

public class Bug {

    private String bugDescription;
    private String userEmail;
    private int priorityNumber;
    private boolean isBugStatusOpen;
    private String priorityText;

    public Bug(String bugDescription, String userEmail, int priorityNumber) {
        this.bugDescription = bugDescription;
        this.userEmail = userEmail;
        this.priorityNumber = priorityNumber;
        isBugStatusOpen = true;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        String strip = bugDescription.strip();
        if (strip.length() < 10) {
            System.out.println("Bug description has less than 10 signs");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        if (userEmail.contains("@")) {
            this.userEmail = userEmail;
        } else {
            System.out.println("Email incorrect - doesn't contain @");
        }
    }

    public int getPriorityNumber() {
        return priorityNumber;
    }

    public void setPriorityNumber(int priorityNumber) {
        if (priorityNumber >= 1 && priorityNumber <= 5) {
            this.priorityNumber = priorityNumber;
        } else {
            System.out.println("Priority is incorrect");
        }
    }

    public boolean isBugStatusOpen() {
        return isBugStatusOpen;
    }

    public void setBugStatusOpen(boolean bugStatusOpen) {
        isBugStatusOpen = bugStatusOpen;
    }

    public String getBugStatusText() {
        if (isBugStatusOpen) {
            return "Opened";
        } else {
            return "Closed";
        }
    }

    public void displayAllInfo() {
        System.out.println("Bug description: " + bugDescription + "\n" + "Reported by: " + userEmail + "\n" +
                "Priority: " + getPriorityText() + "\n" + "Status of bug: " + getBugStatusText());
    }

    public void displayReportingUser() {
        System.out.println("Bug reported by user: " + userEmail);
    }

    public void displayBugStatusText() {
        System.out.println("Bug status: " + getBugStatusText());
    }

    public String getPriorityText() {
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
        }
        return priorityText;
    }
}
