public class provateste {
    public static void main(String[] args) { //Construindo um objeto 
        //Instanciando a classe Elevador 
        Elevador e = new Elevador(); 
        e.setMarca("Otis"); 
        e.transportar(1500); 
        System.out.println("Passageiros: "+e.getPassageiros()); 
        System.out.println("Carga: "+e.getCarga()); 
        
    } 
} 
    public class Elevador { 
        private double carga; 
        private String marca; 
        private int passageiros; 
        public void transportar(int passageiros) { 
            if (passageiros >= 0 && passageiros <= 14) { this.passageiros = passageiros; 
                System.out.println("Atribuído com sucesso"); 
            } 
                else { System.out.println("Valor inválido!"); 
            } 
        } 
        public int getPassageiros() 
        { 
            return passageiros; 
        } 
        public void setMarca(String marca) { 
            this.marca = marca; 
        } 
        public String getMarca() { 
            return marca; 
        } 
        public double getCarga() { 
            return carga; 
        } 
        public void transportar(double carga) { 
            if (carga < 0 || carga > 1500) { 
                System.out.println("Valor inválido!"); 
            } 
            else 
            { this.carga = carga; } 
        } 
    } Assinale a alternativa que representa a correta conclusão em relação à estrutura das classes e as suas interações e também a correta saída de informação no console.

