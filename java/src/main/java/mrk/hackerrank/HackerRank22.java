package mrk.hackerrank;

//https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
public class HackerRank22 {
    public String catAndMouse(int x, int y, int z) {
        int catADistance = Math.abs(z - x);
        int catBDistance = Math.abs(z - y);
        return catADistance < catBDistance ? "Cat A" : catBDistance < catADistance ? "Cat B" : "Mouse C";
    }
}
