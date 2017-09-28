package capaLogica;

public class Medico {
    //código, nombre completo, email y especialidad, teléfono y cédula.
    private String codigo;
    private String nombreCompletoMedico;
    private String cedula;
    private String emailMedico;
    private String especializacion;
    private String telefono;
    
    
    /**
     * 
     * @param pCodigo
     * @param pNombreCompletoMedico
     * @param pCedula
     * @param pEmailMedico
     * @param pEspecializacion
     * @param pTelefono 
     */
    public Medico(String pCodigo, String pNombreCompletoMedico, String pCedula, String pEmailMedico, String pEspecializacion, String pTelefono){
        this.codigo = pCodigo;
        this.nombreCompletoMedico = pNombreCompletoMedico;
        this.cedula = pCedula;
        this.emailMedico = pEmailMedico;
        this.especializacion = pEspecializacion;
        this.telefono = pTelefono;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * @param pCodigo the codigo to set
     */
    public void setCodigo(String pCodigo) {
        this.codigo = pCodigo;
    }

    /**
     * @return the nombreCompletoMedico
     */
    public String getNombreCompletoMedico() {
        return this.nombreCompletoMedico;
    }

    /**
     * @param pNombreCompletoMedico the nombreCompletoMedico to set
     */
    public void setNombreCompletoMedico(String pNombreCompletoMedico) {
        this.nombreCompletoMedico = pNombreCompletoMedico;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param pCedula the cedula to set
     */
    public void setCedula(String pCedula) {
        this.cedula = pCedula;
    }

    /**
     * @return the emailMedico
     */
    public String getEmailMedico() {
        return emailMedico;
    }

    /**
     * @param pEmailMedico the emailMedico to set
     */
    public void setEmailMedico(String pEmailMedico) {
        this.emailMedico = pEmailMedico;
    }

    /**
     * @return the especializacion
     */
    public String getEspecializacion() {
        return especializacion;
    }

    /**
     * @param pEspecializacion the especializacion to set
     */
    public void setEspecializacion(String pEspecializacion) {
        this.especializacion = pEspecializacion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param pTelefono the telefono to set
     */
    public void setTelefono(String pTelefono) {
        this.telefono = pTelefono;
    }

    @Override
    public String toString() {
        return "Medico{" + "codigo=" + codigo + "\n" + "nombreCompletoMedico=" + nombreCompletoMedico + "\n" + "cedula=" + cedula + "\n" + "emailMedico=" + emailMedico + "\n" + "especializacion=" + especializacion + "\n" + "telefono=" + telefono + "\n" + '}';
    }
    
    
}
