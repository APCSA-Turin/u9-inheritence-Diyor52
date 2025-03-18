package Own;

public class Sports {
    private String name;
    private String team;
   

    public Sports(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public String getNameofSport(){
        return name;
    }

    public String getTeam(){
        return team;
    }


    public void players(int people){
        System.out.println("There are " + " " + people + " on each team");
    }



}
