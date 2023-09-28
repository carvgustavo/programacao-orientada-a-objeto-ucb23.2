public abstract class Veiculo {
    private String marca;
    private String modelo;
    private String motor;
    private int ano;
    private float valor;
    private String categoria;

    public Veiculo(String marca, String modelo, String motor, int ano, float valor, String categoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.ano = ano;
        this.valor = valor;
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMotor(){
        return motor;
    }

    public int getAno() {
        return ano;
    }

    public float getValor(){
        return valor;
    }

    public String getCategoria(){
        return categoria;
    }
}
