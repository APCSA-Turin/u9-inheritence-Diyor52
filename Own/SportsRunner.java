package Own;

public class SportsRunner {
    public static void main(String[] args) {
        Sports mySport= new Sports("Baseball", "Chicago Clubs");
        System.out.println(mySport.getNameofSport());
        System.out.println(mySport.getTeam());
        mySport.players(10);
      

       
        Soccer mySoccerClub = new Soccer("Soccer", "Manchester City", "Kun Aguero");
        System.out.println(mySoccerClub.getNameofSport()); // inherited method
        System.out.println(mySoccerClub.getTeam()); // inherited method
        System.out.println(mySoccerClub.getMOTM()); // method ONLY available on Car objects
        mySoccerClub.save(); 
        mySoccerClub.penalty();
        mySoccerClub.players(11);


   

        Basketball myBasketballClub= new Basketball("BasketBall", "Los Angelos Lakers", "Lebron James");
        System.out.println(myBasketballClub.getNameofSport());
        System.out.println(myBasketballClub.getTeam());
        System.out.println(myBasketballClub.getMVP());
        myBasketballClub.assists();
        myBasketballClub.rebounds();
        myBasketballClub.points();
        myBasketballClub.getMVP();
        myBasketballClub.players(10);

    


    
    
    }
}
