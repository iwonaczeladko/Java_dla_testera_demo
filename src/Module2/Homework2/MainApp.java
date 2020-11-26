package Module2.Homework2;

public class MainApp {

    public static void main(String[] args) {

        Bug bug = new Bug("Page not found", "aneta@nowak.com", 1);

        bug.displayAllInfo();
        bug.displayReportingUser();
        bug.displayBugStatusText();
        System.out.println(bug.priorityNumber);
        System.out.println(bug.getPriorityText());
        System.out.println("\n");

        bug.isBugStatusOpen = false;
        System.out.println(bug.isBugStatusOpen);
        bug.displayBugStatusText();
        bug.displayAllInfo();
        System.out.println("\n");

        bug.priorityNumber = 2;
        System.out.println(bug.priorityNumber);
        System.out.println(bug.getPriorityText());
        bug.isBugStatusOpen = true;
        bug.displayAllInfo();
    }
}
