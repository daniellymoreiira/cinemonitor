class Teste {

  public void executar () {

    Filme filme = new Filme();
    filme.setTitulo("PANTERA NEGRA");
    filme.setAno(2018);
    filme.setTipo (3);

    System.out.println("Titulo : " + filme.getTitulo());
    System.out.println("Ano : " + filme.getAno());
    System.out.println("tipo : " + filme.getTipo());
  }

}