package objetos;

/*
------------------------------------------------------------
> MODULE-ASSIGNMENTS

- AUTHOR:     Doramas García Jorge
- EMAIL:      doramas.dev@pm.me
- GITHUB:     https://github.com/doramasgarciajorge
- REPOSITORY: https://github.com/doramasgarciajorge/module-assignments
------------------------------------------------------------
*/

public class Especialidad {
    
    private int idEspecialidad;
    private String descripcion;

    public Especialidad() {
    }
    
    public Especialidad(String descripcion) {
        this.descripcion = descripcion;
    }

    public Especialidad(int idEspecialidad, String descripcion) {
        this.idEspecialidad = idEspecialidad;
        this.descripcion = descripcion;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "idEspecialidad=" + idEspecialidad + ", descripcion=" + descripcion + '}';
    }
    
    public String[] toArrayStrings() {
        return new String[] {String.valueOf(this.idEspecialidad), this.descripcion};
    }
    
}