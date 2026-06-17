import java.util.Scanner;

public class miniproject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of followers: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] followers = new String[n];
        int[] likes = new int[n];

        // Input Followers
        for (int i = 0; i < n; i++) {

            System.out.print("Enter follower name: ");
            followers[i] = sc.nextLine();

            System.out.print("Enter likes given by " + followers[i] + ": ");
            likes[i] = sc.nextInt();
            sc.nextLine();
        }

        // Search Follower
        System.out.print("\nEnter follower name to search: ");
        String searchName = sc.nextLine();

        int searchIndex = -1;

        for (int i = 0; i < n; i++) {

            if (followers[i].equalsIgnoreCase(searchName)) {
                searchIndex = i;
                break;
            }
        }

        if (searchIndex != -1) {
            System.out.println("\nFollower Found!");
            System.out.println("Index: " + searchIndex);
            System.out.println("Likes: " + likes[searchIndex]);
        } else {
            System.out.println("\nFollower Not Found!");
        }

        // Minimum Likes Criteria
        System.out.print("\nEnter minimum likes required: ");
        int minLikes = sc.nextInt();

        int ambassadorIndex = -1;
        int backupIndex = -1;

        // Find Ambassador
        for (int i = 0; i < n; i++) {

            if (likes[i] >= minLikes) {

                if (ambassadorIndex == -1 ||
                        likes[i] > likes[ambassadorIndex]) {

                    backupIndex = ambassadorIndex;
                    ambassadorIndex = i;
                }

                else if (backupIndex == -1 ||
                        likes[i] > likes[backupIndex]) {

                    backupIndex = i;
                }
            }
        }

        // Results
        System.out.println("\n========== RESULTS ==========");

        if (ambassadorIndex == -1) {

            System.out.println("No eligible followers found!");

        } else {

            System.out.println("\n🏆 Brand Ambassador:");
            System.out.println(
                    followers[ambassadorIndex]
                            + " (" + likes[ambassadorIndex] + " likes)"
            );

            if (backupIndex != -1) {

                System.out.println("\n🥈 Backup Ambassador:");
                System.out.println(
                        followers[backupIndex]
                                + " (" + likes[backupIndex] + " likes)"
                );
            }

            System.out.println("\nEligible Followers:");

            for (int i = 0; i < n; i++) {

                if (likes[i] >= minLikes) {

                    System.out.println(
                            followers[i]
                                    + " - "
                                    + likes[i]
                                    + " likes"
                    );
                }
            }
        }

        sc.close();
    }
}