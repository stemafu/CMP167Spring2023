
public class Team {
	
	/* We know that a team consists of people
	 * 
	 */
	private Person [] teamMembers = new Person[40];
	private String name = "";
	private static int playerCount = 0; // this is not good yet
	
	// Default constructor
	public Team() {
		teamMembers = new Person[40];
		playerCount = 0;
		name = "";
	}
	
	public Team(String name) {
		teamMembers = new Person[40];
		playerCount = 0;
		this.name = name;
	}	
	
	/* The following method is used to add 
	 * players to the team.
	 */
	public void addPlayer(Person player) {
		/* because teamsMembers is an array, we have to 
		 * resize the array whenever it is full.
		 */
		teamMembers[playerCount] = player;
		playerCount++;
	}
	
	/* remove the last player that was added in the array.
	 * 
	 */
	public Person removeLastPlayer() {
		Person playerToRemove = teamMembers[playerCount - 1];
		playerCount--;
		return playerToRemove;
	}
	
	public Person removePlayerAtIndex(int index) {
		if(index < 0 || index >= playerCount) {
			return null;
		}else {
			
			Person playerToRemove = teamMembers[index];
			
			for(int i = index; (i < playerCount) && (i < teamMembers.length); i++)
			{
				teamMembers[i] = teamMembers[i + 1];
			}
			playerCount--;
			return playerToRemove;
		}
	}
	
	public Person removeFirstPlayer() {
		return removePlayerAtIndex(0);
	}
	
	public void diplayTeam() {
		System.out.println(this.name);
		
		for(int i = 0; i < playerCount; i++) {
		  teamMembers[i].display();
		}
	}
	

	public static void main(String[] args) {
		
		Team team1 = new Team("New York Greats");
		
		// String newName, int newAge, double newWeight,
		//double newHeight, String newEyeColor
		Person player1 = new Person("Isaac", 19, 150.0, 5.8, "brown" );
		Person player2 = new Person("J", 20, 150.0, 5.8, "brown" );
		Person player3 = new Person("Peter", 20, 150.0, 5.8, "brown" );
		Person player4 = new Person("Pan", 20, 150.0, 5.8, "brown" );
		Person player5 = new Person("Wonder Woman", 20, 150.0, 5.8, "brown" );
		
		team1.addPlayer(player1);
		team1.addPlayer(player2);
		team1.addPlayer(player3);
		team1.addPlayer(player4);
		team1.addPlayer(player5);
		
		team1.diplayTeam();
		team1.removeLastPlayer(); 
		
		team1.diplayTeam();

	}

}
