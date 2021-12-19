package Ejercicios_Salud;

public class Medico extends ProfesionalSalud{

        protected double matricula;
        protected String especializacion;

        public double getMatricula() {
            return matricula;
        }

        public void setMatricula(double matricula) {
            this.matricula = matricula;
        }

        public String getEspecializacion() {
            return especializacion;
        }

        public void setEspecializacion(String especializacion) {
            this.especializacion = especializacion;
        }

    }

