import java.util.*;

public class ToDoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Task 2. View Tasks 3. Delete Task 4. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = sc.nextLine();
                tasks.add(task);
            } else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks.");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }
            } else if (choice == 3) {
                System.out.print("Enter task number to delete: ");
                int index = sc.nextInt();
                if (index > 0 && index <= tasks.size()) {
                    tasks.remove(index - 1);
                    System.out.println("Task removed.");
                } else {
                    System.out.println("Invalid task number.");
                }
            } else {
                break;
            }
        }
        sc.close();
    }
}