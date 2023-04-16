package edu.howardcc.cmsy167.simplemap;
public class Line {
    private int lineNum;
    private String contents;

    public int getLineNum() {
        return lineNum;
    }

    public String getContents() {
        return contents;
    }

    public Line(String contents, int lineNum){

        this.contents = contents;
        this.lineNum = lineNum;
    }
}
