import java.util.Scanner;

public class Cities {
    public int longitude;
    public int altitude;

    static Void berlin2;



    public Cities(int altitude, int longitude) {
        this.altitude = altitude;
        this.longitude = longitude;
    }

    public static void main(String[] args) {
        Cities munich = new Cities(1000, 3000);
        Cities berlin = new Cities(2000, 1000);
        Cities hamburg = new Cities(500, 500);

        System.out.println(munich.altitude);


        {
            System.out.println("Which city do you live in?");

            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();

            switch (answer.toLowerCase()) {

                case "munich":
                    System.out.println("Where do you want to move? berlin or hamburg?");
                    String berlin2 = input.nextLine();
                    System.out.println(berlin2);
                    while (berlin2.startsWith("b")){
                        int measure = munich.altitude- berlin.altitude;
                        int measure2 = munich.longitude - berlin.longitude;
                        double pyt = Math.pow(measure, 2) + Math.pow(measure2, 2);
                        double pyt2 = Math.sqrt(pyt);
                        System.out.println(pyt2);
                    }

                    break;

                case "berlin":
                    System.out.println("Where do you want to move?");
                    berlin2 = input.nextLine();
                    System.out.println(berlin2);
                    break;

                case "hamburg":
                    System.out.println("Where do you want to move?");
                    berlin2 = input.nextLine();
                    System.out.println(berlin2);
                    break;


            }

System.out.println(berlin2);

        }
    }
}