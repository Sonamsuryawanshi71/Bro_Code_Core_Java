//Connect class Friend

public class StaticKeyword {

    public static void main(String[] args){

//   Static = modifier . A single copy of a variable/method is created and shared The class "owns" the static member

        Friend friend1 = new Friend("Swati");
        Friend friend2 = new Friend("Pooja");
        Friend friend3 = new Friend("Priya");

        System.out.println(Friend.numberOfFriends);
    }
}
