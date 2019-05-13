package mrk.hackerrank;

//https://www.hackerrank.com/challenges/designer-pdf-viewer/problem

public class HackerRank26 {

    public int designerPdfViewer(int[] h, String word) {
        return word.chars().map(e -> h[e - 'a']).max().orElse(0) * word.length();
    }
}
