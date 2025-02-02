public class MyClass {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                // Handle the condition; continue loop or break as appropriate
                System.out.println("Condition met at i = 5");
            }
        }
        System.out.println("Loop finished");
    }
}

//Alternative Solution
public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        boolean shouldContinue = true;
        while (i < 10 && shouldContinue) {
            System.out.println(i++);
            if (i == 5) {
                shouldContinue = false; // More readable
            }
        }
        System.out.println("Loop finished");
    }
}