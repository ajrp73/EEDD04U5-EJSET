public class MiClase {
    int ai;
    String ac;

    public MiClase(){
        ai= 1;
        ac= "";
    }

    public MiClase(int aip, String acp) {
        ai = aip;
        ac = acp;
    }
    public MiClase(String aic, int aip){
        ai= 20*aip;
        ac= aic;
    }

    // mc = new MiClase(2, "pepe")

    public MiClase(int aip1, int aip2, String acp1, String acp2){
        ai= aip1 + aip2;
        ac= acp1 + acp2;
    }

    public int getAi(){return ai;}
    public String getAc(){return ac;}

    public void setAi(int aip){ai = aip;}
    public void setAc(String acp){ac= acp;}

    @Override
    public String toString(){
        return "(" + ai + ", " + ac + ")";
    }



}
