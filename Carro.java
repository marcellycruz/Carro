public class Carro{
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int quilometragem;

    public Carro(){

    }
    public Carro(String marca, String modelo, int ano, int km){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = ano;
        this.quilometragem = km;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAnoFabricacao(int ano){
        this.anoFabricacao = ano;
    }

    public void setQuilometragem(int km){
        this.quilometragem = km;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }

    public int getQuilometragem(){
        return quilometragem;
    }

    public void adicionarQuilometragem(int quilometros){
        this.quilometragem += quilometros;
    }

    public void subtrairQuilometragem(int quilometros){
        this.quilometragem -= quilometros;
    }

    @Override
    public String toString(){
        return "Carro [Marca: " + marca + ", Modelo: " + modelo + 
               ", Ano de Fabricação: " + anoFabricacao + 
               ", Quilometragem: " + quilometragem + "]";
    }
}