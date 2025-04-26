
package ejercicio3s04;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String idAlumno;
    private String nombreAlumno;
    private String direccionAlumno;
    private String telefonoAlumno;
    private String emailAlumno;
    private List<Matricula> matriculas;

    public Alumno(String idAlumno, String nombreAlumno, String direccionAlumno, String telefonoAlumno, String emailAlumno) {
        this.idAlumno = idAlumno;
        this.nombreAlumno = nombreAlumno;
        this.direccionAlumno = direccionAlumno;
        this.telefonoAlumno = telefonoAlumno;
        this.emailAlumno = emailAlumno;
        this.matriculas = new ArrayList<>();
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getDireccionAlumno() {
        return direccionAlumno;
    }

    public void setDireccionAlumno(String direccionAlumno) {
        this.direccionAlumno = direccionAlumno;
    }

    public String getTelefonoAlumno() {
        return telefonoAlumno;
    }

    public void setTelefonoAlumno(String telefonoAlumno) {
        this.telefonoAlumno = telefonoAlumno;
    }

    public String getEmailAlumno() {
        return emailAlumno;
    }

    public void setEmailAlumno(String emailAlumno) {
        this.emailAlumno = emailAlumno;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public void matricularEnSeccion(Matricula matricula) {
        if (matricula != null) {
            this.matriculas.add(matricula);
        }
    }
}
