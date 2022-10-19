import java.util.LinkedList;
import java.util.Scanner;
  
public class dsa {


    public static void main(String[] args)
    {
        Scanner random= new Scanner(System.in);
        int numberOfSongs;

        System.out.println("Enter number of song in the playlist");
        numberOfSongs= random.nextInt();


       final LinkedList<String> llist = new LinkedList<>();
        for(int i=0; i<=numberOfSongs;i++){
            String song;
            System.out.println("enter song");
            song=random.nextLine();
            llist.add(song);

        }

        System.out.println(llist);
        String element;
        System.out.println("Enter desired song");
        element=random.nextLine();

      
        
    

   
        int ans = -1;
      
        for (int i = 0; i <=llist.size(); i++) {
  
            String llElement = llist.get(i);
  
         
            if (llElement == element) {
  
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println(
                "Element found at index " + ans);
        }
        boolean answer;
        System.out.println("are u satisfied. YES or NO");
        answer= random.nextBoolean();

      
        boolean yes=true;
        if (answer= yes){
            llist.remove();

        }
        else{System.out.println("play");}

    }
}