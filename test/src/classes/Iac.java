package classes;

public class Iac implements Interface {

    public double altura;
    public double quadril;
    public String sexo;


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public void setQuadril(double quadril) {
        this.quadril = quadril;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double calculaIac() {

        double iac = quadril / (altura * (Math.sqrt(altura))) - 18;
        return iac;
    }

    public String resultadoFinal(Interface iiac) {

        double iac = iiac.calculaIac();
        if (sexo.equals("F")) {
            if (iac < 21.0) {
                return "Abaixo da Adiposidade Normal";
            } else if (iac <= 32.0) {
                return "Adiposidade Normal";
            } else if (iac <= 38.0) {
                return "Sobrepeso";
            } else if (iac > 38.0) {
                return "Obesidade";
            } else{
                return "Valor Inválido";
            }

        }

        if (sexo.equals("M")) {
            if (iac < 8.0) {
                return "Abaixo da Adiposidade Normal";
            } else if (iac <= 20.0) {
                return "Adiposidade Normal";
            } else if (iac <= 25.0) {
                return "Sobrepeso";
            } else if (iac > 25.0) {
                return "Obesidade";
            }
        }
        return "Valor inválido";
    }
}





