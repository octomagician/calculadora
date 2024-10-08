package calculos;

public class operacion {

    private double valor1;
    private double valor2;
    private char tipo;

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double hacerOperacion() {
        switch (tipo) {
            case '+':
                return valor1 + valor2;
            case '-':
                return valor1 - valor2;
            case '*':
                return valor1 * valor2;
            case '/':
                return valor1 / valor2;
            default:
                return 0;
        }
    }

    public void reiniciar() {
        valor1 = 0;
        valor2 = 0;
        tipo = '\0'; // Carácter nulo
    }

}
