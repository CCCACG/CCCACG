/**
 * A new state is created but the board configuration of the supplied state
 * is copied.
 * 
 * @param state
 *            the 4x4 representation of state to copy
 */
//Source Code
public PuzzleState(int[][] state){
	this.tiles = new int[4][4];
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			this.tiles[i][j] = state[i][j];
		}
	}
}

// Synthesized Code
public PuzzleState(int[][] state)
{
    this.state = new int[4][4];
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            this.state[i][j] = state[i][j];
        }
    }
}