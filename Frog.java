import java.util.Scanner;
class Frog
{
    public static void main(String... args){
        float totalHeight;
        float moveForward;
        float moveBackward;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide total height : ");
        totalHeight = scanner.nextFloat();
        System.out.println("Please provide move forward : ");
        moveForward = scanner.nextFloat();
        System.out.println("Please provide move backward : ");
        moveBackward = scanner.nextFloat();
        int totalDays = 0;
        float distanceCovered = 0;
        while(true)
        {
            distanceCovered = distanceCovered + moveForward;
            totalDays++;
            if(distanceCovered >= totalHeight)
                break;
            distanceCovered = distanceCovered - moveBackward;
        }
        System.out.println(" Total Days taken : " + totalDays); 
    }
}

