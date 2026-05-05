
package associacao;

public class Main {
    public static void main (String args[]) {
    Endereco e = new Endereco();
    e.setRua("Luiz Francisco de Castro 305");
    e.setBairro("Jardim Brilhante");
    e.setCep("19910717");
    Cliente c = new Cliente();
    c.setNome("Arthur Pinheiro Rodrigues");
    c.setEndereco(e);
    
    System.out.println("Seu nome e: " + c.getNome() + "\ne a sua rua e: " + c.getEndereco().getRua());
    }
}
