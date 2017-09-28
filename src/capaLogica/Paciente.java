package capaLogica;

public class Paciente {
   //cédula, nombre completo,dirección, email y teléfono.
    private String cedula;
    private String nombreCompleto;
    private String direccion;
    private String email;
    private String telefono;
    
    /**
     * 
     * @param pCedula
     * @param pNombreCompleto
     * @param pDireccion
     * @param pEmail
     * @param pTelefono 
     */
    public Paciente(String pCedula, String pNombreCompleto, String pDireccion, String pEmail, String pTelefono){
        this.nombreCompleto = pNombreCompleto;
        this.cedula = pCedula;
        this.direccion = pDireccion;
        this.email = pEmail;
        this.telefono = pTelefono;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return this.cedula;
    }

    /**
     * @param pCedula the cedula to set
     */
    public void setCedula(String pCedula) {
        this.cedula = pCedula;
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    /**
     * @param pNombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String pNombreCompleto) {
        this.nombreCompleto = pNombreCompleto;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return this.direccion;
    }

    /**
     * @param pDireccion the direccion to set
     */
    public void setDireccion(String pDireccion) {
        this.direccion = pDireccion;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param pEmail the email to set
     */
    public void setEmail(String pEmail) {
        this.email = pEmail;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return this.telefono;
    }

    /**
     * @param pTelefono the telefono to set
     */
    public void setTelefono(String pTelefono) {
        this.telefono = pTelefono;
    } 

    @Override
    public String toString() {
        return "Paciente{" + "cedula=" + cedula + "\n" + "nombreCompleto=" + nombreCompleto + "\n" + "direccion=" + direccion + "\n" + "email=" + email + "\n" + "telefono=" + telefono + "\n" + '}';
    }
    
    
}
