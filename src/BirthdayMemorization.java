import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BirthdayMemorization {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        boolean bol = false;
        ArrayList<Friend> friendList = new ArrayList<>();
        ArrayList<String> finalNameList = new ArrayList<>();
        String[] input;
        Friend newFriend;

        for(int i = 0; i < n ; i++){
            input = console.nextLine().split(" ");
            newFriend = new Friend(input[0],Integer.parseInt(input[1]),input[2]);

            for(int u = 0; u < friendList.size(); u++){
                bol = false;
                if(friendList.get(u).birthDay.equals(newFriend.birthDay)){
                    if(friendList.get(u).friendship < newFriend.friendship){
                        friendList.remove(friendList.get(u));
                        friendList.add(newFriend);
                    }
                    bol = true;
                    break;
                }
            }
            if(!bol){
                friendList.add(newFriend);
            }
        }
        for(Friend friend : friendList){
            finalNameList.add(friend.name);
        }
        Collections.sort(finalNameList);
        System.out.println(finalNameList.size());
        for(String s : finalNameList){
            System.out.println(s);
        }
    }
}
class Friend{
    String name;
    int friendship;
    String birthDay;

    Friend(String name,int friendship,String birthDay){
        this.name = name;
        this.friendship = friendship;
        this.birthDay = birthDay;
    }
}