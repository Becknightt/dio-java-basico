public class MinhaClasse {
  // primeira classe criada em Java e essa classe tem um método executável chamado
  // main, que é o ponto de entrada do programa.

  public static void main(String[] args) {
    String primeiroNome = "Gustavo";
    String segundoNome = "Vaz";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {

    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);

  }

}