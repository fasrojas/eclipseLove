package br.com.dynamicdev.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class SelectBooleanView {

    private boolean maior1;
    private boolean maior2;
    private boolean maior3;
    private boolean maior4;

    private boolean menor1;
    private boolean menor2;
    private boolean menor3;
    private boolean menor4;

    private boolean ordemalfabetica;

    public boolean isMaior1() {
        return maior1;
    }

    public void setMaior1(boolean maior1) {
        this.maior1 = maior1;
    }

    public boolean isMaior2() {
        return maior2;
    }

    public void setMaior2(boolean maior2) {
        this.maior2 = maior2;
    }

    public boolean isMaior3() {
        return maior3;
    }

    public void setMaior3(boolean maior3) {
        this.maior3 = maior3;
    }

    public boolean isMaior4() {
        return maior4;
    }

    public void setMaior4(boolean maior4) {
        this.maior4 = maior4;
    }

    public boolean isMenor2() {
        return menor2;
    }

    public void setMenor2(boolean menor2) {
        this.menor2 = menor2;
    }

    public boolean isMenor1() {
        return menor1;
    }

    public void setMenor1(boolean menor1) {
        this.menor1 = menor1;
    }

    public boolean isMenor3() {
        return menor3;
    }

    public void setMenor3(boolean menor3) {
        this.menor3 = menor3;
    }

    public boolean isMenor4() {
        return menor4;
    }

    public void setMenor4(boolean menor4) {
        this.menor4 = menor4;
    }

    public boolean isOrdemalfabetica() {
        return ordemalfabetica;
    }

    public void setOrdemalfabetica(boolean ordemalfabetica) {
        this.ordemalfabetica = ordemalfabetica;
    }
}