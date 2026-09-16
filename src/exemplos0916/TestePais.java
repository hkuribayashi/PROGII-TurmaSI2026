import exemplos0916.Pais;

public void exibirMaiorDensidadePopulacional(Pais[] paises){

}

public void exibirMenorDensidadePopulacional(Pais[] paises){

}

public void exibirMediaDensidadePopulacional(Pais[] paises){

}

public void exibirAcimaMediaDensidadePopulacional(Pais[] paises){

}

void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe a quantidade de países: ");
    int quantidade = sc.nextInt();
    Pais[] paises = new Pais[quantidade];
    for(int i=0; i < quantidade; i++){
        IO.println("Informe o Código do País:");
        String codigo = sc.next();
        IO.println("Informe o Nome do País:");
        String nome = sc.next();
        IO.println("Informe a População do País:");
        Integer populacao = sc.nextInt();
        IO.println("Informe a Dimensão Territorial do País:");
        Double dimensao = sc.nextDouble();
        paises[i] = new Pais(codigo,nome,populacao,dimensao);
    }

    exibirMaiorDensidadePopulacional(paises);
    exibirMenorDensidadePopulacional(paises);
    exibirMediaDensidadePopulacional(paises);
    exibirAcimaMediaDensidadePopulacional(paises);
}