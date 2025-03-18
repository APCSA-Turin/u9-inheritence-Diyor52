package Own;

public class Basketball extends Sports{
    private String MVP;

    public Basketball(String name, String team, String MVP){
        super(name,team);
        this.MVP = MVP; 
    }

    public String getMVP(){
        return MVP;
    }

    public void assists(){
        System.out.println("What an assist");
    }

    public void rebounds(){
        System.out.println("What A REBOUNDDD");
    }

    public void points(){
        System.out.println("SPLASH FOR THE 3 POINTS!!!");
    }
}
