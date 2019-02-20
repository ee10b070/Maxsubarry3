package com.amura.Assignment.model;

public class Response {
    int startIndex;
    int endIndex;
    int length;
    int sum;

    public Response(int startIndex, int endIndex, int length, int sum) {
        super();
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.length = length;
        this.sum = sum;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

}
