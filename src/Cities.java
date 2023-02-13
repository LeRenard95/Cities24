import java.util.Scanner;

public class Cities {
public int longitude;
public int altitude;


public Cities (int altitude, int longitude){
    this.altitude = altitude;
    this.longitude = longitude;
}

    public static void main(String[] args) {
Cities munich = new Cities(1000, 3000);
Cities berlin = new Cities(2000, 1000);
Cities hamburg = new Cities(500, 500);

System.out.println(munich.altitude);




        {
            Scanner input = new Scanner(System.in);

            System.out.println("Which city do you live in?");

            String answer = input.nextLine();

            if (!answer.equals("munich")){
                System.out.println("Which city do you want to travel to? (berlin, hamburg)");

                answer = input.nextLine();
                if (!answer.equals("berlin")) {
                }
            }
        }


System.out.println("Where do you want to go?");
    }
}