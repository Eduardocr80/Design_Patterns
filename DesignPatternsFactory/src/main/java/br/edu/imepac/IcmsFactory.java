package br.edu.imepac;

public class IcmsFactory {
public I.CalculoRegiao IcmsPorEstado(String nomeEstado){
    if (nomeEstado.equalsIgnoreCase("ICMS_MG")) {
        return new IcmsMG();
    } else if (nomeEstado.equalsIgnoreCase("ICMS_SP")) {
        return new IcmsSP();
    }else if (nomeEstado.equalsIgnoreCase("ICMS_PR")){
        return new IcmsPR();
    }else if(nomeEstado.equalsIgnoreCase("ICMS_AM")){
        return new IcmsAM();
    }else {
        return null;
    }

}

}
