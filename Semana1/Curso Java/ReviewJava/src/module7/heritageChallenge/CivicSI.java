package module7.heritageChallenge;

public class CivicSI extends Car  implements Sports {


    CivicSI() {
        super(400);
    }

    CivicSI (int VELOCIDADE_MAX){
        super(VELOCIDADE_MAX);
        setDelta(10);
    }

    @Override
    public void abrirVtec() {
        setDelta(15);
    }

    @Override
    public void fecharVtec() {
        setDelta(10);
    }
}
