FinalProject
============
CSIS10a - Java Programming Final Project


Blind Draw Tournament Bracket Application


App will take player names and randomize teams of two based on the list of players and number of entries.
Then, the app will organize a bracket system for each round of the tournament. Special considerations:
Best of 3, both a winners and losers bracket because the tournament will be Double elimination. Additional features;
Calculate payouts based on entry fee, and able to keep track of High Scores on the side. 


-BlindDraw class (holds main method)

-Team class (holds team objects; 4 param: player1, player2, seed, bracket designator)

-MatchUp class 

-Bracket class (Holds 3 ArrayLists, and method calls for each round in proper order)

-SeedShuffler class (shuffles playerlist and assigns teams, and seeds)

-WinBracket class (holds the round matchups for winner's bracket)

-LoserBracket clas (holds the round matchups for loser's bracket)

-DrawBracket class (draws the bracket with swing components)
