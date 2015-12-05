import java.util.Date;

/**
 ** Created  on 12/05/15.
 * Implemented by nesrinehanane
 * */
 public class Medecin extends Personne{
    
    private Date dateIntegration;

    public Medecin(int id,String name, String firstName,String mail,int phoneNumber,String adresse_given[], Date dateIntegration) {
        super(id,name, firstName, mail, phoneNumber,adresse_given);
        this.dateIntegration=dateIntegration;
    }


    /**
     * @return the dateIntegration
     */
    public Date getDateIntegration() {
        return dateIntegration;
    }

    /**
     * @param dateIntegration the dateIntegration to set
     */
    public void setDateIntegration(Date dateIntegration) {
        this.dateIntegration = dateIntegration;
    }
    
    
    
 
   
    
}
