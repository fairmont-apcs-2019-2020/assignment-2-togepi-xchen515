public class TogepiBoard extends Board {

	/**
	 * Creates a new <code>PokeBoard</code> with the specified number of rows and columns.
	 */
	public TogepiBoard() 
	{
		// Call the Board constructor to make an 8x4 Board
	 	super(6, 6);
	 	newGame(false);
	 	setTitle("PokemonCode Assignment 2");
	 	setInitialText("Why did the Togepi cross the Board?");
	}
	

	/**
	 * Initial placement of all PokeThings in the PokeBoard
	 */
	@Override
	public void newGame(boolean repaint)
	{
		super.newGame(repaint);
		
		// Create a TogepiThing at 0, 0
	 	TogepiThing togepi = new TogepiThing();
	 	togepi.setLocation(0, 0);
	 	add(togepi);
	}
}