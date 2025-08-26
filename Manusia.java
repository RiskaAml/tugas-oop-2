package tugas2;

public class Manusia {

    /**
     * @return the warnaKulit
     */
    protected String getWarnaKulit() {
        return warnaKulit;
    }

    /**
     * @param warnaKulit the warnaKulit to set
     */
    protected void setWarnaKulit(String warnaKulit) {
        this.warnaKulit = warnaKulit;
    }

    /**
     * @return the pasangan
     */
    protected boolean isPasangan() {
        return pasangan;
    }

    /**
     * @param pasangan the pasangan to set
     */
    protected void setPasangan(boolean pasangan) {
        this.pasangan = pasangan;
    }
    private String warnaKulit;
    private boolean pasangan;
    
    public Manusia(String warnaKulit,boolean pasangan){
        this.warnaKulit = warnaKulit;
        this.pasangan = pasangan;
    }
    
}
