import java.util.Scanner;

public class SpotifyApp 
{

    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Spotify Music App");
        System.out.println("Select a Music Director:");
        System.out.println("1: A R Rahman");
        System.out.println("2: Anirudh");
        System.out.println("3: Yuvan Shankar Raja");
        System.out.print("Enter your choice: ");

        int Choice = sc.nextInt();

        switch (Choice)
		{
            case 1:
                System.out.println(" A R Rahman Hits ");
                System.out.println("Select Music Type:");
                System.out.println("1: Melody");
                System.out.println("2: Folk");
                System.out.print("Enter your choice: ");
                int arrType = sc.nextInt();

                
                if (arrType == 1) 
				{ 
                    System.out.println("Select a Song:");
                    System.out.println("1: Munbe Vaa");
                    System.out.println("2: Enna Sona");
                    System.out.print("Enter song number: ");
                    int song = sc.nextInt();

                    if (song == 1) 
					{
                        System.out.println("Now Playing : Munbe Vaa");
                    } 
					else if (song == 2) 
					{
                        System.out.println("Now Playing : Enna Sona");
                    }
					else 
					{
                        System.out.println("Error: Invalid song selection");
                    }

                } 
				 else if (arrType == 2)
				{ 
                    System.out.println("Select a Song:");
                    System.out.println("1: Mersal Arasan");
                    System.out.println("2: Verithanam");
                    System.out.print("Enter song number: ");
                    int song = sc.nextInt();

                    if (song == 1) 
					{
                        System.out.println("Now Playing : Mersal Arasan");
                    } 
					else if (song == 2) 
					{
                        System.out.println("Now Playing : Verithanam");
                    } 
					else 
					{
                        System.out.println("Error: Invalid song selection");
                    }

                } 
				else
				{
                    System.out.println("Error: Invalid music type");
                }
                break;

            case 2: 
                System.out.println(" Anirudh Musical ");
                System.out.println("Select Music Type:");
                System.out.println("1: Melody");
                System.out.println("2: Folk");
                System.out.print("Enter your choice: ");
                int aniType = sc.nextInt();

                if (aniType == 1) 
				{ 
                    System.out.println("Select a Song:");
                    System.out.println("1: Po Nee Po");
                    System.out.println("2: Neeyum Naanum");
                    System.out.print("Enter song number: ");
                    int song = sc.nextInt();

                    if (song == 1) 
					{
                        System.out.println("Now Playing : Po Nee Po");
                    } 
					else if (song == 2) 
					{
                        System.out.println("Now Playing : Neeyum Naanum");
                    } 
					else
					{
                        System.out.println("Error: Invalid song selection");
                    }

                } else if (aniType == 2) {
                    System.out.println("Select a Song:");
                    System.out.println("1: Aaluma Doluma");
                    System.out.println("2: Vaathi Coming");
                    System.out.print("Enter song number: ");
                    int song = sc.nextInt();

                    if (song == 1) 
					{
                        System.out.println("Now Playing : Aaluma Doluma");
                    } 
					else if (song == 2) 
					{
                        System.out.println("Now Playing : Vaathi Coming");
                    } 
					else 
					{
                        System.out.println("Error: Invalid song selection");
                    }

                } else {
                    System.out.println("Error: Invalid music type");
                }
                break;

            case 3: 
                System.out.println(" Yuvan Magic ");
                System.out.println("Select Music Type:");
                System.out.println("1: Melody");
                System.out.println("2: Folk");
                System.out.print("Enter your choice: ");
                int ysrType = sc.nextInt();

                if (ysrType == 1)
				{ 
                    System.out.println("Select a Song:");
                    System.out.println("1: Pogathe");
                    System.out.println("2: Oru Naalil");
                    System.out.print("Enter song number: ");
                    int song = sc.nextInt();

                    if (song == 1)
					{
                        System.out.println("Now Playing : Pogathe");
                    }
					else if (song == 2) 
					{
                        System.out.println("Now Playing : Oru Naalil");
                    }
					else 
					{
                        System.out.println("Error: Invalid song selection");
                    }

                } 
				else if (ysrType == 2)
				{ 
                    System.out.println("Select a Song:");
                    System.out.println("1: Rowdy Baby");
                    System.out.println("2: Mankatha Theme");
                    System.out.print("Enter song number: ");
                    int song = sc.nextInt();

                    if (song == 1) 
					{
                        System.out.println("Now Playing : Rowdy Baby");
                    } 
					else if (song == 2)
					{
                        System.out.println("Now Playing : Mankatha Theme");
                    } 
					else
					{
                        System.out.println("Error: Invalid song selection");
                    }

                }
				else
				{
                    System.out.println("Error: Invalid music type");
                }
                break;

            default:
                System.out.println("Error: Invalid music director");
        }

        
    }
}