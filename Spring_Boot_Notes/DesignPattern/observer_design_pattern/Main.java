import java.io.*;

public class Main {
    public static void main(String[] args) {
        Subject channel = new YoutubeChannel();

        Observer aman = new Subscriber("Aman");
        Observer raman = new Subscriber("Raman");

        channel.subscribe(aman);
        channel.subscribe(raman);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Upload a new video");
            System.out.println("2. Add a new subscriber");
            System.out.println("3. Exit");

            try {
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(br.readLine());

                switch (choice) {
                    case 1:
                        System.out.print("Enter video title: ");
                        String videoTitle = br.readLine();
                        channel.newVideoUploaded(videoTitle);
                        break;

                    case 2:
                        System.out.print("Enter the name of the subscriber: ");
                        String subsName = br.readLine();
                        Observer newSubscriber = new Subscriber(subsName);
                        channel.subscribe(newSubscriber);
                        break;

                    case 3:
                        System.out.println("Thank you for using the app!");
                        return;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            } catch (IOException e) {
                System.out.println("An error occurred while reading input. Please try again.");
            }
        }
    }
}
