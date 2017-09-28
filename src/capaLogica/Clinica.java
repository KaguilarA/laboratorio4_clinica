package capaLogica;

import java.util.ArrayList;

public class Clinica {
    //nombre, la cédula jurídica, la dirección y el teléfono.
    private String nombreClinica;
    private String cedulaJudirica;
    private String direccionClinica;
    private String telefonoClinica;
    private ArrayList<Medico> listaMedico;
    private ArrayList<Paciente> listaPaciente;
    private ArrayList<Clinica> listaClinica;
    
    public Clinica(){
        listaMedico = new ArrayList<>();
        listaPaciente = new ArrayList<>();
        listaClinica = new ArrayList<>();
    }
    
    /**
     * 
     * @param pNombreClinica
     * @param pCedulaJudirica
     * @param pDireccionClinica
     * @param pTelefonoClinica 
     */
    public Clinica(String pNombreClinica, String pCedulaJudirica, String pDireccionClinica, String pTelefonoClinica){
        this.nombreClinica = pNombreClinica;
        this.cedulaJudirica = pCedulaJudirica;
        this.direccionClinica = pDireccionClinica;
        this.telefonoClinica = pTelefonoClinica;
    }

    
    /**
     * @return the nombreClinica
     */
    public String getNombreClinica() {
        return nombreClinica;
    }

    /**
     * @param pNombreClinica the nombreClinica to set
     */
    public void setNombreClinica(String pNombreClinica) {
        this.nombreClinica = pNombreClinica;
    }

    /**
     * @return the cedulaJudirica
     */
    public String getCedulaJudirica() {
        return cedulaJudirica;
    }

    /**
     * @param pCedulaJudirica the cedulaJudirica to set
     */
    public void setCedulaJudirica(String pCedulaJudirica) {
        this.cedulaJudirica = pCedulaJudirica;
    }

    /**
     * @return the direccionClinica
     */
    public String getDireccionClinica() {
        return direccionClinica;
    }

    /**
     * @param pDireccionClinica the direccionClinica to set
     */
    public void setDireccionClinica(String pDireccionClinica) {
        this.direccionClinica = pDireccionClinica;
    }

    /**
     * @return the telefonoClinica
     */
    public String getTelefonoClinica() {
        return telefonoClinica;
    }

    /**
     * @param pTelefonoClinica the telefonoClinica to set
     */
    public void setTelefonoClinica(String pTelefonoClinica) {
        this.telefonoClinica = pTelefonoClinica;
    }
    
    /**
     * @return the listaClinica
     */
    public ArrayList<Clinica> getListaClinica() {
        return listaClinica;
    }

    /**
     * @return the listaMedico
     */
    public ArrayList<Medico> getListaMedico() {
        return this.listaMedico;
    }

    /**
     * @return the listaPaciente
     */
    public ArrayList<Paciente> getListaPaciente() {
        return this.listaPaciente;
    }
    
    
    
    
    
    //Registrar clinica
    /**
     * 
     * @param pNombreClinica
     * @param pCedulaJudirica
     * @param pDireccionClinica
     * @param pTelefonoClinica 
     */
    public void registrarClinica(String pNombreClinica, String pCedulaJudirica, String pDireccionClinica, String pTelefonoClinica){
        Clinica objClinica = new Clinica(pNombreClinica, pCedulaJudirica, pDireccionClinica, pTelefonoClinica);
        if(buscarClinica(pNombreClinica) == false ){
            listaClinica.add(objClinica);
        }
    } 
    
    //Buscar clinica
    /**
     * 
     * @param pNombreClinica
     * @return existe
     */
     public Boolean buscarClinica(String pNombreClinica){
         
         boolean existe = false;
        
        for(Clinica clinicaObj : listaClinica){
            if(clinicaObj.nombreClinica.equals(pNombreClinica)){
                existe = true;
            }
        }
        return existe;
     }
    
    //Registrar paciente
     /**
      * 
      * @param pNombreCompleto
      * @param pCedula
      * @param pDireccion
      * @param pEmail
      * @param pTelefono 
      */
    public void registrarPacientes(String pNombreCompleto, String pCedula, String pDireccion, String pEmail, String pTelefono){
        Paciente objPaciente = new Paciente(pNombreCompleto, pCedula, pDireccion, pEmail, pTelefono);
        if(buscarPaciente(pCedula) == false ){
            listaPaciente.add(objPaciente);
        }
    } 
   
     //Buscar paciente
    /**
     * 
     * @param pCedula
     * @return existe
     */
     public Boolean buscarPaciente(String pCedula){
         
         boolean existe = false;
        
        for(Paciente pacienteObj : listaPaciente){
            if(pacienteObj.getCedula().equals(pCedula)){
                existe = true;
            }
        }
        return existe;
     }
     
     //Registrar medico
     /**
      * 
      * @param pCodigo
      * @param pNombreCompletoMedico
      * @param pCedula
      * @param pEmailMedico
      * @param pEspecializacion
      * @param pTelefono 
      */
     public void registrarMedico(String pCodigo, String pNombreCompletoMedico, String pCedula, String pEmailMedico, String pEspecializacion, String pTelefono){
        Medico objMedico = new Medico(pCodigo, pNombreCompletoMedico, pCedula, pEmailMedico, pEspecializacion, pTelefono);
        if(buscarMedico(pCedula) == false ){
            listaMedico.add(objMedico);
        }
    } 
     //Buscar medico
     /**
      * 
      * @param pCedula
      * @return existe
      */
     public Boolean buscarMedico(String pCedula){
         
         boolean existe = false;
        
        for(Medico medicoObj : listaMedico){
            if(medicoObj.getCedula().equals(pCedula)){
                existe = true;
            }
        }
        return existe;
     }

    @Override
    public String toString() {
        return "Clinica{" + "nombreClinica=" + nombreClinica + "\n" + "cedulaJudirica=" + cedulaJudirica + "\n" + "direccionClinica=" + direccionClinica + "\n" + "telefonoClinica=" + telefonoClinica + "\n" + '}';
    }
     
     
}
