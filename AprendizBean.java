public class AprendizBean {
   private String primernombre;
   private String apellidos;
   private String cedula;

   public String getPrimerNombre () {
      return primernombre;
   }

   public void setPrimerNombre (String nombre) {
      this.primernombre = nombre;
   }

   public String getApellidos () {
      return apellidos;
   }

   public void setApellidos (String apellidos) {
      this.apellidos = apellidos;
   }

   public String getCedula () {
      return cedula;
   }

   public void setCedula (String cedula) {
      this.cedula = cedula;
   }

   public void verAprendiz () {
      System.out.println(primernombre + " " + apellidos + ", es la actual estudiante");
   }
}