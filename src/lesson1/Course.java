package lesson1;

public class Course {
    private int jump;
    private int run;
    String info;

    public Course(int jump, int run) {
        this.jump = jump;
        this.run = run;
    }


    public String doIt(Team team){
        info = "Команда: "+ team.getName()+ " " + '\n';
        for(Player player: team.getPlayers()){
            info += "Имя игрока: " + player.getName()+ " " + '\n';
            int valueJump = player.getJumpMax();
            int valueRun = player.getRunMax();
            testJump(valueJump);
            testRun(valueRun);

        }
        return info;
    }

    private void testJump(int value){
        if(value<jump) info += "Слабый в прыжках"+ '\n';
        else info += "Сильный в прыжках"+ '\n';
    }

    private void testRun(int value){
        if(value<run) info += "Слабый в беге"+ '\n';
        else info += "Сильный в беге"+ '\n';

    }
}
