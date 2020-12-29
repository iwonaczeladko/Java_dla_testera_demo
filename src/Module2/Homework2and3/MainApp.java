package Module2.Homework2and3;

import Module2.Homework2and3.model.Bug;

public class MainApp {

    public static void main(String[] args) {

        Bug bug = new Bug("Page not found", "aneta@nowak.com", 1);

        bug.displayAllInfo();
        bug.displayReportingUser();
        bug.displayBugStatusText();
        System.out.println(bug.getPriorityNumber());
        System.out.println(bug.getPriorityText());
        System.out.println("\n");

        bug.setBugDescription("    None    ");
        System.out.println(bug.getBugDescription());
        bug.setUserEmail("alicja_kowalska.com");
        System.out.println(bug.getUserEmail());
        bug.displayReportingUser();
        bug.setPriorityNumber(0);
        System.out.println(bug.getPriorityText());
        bug.displayAllInfo();
        System.out.println("\n");

        bug.setBugStatusOpen(false);
        System.out.println(bug.isBugStatusOpen());
        bug.displayBugStatusText();
        bug.setBugDescription("Checkbox doesn't works");
        bug.setUserEmail("tomek@kot.com");
        bug.displayAllInfo();
        System.out.println("\n");

        bug.setPriorityNumber(2);
        System.out.println(bug.getPriorityNumber());
        System.out.println(bug.getPriorityText());
        bug.setBugStatusOpen(true);
        bug.displayAllInfo();
    }
}
