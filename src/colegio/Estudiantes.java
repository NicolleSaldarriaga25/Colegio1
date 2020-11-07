package colegio;

import java.util.Date;

//Este es un nuevo comentario
public class Estudiantes {

    private String nombre;//Este es el nombre del estudiante
    private int numeroDeEstudiantes; //Son los estudiantes ingresados
    private String especialidad;// Es en lo que mejor se desempeña el estudiante
    private final Boolean internacional;//Denota si el colegio hace becas o no
    private Date fechaDeIngreso;//La fecha en que ingreso el estudiante
    private Boolean international;
    
    //Este es el constructor de clase

    public Estudiantes(
            String nombre,
            int numeroDeEstudiantes,
            String especialidad,
            Boolean internacional) {
        this.nombre = nombre;
        this.numeroDeEstudiantes = numeroDeEstudiantes;
        this.especialidad = especialidad;
        this.internacional = internacional;
    }

    /**
     * El método aumenta la cantidad de estudinates en el cloegio en 9 y no la
     * conviente en internacional
     */
    public void ampliarPlanta() {
        this.numeroDeEstudiantes += 9;
        this.international=true;
    }

    public Estudiantes(String nombre, int numeroDeEstudiantes, String especialidad, Boolean internacional, Date fechaDeIngreso) {
        this.nombre = nombre;
        this.numeroDeEstudiantes = numeroDeEstudiantes;
        this.especialidad = especialidad;
        this.internacional = internacional;
        this.fechaDeIngreso = fechaDeIngreso;
    }

    /**
     * Este método permite cambiar el nombre de la fábrica y su especialidad
     */
    public void reinaguracion(
            String nuevoNombre,
            String nuevaEspecialidad) {
        this.nombre = nuevoNombre;
        this.especialidad = nuevaEspecialidad;
        this.numeroDeEstudiantes += 1;
    }

    //A partir de esta línea se encuentran los métodos get y set
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeEstudiantes() {
        return numeroDeEstudiantes;
    }

    public void setNumeroDeEstudiantes(int numeroDeEstudiantes) {
        this.numeroDeEstudiantes = numeroDeEstudiantes;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(Date fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getInternacional() {
        return internacional;
    }

    public void setInternacional(Boolean internacional) {
        this.international = internacional;
    }

    public static void main(String[] args) {
        Colegio colegioUno = new Colegio(
                "maria elvinia",
                24,
                new Date(),
                "tecnicos",
                false);
        Colegio colegioDos = new Colegio(
                "alferes real ",
                15,
                new Date(),
                "Bilingue",
                true);

        System.out.println(colegioUno.getNombre());
        System.out.println(colegioUno.getNumeroDeEstudiantes());
        System.out.println(colegioUno.getInternacional());

        colegioUno.ampliarSalones();

        System.out.println(colegioUno.getNombre());
        System.out.println(colegioUno.getNumeroDeEstudinates());
        System.out.println(colegioUno.getInternacional());
    }

    private static class Colegio {

        public Colegio() {
        }

        private Colegio(String alferes_real_, int i, Date date, String bilingue, boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void ampliarSalones() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private boolean getInternacional() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private boolean getNumeroDeEstudiantes() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private boolean getNombre() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private boolean getNumeroDeEstudinates() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    