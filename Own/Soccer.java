package Own;

public class Soccer extends Sports {
    private String MOTM;

    public Soccer(String name, String team, String MOTM){
        super(name, team);
        this.MOTM = MOTM;
    }

    public String getMOTM(){
        return MOTM;
    }

    public void save(){
        System.out.println("WHAT A SAVE" );
    }

    public void penalty(){
        System.out.println("Unfortunate penalty");
    }

}
