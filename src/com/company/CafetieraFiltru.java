package com.company;

//import java.util.Vector;

public class CafetieraFiltru extends Electrocasnice {
    ///// date membre

    private String culoare;
    private String tip_cafea;

    ///// metode
    CafetieraFiltru() {
        culoare = "Necunoscut";
        tip_cafea = "Macinata";
        // capacitate

    }

    CafetieraFiltru(String tip_electrocasnice, float pret, Boolean disponibilitate, String model, String brand,
            String rating, String culoare, String tip_cafea) {
        super(tip_electrocasnice, pret, disponibilitate, model, brand, rating);
        this.culoare = culoare;
        this.tip_cafea = tip_cafea;

    }

    public CafetieraFiltru(CafetieraFiltru l) {
        super.setBrand(l.getBrand());
        super.setModel(l.getModel());
        super.setPret(l.getPret());
        super.setDisponibilitate(l.getDisponibilitate());
        super.setTip_electrocasnice(l.getTip_electrocasnice());
        super.setRating(l.getRating());
        this.culoare = l.culoare;
        this.tip_cafea = l.tip_cafea;

    }

    public void setCuloare(String culoare){
        this.culoare =culoare;
    }

    public String getCuloare(){
        return culoare;
    }

    public String toString() {

        return super.toString() + "\n Culoare: " + culoare + "\n Tip cafea: " + tip_cafea;
    }
}