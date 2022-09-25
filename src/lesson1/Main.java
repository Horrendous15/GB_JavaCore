package lesson1;

public class Main {

    public static void main(String[] args) {
        Player[] player = new Player[3];
        Team team = new Team("team1", player);
        player[0] = new Player("player1", 2, 7);
        player[1] = new Player("player2", 4, 11);
       player[2] = new Player("player3", 3, 9);

        Course course = new Course(3, 10);
        String result = course.doIt(team);
        System.out.println(result);
    }
}
