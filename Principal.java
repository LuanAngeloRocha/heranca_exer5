public class Principal {
    

    public static void main (String args []){
        Novo novo = new Novo();
        Velho velho = new Velho();

        novo.setEndereco("Rua Shin Ititaro Sakuno");
        novo.setPreco(250000);
        novo.setAdicionalPreco(0.2*novo.getPreco());
        System.out.println(novo.getPreco()+novo.getAdicionalPreco());

        velho.setEndereco("Rua Rodolfo Lara");
        velho.setPreco(23000);
        velho.setDescontoPreco(0.1*velho.getPreco());

    System.out.println("Preço imovel Velho:" + (velho.getPreco()-velho.getDescontoPreco()));





    }




    
}
