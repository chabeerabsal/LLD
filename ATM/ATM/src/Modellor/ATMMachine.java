package Modellor;

public class ATMMachine {
    public void setTwoK(int twoK) {
        this.twoK = twoK;
    }

    public void setFivehundred(int fivehundred) {
        this.fivehundred = fivehundred;
    }

    public void setHundred(int hundred) {
        this.hundred = hundred;
    }

    private int twoK=2;
    private int fivehundred=2;
    private int hundred=3;

    public int getTwoK() {
        return twoK;
    }

    public int getFivehundred() {
        return fivehundred;
    }

    public int getHundred() {
        return hundred;
    }


}
