public class formulas {
    private int v1 = 0;
    private int v2 = 0;
    private int v3 = 0;

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public void setV2(int v2) {
        this.v2 = v2; 
    }

    public void setV3(int v3) {
        this.v3 = v3;
    }

    public double  areaCir() {
        return (Double) (Math.PI * Math.pow(v1, v1));
    }

    public int areaTri() {
        return (v1 + v2) * v3 / 2;
    }

    public int areaRec() {
        return v1 * v2;
    }

    public int areaPen() {
        return (5 * v1 * v2) / 2;
    }
}
