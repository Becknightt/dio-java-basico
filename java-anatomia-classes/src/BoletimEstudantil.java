public class BoletimEstudantil { // essa é a classe.

  // segunda classe criada em Java e essa classe tem um método executável chamado
  // main, que é o ponto de entrada do programa.

  public static void main(String[] args) { // Main é o método.

    // dentro desse método temos o fluxo de execução do programa.
    int mediaFinal = 3;
    if (mediaFinal < 6)
      System.out.println("Reprovado"); // dentro do fluxo teremos uma ação que será executada caso a condição seja
                                       // verdadeira.
    else if (mediaFinal == 6)
      System.out.println("Prova Minerva"); // dentro do fluxo teremos uma ação que será executada caso a condição seja
                                           // verdadeira.
    else
      System.out.println("Aprovado"); // dentro do fluxo teremos uma ação que será executada caso a condição seja
                                      // verdadeira.

  }
}