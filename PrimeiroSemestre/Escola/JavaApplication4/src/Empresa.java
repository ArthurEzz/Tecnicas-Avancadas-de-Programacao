public class Empresa {
    public static void main(String[] args){
    
        Gerente g = new Gerente();
        Vendedor v = new Vendedor();
        Cliente c = new Cliente();
        
        v.setNome("Maria");
        v.setIdade(18);
        v.setSalario(4000);
        v.setValorVendas(100);
        
        c.setNome("Joao");
        c.setAnoNascim(2002);
        
        g.setNomeGerente("Carlos Eduardo");
        
        
       System.out.println(
               "--VENDEDOR-- \nNome de Vendedor: " + v.getNome() + 
               "\nSua idade: " + v.getValorVendas()+ 
               "\nSeu salario: " + v.getSalario() + 
               "\nValor de vendas: " + v.getValorVendas());
       System.out.println(
               "--CLIENTE-- \nNome de Cliente: " + c.getNome() + 
               "\nAno de Nascimento: " + c.getAnoNascim());
       System.out.println(
               "--GERENTE-- \nNome de Gerente: " + g.getNomeGerente());
    }
}
